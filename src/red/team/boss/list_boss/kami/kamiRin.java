/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.team.boss.list_boss.kami;
import java.util.Random;
import red.consts.ConstMob;
import red.consts.ConstPlayer;
import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossManager;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData;
import red.team.boss.list_boss.kami.kamiLoc;
import red.team.map.ItemMap;
import red.team.mob.Mob;
import red.team.player.Player;
import red.services.EffectSkillService;
import red.services.ItemService;
import red.services.PlayerService;
import red.services.Service;
import red.services.TaskService;
import red.team.server.Manager;
import red.utils.Util;


public class kamiRin extends Boss {

    public boolean callRin;

    public kamiRin() throws Exception {
        super(BossID.KAMIRIN, BossesData.KAMIRIN);
    }

    @Override
    public void reward(Player plKill) {
        ItemMap it = new ItemMap(this.zone, 457, 1, this.location.x, this.zone.map.yPhysicInTop(this.location.x,
                this.location.y - 24), plKill.id);
        Service.gI().dropItemMap(this.zone, it);
        short randomDo = (short) new Random().nextInt(Manager.itemIds_TL.length - 1);

        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(BossManager.ratioReward, 100)) {
            if (Util.isTrue(3, 5)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
            }
            if (Util.isTrue(5, 10)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 344, 1, this.location.x + 2, this.location.y, plKill.id));
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000 + plKill.gender, 1, this.location.x, this.location.y, plKill.id));
            }
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone, Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));

        } else {
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, Util.nextInt(925, 931), 1, this.location.x, this.location.y, plKill.id));
        }
        Service.gI().dropItemMap(this.zone,
                Util.ratiItem(zone, 722, 1, this.location.x, this.location.y, plKill.id));
        Service.gI().sendThongBaoAllPlayer("Chết rồi GOKU đã rơi vào tay "+plKill.name);
        plKill.pointBoss += 0;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        plKill.pointBoss += 2;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
    }

   @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
 this.checkAnThan(plAtt);
        if (Util.isTrue(50, 100) && plAtt != null) {//tỉ lệ hụt của thiên sứ
            Util.isTrue(this.nPoint.tlNeDon, 100);
            
            damage = 0;

        }
        if (!this.isDie()) {
            if (!piercing && Util.isTrue(this.nPoint.tlNeDon, 100)) {
                this.chat("Xí hụt");
                return 0;
            }
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
        super.active(); //To change body of generated methods, choose Tools | Templates.
        if (Util.canDoWithTime(st, 600000)) {
            this.changeStatus(BossStatus.LEAVE_MAP);
        }
    }
     
    @Override
    public void joinMap() {
        super.joinMap(); //To change body of generated methods, choose Tools | Templates.
        st = System.currentTimeMillis();
    }
    private long st;
}

/**
 * Vui lòng không sao chép mã nguồn này dưới mọi hình thức. Hãy tôn trọng tác
 * giả của mã nguồn này. Xin cảm ơn! - Lucy
 */
