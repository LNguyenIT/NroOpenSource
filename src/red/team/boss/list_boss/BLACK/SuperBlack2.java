package red.team.boss.list_boss.BLACK;

import java.util.Random;

import red.s1.boss.Boss;
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

public class SuperBlack2 extends Boss {

    public SuperBlack2() throws Exception {
        super(Util.randomBossId(), BossesData.SUPER_BLACK_GOKU_2);
    }

    @Override
    public void reward(Player plKill) {
        short randomDo = (short) new Random().nextInt(Manager.itemIds_TL.length);
//        short randomNR = (short) new Random().nextInt(Manager.itemIds_NR_SB.length);
        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(BossManager.ratioReward, 100)) {
            int[] manhthuong = new int[]{1066, 1067, 1068, 1069, 1070};
            int[] manhhiem = new int[]{561};

            int randomAWJ = new Random().nextInt(manhthuong.length);
            int randomGR = new Random().nextInt(manhhiem.length);
            int[] gang = new int[]{562, 564, 566};
            int randomG = new Random().nextInt(gang.length);
            if (Util.isTrue(20, 100)) {
                Service.gI().dropItemMap(this.zone,
                        Util.manhTS(zone, manhthuong[randomAWJ], 1, this.location.x, this.location.y, plKill.id));

            } else {
                Service.gI().dropItemMap(this.zone,
                        Util.manhTS(zone, manhhiem[randomGR], 3, this.location.x, this.location.y, plKill.id));
            }
            if (Util.isTrue(2, 5)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 457, 2, this.location.x + 2, this.location.y, plKill.id));
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
                if (Util.isTrue(2, 10)) {
                    if (Util.isTrue(5, 100)) {
                        Service.gI().dropItemMap(this.zone,
                                Util.ratiItem(zone, gang[randomG], 1, this.location.x, this.location.y, plKill.id));
                    }
                }
            }
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, 865, 1, this.location.x, this.location.y, plKill.id));
            Service.gI().dropItemMap(this.zone,
                    Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone,
                    Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));
            if (Util.isTrue(5, 100)) {
                Service.gI().dropItemMap(this.zone,
                        new ItemMap(zone, 992, 1, this.location.x, this.location.y, plKill.id));

            }
            return;
        } else {
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, 15, 1, this.location.x, this.location.y, plKill.id));
        }
        if (plKill.pet.typePet > 1 && Util.isTrue(25, 100)) {
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, (short) 1108, 1, this.location.x, this.location.y, plKill.id));
            Service.gI().sendThongBaoAllPlayer("Trứng huỷ diệt đã rơi vào tay " + plKill.name);
        }

        plKill.pointBoss += 3;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
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

    private long st;

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
                damage = damage;
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
    public void moveTo(int x, int y) {
        if (this.currentLevel == 1) {
            return;
        }
        super.moveTo(x, y);
    }
    //
    // @Override
    // public void reward(Player plKill) {
    // if(this.currentLevel == 1){
    // return;
    // }
    // super.reward(plKill);
    // }
    //
    // @Override
    // protected void notifyJoinMap() {
    // if(this.currentLevel == 1){
    // return;
    // }
    // super.notifyJoinMap();
    // }
}
