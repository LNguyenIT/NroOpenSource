package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData1;
import red.team.player.Player;
/**
 * @author BTH sieu cap vippr0 
 */
public class LiuLiu extends BossDHVT {

    public LiuLiu(Player player) throws Exception {
        super(BossID.LIU_LIU, BossesData1.LIU_LIU);
        this.playerAtt = player;
    }
}