package red.team.boss.list_boss.nhatnguyet;

import java.util.Random;

import red.consts.ConstPlayer;
import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossManager;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.item.Item;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.InventoryServiceNew;
import red.services.Service;
import red.services.SkillService;
import red.services.TaskService;
import red.utils.SkillUtil;
import red.utils.Util;

public class NguyetThan extends Boss {

  public NguyetThan() throws Exception {
    super(BossID.NGUYET_THAN, BossesData1.NGUYET_THAN);
    this.cFlag = 9;
    this.isNhatNguyet = true;
  }

  @Override
  public void reward(Player plKill) {
    Item kiemGoCheck = null;
    try {
      kiemGoCheck = InventoryServiceNew.gI().findItemBag(plKill, 1262);
    } catch (Exception e) {
      // throw new RuntimeException(e);
    }
    if (kiemGoCheck != null) {
      
      InventoryServiceNew.gI().subQuantityItemsBag(plKill, kiemGoCheck, 1);
      Service.gI().sendThongBao(plKill, "Kiếm gỗ đã bị gãy !");
      Service.gI().dropItemMap(this.zone,
          new ItemMap(zone, 1247, 1, this.location.x, this.location.y, plKill.id));
    }else{
        InventoryServiceNew.gI().removeItemBag(plKill, kiemGoCheck);
    }
    plKill.pointBoss += 10;
    TaskService.gI().checkDoneTaskKillBoss(plKill, this);
  }

  @Override
  public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
    this.checkAnThan(plAtt);
    Item kiemGoCheck = null;
    try {
      kiemGoCheck = InventoryServiceNew.gI().findItemBag(plAtt, 1262);
    } catch (Exception e) {
      // throw new RuntimeException(e);
    }
    if ( plAtt != null && (plAtt.cFlag != 10 || kiemGoCheck == null) || plAtt.isNhatNguyet) {// tỉ lệ hụt của thiên sứ
      this.chat("|2|Không có kiếm mà đòi đánh ta hả");
      damage = 0;

    }
    if (!this.isDie()) {
      damage = this.nPoint.subDameInjureWithDeff(damage);
      if (!piercing && effectSkill.isShielding) {
        if (damage > nPoint.hpMax) {
          EffectSkillService.gI().breakShield(this);
        }

      }

      this.nPoint.subHP(damage);
      if (isDie()) {
        this.setDie(plAtt);
        die(plAtt);
      }
      return damage;
    } else {
      return 0;
    }
  }

  @Override
  public void active() {
    this.attack();
    this.changeToTypeNonPK();
    // Service.gI().changeFlag(this, 9);
    if (Util.canDoWithTime(st, 1800000)) {
      this.changeStatus(BossStatus.LEAVE_MAP);
    }
    if (BossManager.gI().getBossById(BossID.NHAT_THAN) == null) {
      this.leaveMap();
    }
    if (System.currentTimeMillis() - lastTimeBlame > 10000) {
      this.chat("|2|Hãy về phe của ta nếu không ngươi sẽ phải chịu hậu quả");
      lastTimeBlame = System.currentTimeMillis();
    }
    
  }

  @Override
  public void attack() {
    if (Util.canDoWithTime(this.lastTimeAttack, 100)) {
      this.lastTimeAttack = System.currentTimeMillis();
      try {
        Player pl = getPlayerAttack();
        if (pl == null || pl.isDie()) {
          return;
        }
        this.playerSkill.skillSelect = this.playerSkill.skills
            .get(Util.nextInt(0, this.playerSkill.skills.size() - 1));
        if (Util.getDistance(this, pl) <= this.getRangeCanAttackWithSkillSelect()) {
          if (Util.isTrue(5, 20)) {
            if (SkillUtil.isUseSkillChuong(this)) {
              this.moveTo(pl.location.x + (Util.getOne(-1, 1) * Util.nextInt(20, 200)),
                  Util.nextInt(10) % 2 == 0 ? pl.location.y : pl.location.y);
            } else {
              this.moveTo(pl.location.x + (Util.getOne(-1, 1) * Util.nextInt(10, 40)),
                  Util.nextInt(10) % 2 == 0 ? pl.location.y : pl.location.y );
            }
          }
          SkillService.gI().useSkill(this, pl, null, null);
          checkPlayerDie(pl);
        } else {
          if (Util.isTrue(1, 2)) {
            this.moveToPlayer(pl);
          }
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }

  @Override
  public void joinMap() {
    super.joinMap(); // To change body of generated methods, choose Tools | Templates.
    st = System.currentTimeMillis();
  }

  private long st;
  private long lastTimeBlame;
}
