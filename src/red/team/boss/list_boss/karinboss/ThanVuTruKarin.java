package red.team.boss.list_boss.karinboss;

import red.consts.ConstPlayer;
import red.s1.boss.Boss;
import red.s1.boss.BossData;
import red.s1.boss.BossID;
import red.s1.boss.BossManager;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.map.ItemMap;
import red.team.map.Zone;
import red.team.player.Player;
import red.team.server.Client;
import red.services.EffectSkillService;
import red.services.ItemService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;

/**
 * @Stole By Lucy#0800
 */
public class ThanVuTruKarin extends Boss {

    public ThanVuTruKarin(int bossID, BossData bossData, Zone zone,Player plTarget) throws Exception {
             super(BossID.THAN_VU_TRU, BossesData1.THAN_VU_TRU);
        this.zone = zone;
        this.lockPlayerTarget = plTarget;
    }

    @Override
   public void reward(Player plKill) {
        plKill.pointBoss += 0;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
    }


    @Override
    public void active() {
        super.active();
        if (this.typePk == ConstPlayer.NON_PK) {
            this.changeToTypePK();
        }
        if (this.playerTarger != null && Client.gI().getPlayer(this.playerTarger.id) == null) {
            playerTarger.haveThanVuTru = false;
            this.leaveMap();
        }
        if (this.playerTarger != null && this.playerTarger.isDie()) {
            playerTarger.haveThanVuTru = false;
            this.leaveMap();
        }
        if (this.playerTarger != null && this.playerTarger.zone != this.zone) {
            playerTarger.haveThanVuTru = false;
            this.leaveMap();
        }

    }

    @Override
    public void joinMap() {
        super.joinMap();
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

            }
            return damage;
        } else {
            return 0;
        }
    }

    @Override
    public void leaveMap() {
        super.leaveMap();
        BossManager.gI().removeBoss(this);
        this.dispose();
        playerTarger.haveThanVuTru = false;
    }
}
