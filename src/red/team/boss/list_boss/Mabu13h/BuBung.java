package red.team.boss.list_boss.Mabu13h;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import red.consts.ConstPlayer;
import red.s1.boss.Boss;
import red.s1.boss.BossManager;
import red.s1.boss.BossesData;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.server.Manager;
import red.services.EffectSkillService;
import red.services.PetService;
import red.services.PlayerService;
import red.services.Service;
import red.services.TaskService;
import red.services.func.ChangeMapService;
import red.utils.Util;

public class BuBung extends Boss {

    public BuBung() throws Exception {
        super(Util.randomBossId(), BossesData.BU_BUNG);
    }

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
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
                this.non();
            }

            return damage;
        } else {
            return 0;
        }
    }

    @Override
    public void reward(Player plKill) {
        short randomDo = (short) new Random().nextInt(Manager.itemIds_TL.length - 1);
        short randomNR = (short) new Random().nextInt(Manager.itemIds_NR_SB.length);
        int[] itemDos = new int[]{555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int randomc12 = new Random().nextInt(itemDos.length);
        if (Util.isTrue(BossManager.ratioReward, 100)) {
            if (Util.isTrue(3, 5)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 561, 1, this.location.x, this.location.y, plKill.id));
            }
//            if (Util.isTrue(2, 10)) {
//                Service.gI().dropItemMap(this.zone,
//                        Util.ratiItem(zone, 2000 + plKill.gender, 1, this.location.x, this.location.y, plKill.id));
//            }
            Service.gI().dropItemMap(this.zone,
                    Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else if (Util.isTrue(2, 5)) {
            Service.gI().dropItemMap(this.zone,
                    Util.RaitiDoc12(zone, itemDos[randomc12], 1, this.location.x, this.location.y, plKill.id));

        } else {
            Service.gI().dropItemMap(this.zone,
                    new ItemMap(zone, 15, 1, this.location.x, this.location.y, plKill.id));
        }
        if (plKill.pet == null) {
            PetService.gI().createNormalPet(plKill);
            Service.getInstance().sendThongBao(plKill,
                    "   Mày vừa nhận được đệ tử! Hãy chăm sóc nó nhé");
        } else {
            if (Util.isTrue(1, 10)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 568, 1, this.location.x, this.location.y, plKill.id));
            }
        }
        if (plKill.pet == null) {
            PetService.gI().createNormalPet(plKill);
            Service.getInstance().sendThongBao(plKill,
                    "   Mày vừa nhận được đệ tử! Hãy chăm sóc nó nhé");
        } else {
            if (Util.isTrue(1, 10)) {
                Service.gI().dropItemMap(this.zone,
                        Util.ratiItem(zone, 568, 1, this.location.x, this.location.y, plKill.id));
            }
        }
        plKill.pointBoss += 0;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    private void non() {
        List<Player> playersCopy = new ArrayList<>(this.zone.getPlayers());
        for (Player pl : playersCopy) {
            if (pl != null && pl.isPl()) {
                int zoneLast = pl.lastZoneMabu;
                if (zoneLast == 0) {
                    zoneLast = Util.nextInt(0, 8);
                }
                ChangeMapService.gI().changeMapInYard(pl, 144, zoneLast, 200);
            }
        }

    }
}
