package red.team.boss.list_boss.Mabu12h;

import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossesData;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.PetService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;

public class MabuBoss extends Boss {

    public MabuBoss() throws Exception {
        super(Util.randomBossId(), BossesData.MABU_12H);
    }

    @Override
    public void reward(Player plKill) {
        int randomDo = (int) new Random().nextInt(Manager.itemIds_TL.length);
//        byte randomNR = (byte) new Random().nextInt(Manager.itemIds_NR_SB.length);
        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(70, 100)) {
            if (Util.isTrue(1, 20)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
            }
            if (Util.isTrue(1, 40)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 2000 + plKill.gender, 10, this.location.x, this.location.y, plKill.id));
            }
            Service.gI().dropItemMap(this.zone,
                    Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone,
                    Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));

        } else {
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, (short) 15, 2, this.location.x, this.location.y, plKill.id));
        }
        if (plKill.pet == null) {
            PetService.gI().createNormalPet(plKill);
            Service.getInstance().sendThongBao(plKill,
                    "   Mày vừa nhận được đệ tử! Hãy chăm sóc nó nhé");
        } else {
            if (Util.isTrue(3, 10)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 568, 1, this.location.x, this.location.y, plKill.id));
            }
        }

        plKill.pointBoss += 0;
         plKill.fightMabu.changePoint(10);
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    @Override
    public int injured(Player plAtt, int damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
        if (this != null) {
            this.nPoint.isMabu = true;
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
}
