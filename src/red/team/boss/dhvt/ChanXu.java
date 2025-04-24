package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData1;
import red.team.player.Player;
/**
 * @author BTH sieu cap vippr0 
 */
public class ChanXu extends BossDHVT {

    public ChanXu(Player player) throws Exception {
        super(BossID.CHAN_XU, BossesData1.CHAN_XU);
        this.playerAtt = player;
    }
}