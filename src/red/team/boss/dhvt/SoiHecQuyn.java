package red.team.boss.dhvt;

import red.s1.boss.BossID;
import red.s1.boss.BossesData;
import red.s1.boss.BossesData1;
import red.team.player.Player;

/**
 * @author BTH sieu cap vippr0 
 */
public class SoiHecQuyn extends BossDHVT {
    public SoiHecQuyn(Player player) throws Exception {
        super(BossID.SOI_HEC_QUYN, BossesData1.SOI_HEC_QUYN);
        this.playerAtt = player;
    }
}
