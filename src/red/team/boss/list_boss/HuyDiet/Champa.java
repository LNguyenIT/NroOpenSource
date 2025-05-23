package red.team.boss.list_boss.HuyDiet;

import java.util.Random;

import red.consts.ConstPlayer;
import red.s1.boss.Boss;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData;
import red.team.item.Item;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.InventoryServiceNew;
import red.services.ItemService;
import red.services.PlayerService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;


public class Champa extends Boss {
    private long lasttimehakai;
    private int timehakai;

    public Champa() throws Exception {
        super(Util.randomBossId(), BossesData.THAN_HUY_DIET_CHAMPA);
    }

    @Override
    public void reward(Player plKill) {
        int randomDo = (int) new Random().nextInt(Manager.itemIds_TL.length);
        int randomNR = (int) new Random().nextInt(Manager.itemIds_NR_SB.length);
        ItemMap itemMap;
        if (Util.isTrue(50, 100)) {
            if (Util.isTrue(1, 50)) {
                itemMap = Util.ratiItem(zone, 861, 1, this.location.x, this.location.y, plKill.id);
            } else {
                itemMap = Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id);
            }
        } else {
            itemMap = Util.ratiItem(zone, 14, 1, this.location.x, this.location.y, plKill.id);
        }
        if (Util.isTrue(10, 10)) {
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 457, 2, this.location.x+2, this.location.y, plKill.id));
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000+plKill.gender, 1, this.location.x, this.location.y, plKill.id));
        }
        if (Util.isTrue(40, 100)) {

           Item item = ItemService.gI().createNewItem((short) 1108);
           item.itemOptions.add(new Item.ItemOption(30, 0));
           InventoryServiceNew.gI().addItemBag(plKill, item);
        }
        plKill.pointBoss += 0;

        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
    }

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
        if (!this.isDie()) {
            if (!piercing && Util.isTrue(this.nPoint.tlNeDon, 100)) {
                this.chat("Xí hụt");
                return 0;
            }
           if(plAtt != null && plAtt.nPoint.isSieuThan){
                damage = this.nPoint.subDameInjureWithDeff(damage);
            }else{
                damage = this.nPoint.subDameInjureWithDeff(damage / 2);
            }
            if (!piercing && effectSkill.isShielding) {
                if (damage > nPoint.hpMax) {
                    EffectSkillService.gI().breakShield(this);
                }
                damage = 1;
            }
            this.nPoint.subHP(damage);
            if (isDie()) {
                this.setDie(plAtt);
                die(plAtt);
            }
            return damage/2;
        } else {
            return 0;
        }
    }


    @Override
    public void active() {

        if (this.typePk == ConstPlayer.NON_PK) {
            this.changeToTypePK();
        }
        this.huydiet();
        this.attack();
       super.active(); //To change body of generated methods, choose Tools | Templates.
       if (Util.canDoWithTime(st, 1800000)) {
           this.changeStatus(BossStatus.LEAVE_MAP);
        }
    }

   @Override
   public void joinMap() {
       super.joinMap(); //To change body of generated methods, choose Tools | Templates.
       st = System.currentTimeMillis();
   }
   private long st;

    private void huydiet() {
        if (!Util.canDoWithTime(this.lasttimehakai, this.timehakai) || !Util.isTrue(1, 100)) {
            return;
        }
        Player pl = this.zone.getRandomPlayerInMap();
        if (pl == null || pl.isDie()) {
            return;
        }
        // this.nPoint.dameg += (pl.nPoint.dame * 5 / 100);
        // this.nPoint.hpg += (pl.nPoint.hp * 2 / 100);
        // this.nPoint.critg++;
        // this.nPoint.calPoint();
        // PlayerService.gI().hoiPhuc(this, pl.nPoint.hp, 0);
        // pl.injured(null, pl.nPoint.hpMax, true, false);
        // Service.gI().sendThongBao(pl, "Bạn vừa bị " + this.name + " cho bay màu");
        // this.chat(2, "Hắn ta mạnh quá,coi chừng " + pl.name + ",tên " + this.name + " hắn không giống như những kẻ thù trước đây");
        // this.chat("Thật là yếu ớt " + pl.name);
        // this.lasttimehakai = System.currentTimeMillis();
        // this.timehakai = Util.nextInt(20000, 30000);
    }
    



}


