package red.team.npc.specialnpc;

import com.girlkun.network.io.Message;
import red.team.player.Player;
import red.services.PetService;
import red.services.Service;
import red.services.func.ChangeMapService;
import red.utils.Logger;
import red.utils.Util;


public class GokuEgg {

    private static final long DEFAULT_TIME_DONE = 2592000000L;
//     private static final long DEFAULT_TIME_DONE = 86400000L;

    private Player player;
    public long lastTimeCreate;
    public long timeDone;

    private final short id = 92;

    public GokuEgg(Player player, long lastTimeCreate, long timeDone) {
        this.player = player;
        this.lastTimeCreate = lastTimeCreate;
        this.timeDone = timeDone;
    }

    public static void createGokuEgg(Player player) {
        player.gokuEgg = new GokuEgg(player, System.currentTimeMillis(), DEFAULT_TIME_DONE);
    }

    public void sendGokuEgg() {
        Message msg;
        try {
//            Message msg = new Message(-117);
//            msg.writer().writeByte(100);
//            player.sendMessage(msg);
//            msg.cleanup();

            msg = new Message(-122);
            msg.writer().writeShort(this.id);
            msg.writer().writeByte(1);
            msg.writer().writeShort(4664);
            msg.writer().writeByte(0);
            msg.writer().writeInt(this.getSecondDone());
            this.player.sendMessage(msg);
            msg.cleanup();
        } catch (Exception e) {
            Logger.logException(GokuEgg.class, e);
        }
    }

    public int getSecondDone() {
        int seconds = (int) ((lastTimeCreate + timeDone - System.currentTimeMillis()) / 1000);
        return seconds > 0 ? seconds : 0;
    }

    public void openEgg(int gender) {
        if (this.player.pet != null) {
            try {
                destroyEgg();
                Thread.sleep(4000);
                if (this.player.pet == null) {
                    PetService.gI().createGokuPet(this.player, gender);
                } else {
                    PetService.gI().changeGokuPet(this.player, gender);
                }
                ChangeMapService.gI().changeMapInYard(this.player, this.player.gender * 7, -1, Util.nextInt(300, 500));
                player.gokuEgg = null;
            } catch (Exception e) {
            }
        } else {
            Service.gI().sendThongBao(player, "Yêu cầu phải có đệ tử");
        }
    }

    public void destroyEgg() {
        // try {
        //     Message msg = new Message(-117);
        //     msg.writer().writeByte(101);
        //     player.sendMessage(msg);
        //     msg.cleanup();
        // } catch (Exception e) {
        // }
        this.player.gokuEgg = null;
    }

    public void subTimeDone(int d, int h, int m, int s) {
        this.timeDone -= ((d * 24 * 60 * 60 * 1000) + (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s * 1000));
        this.sendGokuEgg();
    }
    
    public void dispose(){
        this.player = null;
    }
}
