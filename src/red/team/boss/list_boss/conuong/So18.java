package red.team.boss.list_boss.conuong;


import java.util.Random;

import red.s1.boss.Boss;
import red.s1.boss.BossID;
import red.s1.boss.BossStatus;
import red.s1.boss.BossesData1;
import red.team.map.ItemMap;
import red.team.player.Player;
import red.services.EffectSkillService;
import red.services.InventoryServiceNew;
import red.services.ItemService;
import red.services.Service;
import red.services.TaskService;
import red.team.item.Item;
import red.utils.Util;


public class So18 extends Boss {

    public So18() throws Exception {
        super(BossID.SO18, BossesData1.SO18);
    }
    @Override
    public void reward(Player plKill) {
        int[] itemDos = new int[]{457,555,556,557,558,559,560,561,562,563,564,565,566,567};
        int[] NRs = new int[]{15,16,16,16,16,16,16,16,16,16,16,16,16};
        int randomDo = new Random().nextInt(itemDos.length);
        int randomNR = new Random().nextInt(NRs.length);
        if (Util.isTrue(10, 100)) {
            if (Util.isTrue(1, 3)) {
                Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 472, 1, this.location.x+2, this.location.y, plKill.id));
            }
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone,457, 1, this.location.x, this.location.y, plKill.id));
        } else {
            // Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 1179, 1, this.location.x, this.location.y, plKill.id));
            Service.gI().dropItemMap(this.zone, new ItemMap(zone, NRs[randomNR], 1, this.location.x, zone.map.yPhysicInTop(this.location.x, this.location.y - 24), plKill.id));
        }
        if (Util.isTrue(5, 100)) {

            Item item = ItemService.gI().createNewItem((short) 464);

            item.itemOptions.add(new Item.ItemOption(49, Util.nextInt(10, 20)+10));
            item.itemOptions.add(new Item.ItemOption(77, Util.nextInt(10, 20)+10));
            item.itemOptions.add(new Item.ItemOption(103, Util.nextInt(10, 20)+15));
            item.itemOptions.add(new Item.ItemOption(14, Util.nextInt(3, 7)));
            item.itemOptions.add(new Item.ItemOption(5, Util.nextInt(5, 15)));
            item.itemOptions.add(new Item.ItemOption(117, Util.nextInt(40, 40)));
            item.itemOptions.add(new Item.ItemOption(211, 0));
            //
            InventoryServiceNew.gI().addItemBag(plKill, item);
            Service.gI().sendThongBao(plKill, "bạn vừa nhặt được gì đó!");
        }
        for(int i=0; i<=1; i++){
            Service.gI().dropItemMap(this.zone, Util.ratiItem(zone, 472, 1, this.location.x+10*i, this.location.y, plKill.id));
        }
        plKill.pointBoss += 0;
        TaskService.gI().checkDoneTaskKillBoss(plKill, this);
    }
@Override
    public long injured(Player plAtt, long damage, boolean piercing, boolean isMobAttack) {
 this.checkAnThan(plAtt);
        if (Util.isTrue(10, 100) && plAtt != null) {//tỉ lệ hụt của thiên sứ
            Util.isTrue(this.nPoint.tlNeDon, 100);
            if (Util.isTrue(1, 100)) {
            }
            damage = 0;

        }
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
            if (damage >= 1) {
                damage = 1;
            }
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

  
   @Override
    public void active() {
        super.active(); //To change body of generated methods, choose Tools | Templates.
        if(Util.canDoWithTime(st,900000)){
          this.changeStatus(BossStatus.LEAVE_MAP);
        }
    }
    
   
    @Override
    public void joinMap() {
        super.joinMap(); //To change body of generated methods, choose Tools | Templates.
        st = System.currentTimeMillis();
    }
    private long st;
    
    }
/**
 * Vui lòng không sao chép mã nguồn này dưới mọi hình thức. Hãy tôn trọng tác
 * giả của mã nguồn này. Xin cảm ơn! - Lucy
 */
    