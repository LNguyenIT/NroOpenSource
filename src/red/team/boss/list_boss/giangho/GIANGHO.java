package red.team.boss.list_boss.giangho;

import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData1;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.services.EffectSkillService;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;

public class GIANGHO extends Boss {

    public GIANGHO() throws Exception {
        super(BossID.GIANGHO, BossesData1.SOI_GIANGHO, BossesData1.ODO_GIANGHO, BossesData1.XINBATO_GIANGHO, BossesData1.CHACHA_GIANGHO, BossesData1.PONPUT_GIANGHO, BossesData1.CHANXU_GIANGHO, BossesData1.TAUPAYPAY_GIANGHO, BossesData1.YAMCHA_GIANGHO, BossesData1.TAUPAYPAY_GIANGHO, BossesData1.JACKYCHUN_GIANGHO, BossesData1.THIENXINHANG_GIANGHO);
    }

    @Override
    public void reward(Player plKill) {
        super.reward(plKill);
        if (this.currentLevel == 1) {
            return;
        }
        int[] itemDos = new int[]{457, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567};
        int[] NRs = new int[]{15, 16, 16, 16, 16, 16, 16, 16};
        int randomDo = new Random().nextInt(itemDos.length);
        int randomNR = new Random().nextInt(NRs.length);
        if (Util.isTrue(10, 100)) {

//                if (Util.isTrue(2, 10)) {
//                    Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 2000+plKill.gender, 1, this.location.x, this.location.y, plKill.id));
//                }
//            
            if (Util.isTrue(1, 3)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 344, 1, this.location.x + 2, this.location.y, plKill.id));
            }
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, itemDos[randomDo], 1, this.location.x, this.location.y, plKill.id));
        } else {
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, NRs[randomNR], 1, this.location.x, zone.map.yPhysicInTop(this.location.x, this.location.y - 24), plKill.id));
        }
        plKill.pointBoss += 0;

        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
        if (!this.isDie()) {
            if (!piercing && Util.isTrue(this.nPoint.tlNeDon, 100)) {
                this.chat("Xí hụt");
                return 0;
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
    protected void notifyJoinMap() {
        if (this.currentLevel == 1) {
            return;
        }
        super.notifyJoinMap();
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
