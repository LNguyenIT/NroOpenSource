package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.player.Player;

/**
 * @author BTH sieu cap vippr0 
 */
public class Xinbato extends BossDHVT {

    public Xinbato(Player player) throws Exception {
        super(BossID.XINBATO, BossesData1.XINBATO);
        this.playerAtt = player;
    }
}