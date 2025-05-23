package red.team.boss.list_boss.KhiGasHuyDiet;

import red.s1.boss.BossData;
import red.s1.boss.BossManager;
import red.s1.boss.BossID;
import red.s1.boss.Boss;
import red.consts.ConstPlayer;
import red.team.map.ItemMap;
import red.team.map.Zone;
import red.team.player.Player;
import red.team.skill.Skill;
import red.services.Service;
import red.services.TaskService;
import red.utils.Util;
import java.util.Random;
import red.services.ItemService;

public class DrLychee extends Boss {

    private static final int[][] FULL_DEMON = new int[][]{{Skill.DEMON, 1}, {Skill.DEMON, 2}, {Skill.DEMON, 3}, {Skill.DEMON, 4}, {Skill.DEMON, 5}, {Skill.DEMON, 6}, {Skill.DEMON, 7}};

    public DrLychee(Zone zone, int level, long dame, long hp) throws Exception {
        super(Util.randomBossId(), 
            new BossData(
                "Dr Lychee",
                ConstPlayer.TRAI_DAT,
                new short[]{639, 640, 641, -1, -1, -1},
                (int)((10000 + dame) * level),
                new long[]{((500000 + hp) * level)},
                new int[]{103},
                (int[][]) Util.addArray(FULL_DEMON),
                new String[]{},
                new String[]{"|-1|Nhóc con"},
                new String[]{},
                60
            )
        );
        this.zone = zone;
    }

    @Override

    public void reward(Player plKill) {
        int lv = plKill.clan.KhiGaHuyDiet.level;
        if (lv == 110) {

        } else if (lv <= 50) {

        }
        if (Util.isTrue(100, 100)) {
            for (int i = 0; i <= 10; i++) {
                ItemMap it = new ItemMap(this.zone, 15, 1, this.location.x + 20*i, this.zone.map.yPhysicInTop(this.location.x,
                        this.location.y - 24), plKill.id);
                Service.getInstance().dropItemMap(this.zone, it);
            }
        }
        plKill.pointBoss += 0;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
        ItemService.gI().CheckDoneVeTL(plKill);
    }

    @Override
    public void active() {
        super.active();
    }

    @Override
    public void joinMap() {
        super.joinMap();
    }

    @Override
    public void leaveMap() {
        super.leaveMap();
        BossManager.gI().removeBoss(this);
        this.dispose();
    }
}
