package red.team.boss.list_boss.baconsoi;

import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossManager;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.ItemService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;

public class Baconsoi extends Boss {

    public Baconsoi() throws Exception {
        super(Util.randomBossId(), BossesData1.BASIL, BossesData1.LAVENDE, BossesData1.BERGAMO);
    }

    @Override
    public void reward(Player plKill) {
        short randomDo = (short) new Random().nextInt(Manager.itemIds_TL.length - 1);
        short randomNR = (short) new Random().nextInt(Manager.itemIds_NR_SB.length);
        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(BossManager.ratioReward, 100)) {
            if (Util.isTrue(1, 5)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
                if (Util.isTrue(1, 40)) {
                    Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000 + plKill.gender, 1, this.location.x, this.location.y, plKill.id));
                }
            }
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone, Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));

        } else {
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, (short) 15, 1, this.location.x, this.location.y, plKill.id));
        }
        for (Integer i = 0; i < 3; i++) {
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 344, 1, this.location.x + 2, this.location.y, plKill.id));
//            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000+plKill.gender, 1, this.location.x+10*i, this.location.y, -1));
        }
        plKill.pointBoss += 0;
        ItemService.gI().CheckDoneVeTL(plKill);
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
        if (Util.isTrue(20, 100) && plAtt != null) {//tỉ lệ hụt của thiên sứ
            Util.isTrue(this.nPoint.tlNeDon, 100);

            damage = 0;

        }
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
                if (damage > nPoint.mpMax) {
                    EffectSkillService.gI().breakShield(this);
                }
                if (damage > nPoint.tlNeDon) {
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

    }

    @Override
    public void joinMap() {
        super.joinMap(); //To change body of generated methods, choose Tools | Templates.
        st = System.currentTimeMillis();
    }
    private long st;

}
