package red.team.boss.list_boss.DUONGTANG;

import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.team.skill.Skill;
import red.services.EffectSkillService;
import red.services.ItemService;
import red.services.PetService;
import red.services.Service;
import red.services.TaskService;
import red.team.server.Manager;
import red.utils.Util;

public class XATANG extends Boss {

    public XATANG() throws Exception {
        super(BossID.XA_TANG, BossesData1.XA_TANG);
    }

    @Override
    public void reward(Player plKill) {
        byte randomDo = (byte) new Random().nextInt(Manager.itemIds_TL.length);
        if (Util.isTrue(1, 100)) {
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, Manager.itemIds_TL[randomDo], 1,
                    this.location.x, this.location.y, plKill.id));
        }
        plKill.NguHanhSonPoint += 20;
        Service.gI().sendThongBao(plKill, "Bạn nhận được 20 điểm ngũ hành sơn");
        plKill.pointBoss += 1;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
    }

    @Override
    public void active() {
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

    @Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
        this.checkAnThan(plAtt);
//        if (Util.isTrue(50, 100) && plAtt != null) {//tỉ lệ hụt của thiên sứ
//            Util.isTrue(this.nPoint.tlNeDon, 100);
//            if (Util.isTrue(1, 100)) {
//            }
//            damage = 0;
//
//        }
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
                damage = 1;
            }
//            if (damage >= 1) {
//                damage = 1;
//            }
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
/**
 * Vui lòng không sao chép mã nguồn này dưới mọi hình thức. Hãy tôn trọng tác
 * giả của mã nguồn này. Xin cảm ơn! - Lucy
 */
