package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.player.Player;

/**
 * @author BTH sieu cap vippr0 
 */
public class TauPayPay extends BossDHVT {

    public TauPayPay(Player player) throws Exception {
        super(BossID.TAU_PAY_PAY, BossesData1.TAU_PAY_PAY);
        this.playerAtt = player;
    }
}