package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData1;
import red.team.player.Player;
/**
 * @author BTH sieu cap vippr0 
 */
public class ChaPa extends BossDHVT {

    public ChaPa(Player player) throws Exception {
        super(BossID.CHA_PA, BossesData1.CHA_PA);
        this.playerAtt = player;
    }
}