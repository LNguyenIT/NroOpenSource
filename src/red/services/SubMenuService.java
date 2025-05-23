package red.services;

import com.girlkun.network.io.Message;
import red.consts.ConstNpc;
import red.team.player.Player;
import red.team.server.Client;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SubMenuService {

    public static final int BAN = 500;
    public static final int BUFF_PET = 501;

    private static SubMenuService i;

    private SubMenuService() {
    }

    public static SubMenuService gI() {
        if (i == null) {
            i = new SubMenuService();
        }
        return i;
    }

    public void controller(Player player, int playerTarget, int menuId) {
       Player plTarget = Client.gI().getPlayer(playerTarget);
        switch (menuId) {
            case BAN:
                if (plTarget != null) {
                    String[] selects = new String[]{"Đồng ý", "Hủy"};
                    NpcService.gI().createMenuConMeo(player, ConstNpc.BAN_PLAYER, -1,
                            "Bạn có chắc chắn muốn ban " + plTarget.name, selects, plTarget);
                }
                break;
            case BUFF_PET:
                if (plTarget != null) {
                    String[] selects = new String[]{"Đồng ý", "Hủy"};
                    NpcService.gI().createMenuConMeo(player, ConstNpc.BUFF_PET, -1,
                            "Bạn có chắc chắn muốn phát đệ tử cho " + plTarget.name, selects, plTarget);
                }
                break;
        }
        Service.gI().hideWaitDialog(player);
    }

    public void showMenuForAdmin(Player player) {
        showSubMenu(player, new SubMenu(BUFF_PET, "Phát Đệ Tử", ""));
    }

    public void showSubMenu(Player player, SubMenu... subMenus) {
        Message msg;
        try {
            msg = Service.gI().messageSubCommand((byte) 63);
            msg.writer().writeByte(subMenus.length);
            for (SubMenu subMenu : subMenus) {
                msg.writer().writeUTF(subMenu.caption1);
                msg.writer().writeUTF(subMenu.caption2);
                msg.writer().writeShort((short) subMenu.id);
            }
            player.sendMessage(msg);
            msg.cleanup();
        } catch (Exception e) {
            red.utils.Logger.logException(SubMenuService.class, e);
        }
    }

    public static class SubMenu {

        private int id;
        private String caption1;
        private String caption2;

        public SubMenu(int id, String caption1, String caption2) {
            this.id = id;
            this.caption1 = caption1;
            this.caption2 = caption2;
        }
    }
}
