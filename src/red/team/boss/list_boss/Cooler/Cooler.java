package red.team.boss.list_boss.Cooler;

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

public class Cooler extends Boss {

    public Cooler() throws Exception {
        super(BossID.COOLER, BossesData.COOLER_1, BossesData.COOLER_2);
    }

    @Override
    public void reward(Player plKill) {
        byte randomDo = (byte) new Random().nextInt(Manager.itemIds_TL.length - 1);
        byte randomNR = (byte) new Random().nextInt(Manager.itemIds_NR_SB.length);
        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(BossManager.ratioReward, 100)) {
            if (Util.isTrue(2, 5)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
                if (Util.isTrue(7, 10)) {
                    Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 457, 2, this.location.x + 2, this.location.y, plKill.id));
//                    Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000+plKill.gender, 1, this.location.x, this.location.y, plKill.id));
                }
            }
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone, Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));
            return;
        } else {
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, Manager.itemIds_NR_SB[randomNR], 1, this.location.x, this.location.y, plKill.id));
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
            this.nPoint.isKhongLanh = true;
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

    @Override
    public void active() {
        super.active(); //To change body of generated methods, choose Tools | Templates.
        if (Util.canDoWithTime(st, 1800000)) {
            this.changeStatus(BossStatus.LEAVE_MAP);
        }
        if (this != null) {
            this.nPoint.isKhongLanh = true;
            this.nPoint.isFrost = true;
        }
    }

    @Override
    public void joinMap() {
        super.joinMap(); //To change body of generated methods, choose Tools | Templates.
        st = System.currentTimeMillis();
    }
    private long st;

}
