package red.team.boss.list_boss.brolybase;

import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossManager;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.ItemService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;

public class Brolybase extends Boss {

    public Brolybase() throws Exception {
        super(BossID.BROLY_BASE, BossesData.BROLY_BASE_1, BossesData.BROLY_BASE_2, BossesData.BROLY_BASE_3);
    }

    @Override
    public void reward(Player plKill) {
        short randomDo = (short) new Random().nextInt(Manager.itemIds_TL.length - 1);
        short randomNR = (short) new Random().nextInt(Manager.itemIds_NR_SB.length - 1);

        if (Util.isTrue(15, 20)) {
//                int[] manhthuong = new int[] { 1066, 1067, 1068, 1069, 1070 };  
            int[] manhhiem = new int[]{561};
            int[] gang = new int[]{562, 564, 566};
            int randomG = new Random().nextInt(gang.length - 1);
//                int randomAWJ = new Random().nextInt(manhthuong.length-1);
            int randomGR = new Random().nextInt(manhhiem.length - 1);
            if (Util.isTrue(70, 100)) {
//                    Service.gI().dropItemMap(this.zone,
//                            Util.manhTS(zone, manhthuong[randomAWJ], 1, this.location.x, this.location.y, plKill.id));
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, (byte) 15, 1, this.location.x + 2, this.location.y, plKill.id));
            } else {
                Service.gI().dropItemMap(this.zone,
                        Util.manhTS(zone, manhhiem[randomGR], 3, this.location.x, this.location.y, plKill.id));
            }
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, 992, 1, this.location.x, this.location.y, plKill.id));
            if (Util.isTrue(5, 100)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, gang[randomG], 1, this.location.x, this.location.y, plKill.id));
            }
        } else {
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1,
                    this.location.x, this.location.y, plKill.id));
        }
        plKill.pointBoss += 2;
        ItemService.gI().CheckDoneVeTL(plKill);
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    @Override
    public void active() {
        super.active(); // To change body of generated methods, choose Tools | Templates.
        if (Util.canDoWithTime(st, 1800000)) {
            this.changeStatus(BossStatus.LEAVE_MAP);
        }
    }

    @Override
    public void joinMap() {
        super.joinMap(); // To change body of generated methods, choose Tools | Templates.
        st = System.currentTimeMillis();
    }

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
        if (!this.isDie()) {
            if (!piercing && Util.isTrue(this.nPoint.tlNeDon, 100)) {
                this.chat("Xí hụt");
                return 0;
            }
            if (plAtt != null && plAtt.nPoint.isSieuThan) {
                damage = this.nPoint.subDameInjureWithDeff(damage);
            } else {
                damage = this.nPoint.subDameInjureWithDeff(damage / 2);
            }
            if (!piercing && effectSkill.isShielding) {
                if (damage > nPoint.hpMax) {
                    EffectSkillService.gI().breakShield(this);
                }
                damage = damage / 1;
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
    private long st;

}
