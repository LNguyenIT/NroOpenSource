package red.team.player;

import red.team.item.Item;

public class SetClothes {

    private Player player;
    public boolean huydietClothers;

    public SetClothes(Player player) {
        this.player = player;
    }

    public byte songoku;
    public byte thienXinHang;
    public byte kirin;

    public byte ocTieu;
    public byte pikkoroDaimao;
    public byte picolo;

    public byte kakarot;
    public byte cadic;
    public byte nappa;
    public byte TinhAn;
    public byte NhatAn;
    public byte NguyetAn;

    public byte worldcup;
    public byte setDHD;

    public boolean godClothes;
    public int ctHaiTac = -1;

    public void setup() {
        setDefault();
        setupSKT();
        this.godClothes = true;
        this.huydietClothers = true;
        for (int i = 0; i < 5; i++) {
            Item item = this.player.inventory.itemsBody.get(i);
            if (item.isNotNullItem()) {
                if (item.template.id > 567 || item.template.id < 555) {
                    this.godClothes = false;
                    break;
                }
            } else {
                this.godClothes = false;
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            Item item = this.player.inventory.itemsBody.get(i);
            if (item.isNotNullItem()) {
                if (item.template.id > 662 || item.template.id < 650) {
                    this.huydietClothers = false;
                    break;
                }
            } else {
                this.huydietClothers = false;
                break;
            }
        }
        Item ct = this.player.inventory.itemsBody.get(5);
        if (ct.isNotNullItem()) {
            switch (ct.template.id) {
                case 618:
                case 619:
                case 620:
                case 621:
                case 622:
                case 623:
                case 624:
                case 626:
                case 627:
                    this.ctHaiTac = ct.template.id;
                    break;

            }
        }
    }

    private void setupSKT() {
        for (int i = 0; i < 5; i++) {
            Item item = this.player.inventory.itemsBody.get(i);
            if (item.isNotNullItem()) {
                boolean isActSet = false;
                for (Item.ItemOption io : item.itemOptions) {
                    switch (io.optionTemplate.id) {
                        case 129:
                        case 141:
                            isActSet = true;
                            songoku++;
                            break;
                        case 127:
                        case 139:
                            isActSet = true;
                            thienXinHang++;
                            break;
                        case 128:
                        case 140:
                            isActSet = true;
                            kirin++;
                            break;
                        case 131:
                        case 143:
                            isActSet = true;
                            ocTieu++;
                            break;
                        case 132:
                        case 144:
                            isActSet = true;
                            pikkoroDaimao++;
                            break;
                        case 130:
                        case 142:
                            isActSet = true;
                            picolo++;
                            break;
                        case 135:
                        case 138:
                            isActSet = true;
                            nappa++;
                            break;
                        case 133:
                        case 136:
                            isActSet = true;
                            kakarot++;
                            break;
                        case 134:
                        case 137:
                            isActSet = true;
                            cadic++;
                            break;
                        // case 189:
                        case 34:
                            isActSet = true;
                            TinhAn++;

                            break;
                        // case 190:
                        case 35:
                            isActSet = true;
                            NguyetAn++;

                            break;
                        // case 191:
                        case 36:
                            isActSet = true;
                            NhatAn++;

                            break;
                        case 21:
                            if (io.param == 80) {
                                setDHD++;
                            }
                            break;
                    }

                    if (isActSet) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }

    private void setan() {
        for (int i = 6; i > 6; i++) {
            Item item = this.player.inventory.itemsBody.get(i);
            if (item.isNotNullItem()) {
                boolean isActSet = false;
                for (Item.ItemOption io : item.itemOptions) {
                    switch (io.optionTemplate.id) {
                        case 34:
                            if (io.param > 0) {
                                TinhAn++;
                            }
                            break;
                        // case 190:
                        case 35:
                            if (io.param > 0) {
                                NguyetAn++;
                            }
                            break;
                        // case 191:
                        case 36:
                            if (io.param > 0) {
                                NhatAn++;
                            }
                            break;
                        case 21:
                            if (io.param == 80) {
                                setDHD++;
                            }
                            break;
                    }

                    if (isActSet) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }

    // checksetthanlinh
    public boolean setGod() {
    // Duyệt qua tất cả 5 món đồ
    for (int i = 0; i < 5; i++) {
        Item item = this.player.inventory.itemsBody.get(i);

        // Kiểm tra nếu món đồ hợp lệ (không phải null) và thuộc loại đồ thần linh (id từ 555 đến 567)
        if (item.isNotNullItem()) {
            if (item.template.id < 555 || item.template.id > 567) {
                // Nếu có món đồ không phải đồ thần linh, gán godClothes = false và kết thúc kiểm tra
                this.godClothes = false;
                return false;
            }
        } else {
            // Nếu món đồ là null, gán godClothes = false và kết thúc kiểm tra
            this.godClothes = false;
            return false;
        }
    }
    
    // Nếu tất cả các món đồ đều là đồ thần linh, gán godClothes = true
    this.godClothes = true;
    return true;
}


// check set huy diet
    public boolean setHuyDiet() {
    for (int i = 0; i < 5; i++) {
        Item item = this.player.inventory.itemsBody.get(i);
        
        // Kiểm tra xem món đồ có hợp lệ (không phải null)
        if (item.isNotNullItem()) {
            // Kiểm tra nếu món đồ có ID trong khoảng từ 650 đến 662
            if (item.template.id < 650 || item.template.id > 662) {
                // Nếu có món đồ không phải huy diet, gán huydietClothers = false và kết thúc
                this.huydietClothers = false;
                return false;
            }
        } else {
            // Nếu món đồ là null, gán huydietClothers = false và kết thúc
            this.huydietClothers = false;
            return false;
        }
    }

    // Nếu tất cả các món đồ đều là huy diet, gán huydietClothers = true
    this.huydietClothers = true;
    return true;
}


    private void setDefault() {
        this.songoku = 0;
        this.thienXinHang = 0;
        this.kirin = 0;
        this.ocTieu = 0;
        this.pikkoroDaimao = 0;
        this.picolo = 0;
        this.kakarot = 0;
        this.cadic = 0;
        this.nappa = 0;
        this.setDHD = 0;
        this.worldcup = 0;
        this.NhatAn = 0;
        this.TinhAn = 0;
        this.NguyetAn = 0;
        this.godClothes = false;
        this.huydietClothers = false;
        this.ctHaiTac = -1;
    }

    public void dispose() {
        this.player = null;
    }
}
