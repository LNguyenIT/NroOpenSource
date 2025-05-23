package red.s1.boss;

import red.consts.ConstPlayer;
import red.s1.boss.BossID;
import red.team.matches.TYPE_LOSE_PVP;
import red.team.skill.Skill;
import red.utils.Util;

/**
 * @Stole By Lucy#0800❤
 */
public class BossesData {

    /**
     * Prefix text chat |-1| Boss chat |-2| Player in map chat |-3| Parent chat
     * |0|,|1|,|n| Index boss in list chat
     */
    private static final int[][] FULL_DRAGON = new int[][]{{Skill.DRAGON, 1}, {Skill.DRAGON, 2},
    {Skill.DRAGON, 3}, {Skill.DRAGON, 4}, {Skill.DRAGON, 5}, {Skill.DRAGON, 6},
    {Skill.DRAGON, 7}};
    private static final int[][] FULL_DEMON = new int[][]{{Skill.DEMON, 1}, {Skill.DEMON, 2},
    {Skill.DEMON, 3}, {Skill.DEMON, 4}, {Skill.DEMON, 5}, {Skill.DEMON, 6},
    {Skill.DEMON, 7}};
    private static final int[][] FULL_GALICK = new int[][]{{Skill.GALICK, 1}, {Skill.GALICK, 2},
    {Skill.GALICK, 3}, {Skill.GALICK, 4}, {Skill.GALICK, 5}, {Skill.GALICK, 6},
    {Skill.GALICK, 7}};
    private static final int[][] FULL_KAMEJOKO = new int[][]{{Skill.KAMEJOKO, 1}, {Skill.KAMEJOKO, 2},
    {Skill.KAMEJOKO, 3}, {Skill.KAMEJOKO, 4}, {Skill.KAMEJOKO, 5}, {Skill.KAMEJOKO, 6},
    {Skill.KAMEJOKO, 7}};
    private static final int[][] FULL_MASENKO = new int[][]{{Skill.MASENKO, 1}, {Skill.MASENKO, 2},
    {Skill.MASENKO, 3}, {Skill.MASENKO, 4}, {Skill.MASENKO, 5}, {Skill.MASENKO, 6},
    {Skill.MASENKO, 7}};
    private static final int[][] FULL_ANTOMIC = new int[][]{{Skill.ANTOMIC, 1}, {Skill.ANTOMIC, 2},
    {Skill.ANTOMIC, 3}, {Skill.ANTOMIC, 4}, {Skill.ANTOMIC, 5}, {Skill.ANTOMIC, 6},
    {Skill.ANTOMIC, 7}};
    private static final int[][] FULL_LIENHOAN = new int[][]{{Skill.LIEN_HOAN, 1}, {Skill.LIEN_HOAN, 2},
    {Skill.LIEN_HOAN, 3}, {Skill.LIEN_HOAN, 4}, {Skill.LIEN_HOAN, 5}, {Skill.LIEN_HOAN, 6},
    {Skill.LIEN_HOAN, 7}};
    private static final int[][] FULL_TDHS = new int[][]{{Skill.THAI_DUONG_HA_SAN, 1},
    {Skill.THAI_DUONG_HA_SAN, 2}, {Skill.THAI_DUONG_HA_SAN, 3}, {Skill.THAI_DUONG_HA_SAN, 4},
    {Skill.THAI_DUONG_HA_SAN, 5}, {Skill.THAI_DUONG_HA_SAN, 6},
    {Skill.THAI_DUONG_HA_SAN, 7}};

    private static final int REST_1_S = 1;
    private static final int REST_2_S = 2;
    private static final int REST_5_S = 5;
    private static final int REST_10_S = 10;
    private static final int REST_20_S = 20;
    private static final int REST_30_S = 30;
    private static final int REST_1_M = 60;
    private static final int REST_2_M = 120;
    private static final int REST_5_M = 300;
    private static final int REST_10_M = 600;
    private static final int REST_15_M = 900;
    private static final int REST_20_M = 1200;
    private static final int REST_30_M = 1800;
    private static final int REST_1_H = 3600;
    private static final int REST_2_H = 7200;
    private static final int REST_3_H = 10800;
    private static final int REST_4_H = 14400;
    private static final int REST_6_H = 21600;
    private static final int REST_8_H = 28800;
    private static final int REST_12_H = 43200;
    private static final int REST_18_H = 64200;
    private static final int REST_23_H = 82800;
    private static final int REST_24_H = 86400;

    // **************************************************************************
    // Boss nappa
    public static final BossData KUKU = new BossData(
            "Kuku", // name
            ConstPlayer.XAYDA, // gender
            new short[]{159, 160, 161, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            99999, // dame
            new long[]{150000000}, // hp
            new int[]{68, 69, 70, 71, 72}, // map join
            new int[][]{
                {Skill.MASENKO, 3, 1000},
                {Skill.TU_SAT, 7, 180000},
                {Skill.LIEN_HOAN, 7, 300}},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-2|Đẹp trai nó phải thế"}, // text chat 3
            REST_5_M // second rest
    );

    public static final BossData MAP_DAU_DINH = new BossData(
            "Mập Đầu Đinh", // name
            ConstPlayer.XAYDA, // gender
            new short[]{165, 166, 167, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            99999, // dame
            new long[]{25000000}, // hp
            new int[]{63, 64, 65, 66, 67}, // map join
            new int[][]{
                {Skill.MA_PHONG_BA, 7, 300},
                {Skill.ANTOMIC, 7, 1000},
                {Skill.HUYT_SAO, 1, 50000},
                {Skill.THAI_DUONG_HA_SAN, 7, 38000},
                {Skill.BIEN_KHI, 7, 100000},}, // skill //skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Chết hết đi cho tao",
                "|-1|Tao sẽ giết hết bọn mày",
                "|-1|Hahaha",
                "|-1|Tao chỉ cần 10 phút để giết hết bọn mày",
                "|-1|Được rồi tao sẽ thổi bay hết bọn mày",
                "|-1|Muốn đùa thì thêm tí muối đi!",
                "|-2|Thằng này,tao nhịn mày lâu lắm rồi ấy nhá",
                "|-2|Coi thường nhau quá đấy",}, // text chat 2
            new String[]{"|-1|Ôi bạn ơi ....ơi!!!"}, // text chat 3
            REST_5_M // second rest
    );

    public static final BossData RAMBO = new BossData(
            "Rambo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{162, 163, 164, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            129999, // dame
            new long[]{35000000}, // hp
            new int[]{74, 75, 76, 77}, // map join
            new int[][]{
                {Skill.MA_PHONG_BA, 7, 300},
                {Skill.ANTOMIC, 7, 1000},
                {Skill.HUYT_SAO, 1, 100000},
                {Skill.THAI_DUONG_HA_SAN, 7, 18000},
                {Skill.BIEN_KHI, 6, 100000},}, // skill //skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hahaha",
                "|-1|Ngạc nhiên thật, đúng là mày đã tiến bộ rất nhanh..",
                "|-1|Tao sẽ cho mày biết lý do tại sao tao lại không dùng đến năng lực thực sự..",
                "|-1|Đến tao còn không thắng nổi thì đừng mộng tưởng đối đầu với đại ca Fide!",
                "|-1|Ha ha ha! Ngươi tưởng chạy trốn được sao?",
                "|-2|Oái..!",
                "|-2|Đừng tưởng thế này là xong..! Tao sẽ còn mạnh hơn nữa!",}, // text chat 2
            new String[]{"|-1|Ôi bạn ơi..."}, // text chat 3
            REST_5_M // second rest
    );

    // **************************************************************************
    // Boss tiểu đội sát thủ
    public static final BossData SO_4 = new BossData(
            "Số 4 Guldo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{168, 169, 170, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            205000, // dame
            new long[]{200000000}, // hp
            new int[]{79, 31, 32, 33, 34}, // map join
            // new int[]{86}, //map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.MASENKO, 7, 1000},
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.ANTOMIC, 7, 1000},
                {Skill.HUYT_SAO, 1, 100000}, //                                        { Skill.BIEN_KHI, 7, 1000 }, 
            }, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Các ngươi không nhúc nhích được sao?",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            REST_5_M
    );

    public static final BossData SO_3 = new BossData(
            "Số 3 Recome", // name
            ConstPlayer.XAYDA, // gender
            new short[]{174, 175, 176, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            205000, // dame
            new long[]{300000000}, // hp
            new int[]{79, 31, 32, 33, 34}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.MASENKO, 7, 1000},
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.ANTOMIC, 7, 1000},
                {Skill.HUYT_SAO, 1, 100000}, //                                        { Skill.BIEN_KHI, 7, 1000 }, 
            }, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData SO_2 = new BossData(
            "Số 2 Jeice", // name
            ConstPlayer.XAYDA, // gender
            new short[]{171, 172, 173, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            155000, // dame
            new long[]{400000000}, // hp
            new int[]{79, 31, 32, 33, 34}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.ANTOMIC, 3, 3000},
                {Skill.SUPER_KAME, 7, 300},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},
                {Skill.ANTOMIC, 3, 3000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData SO_1 = new BossData(
            "Số 1 Burter", // name
            ConstPlayer.XAYDA, // gender
            new short[]{177, 178, 179, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            80000, // dame
            new long[]{50000000}, // hp
            new int[]{79, 31, 32, 33, 34}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 1000},
                {Skill.KAMEJOKO, 4, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},
                {Skill.DICH_CHUYEN_TUC_THOI, 4, 100000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData TIEU_DOI_TRUONG = new BossData(
            "Tiểu đội trưởng Ginyu", // name
            ConstPlayer.XAYDA, // gender
            new short[]{180, 181, 182, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            75000, // dame
            new long[]{750000000}, // hp
            new int[]{79, 31, 32, 33, 34}, // map join
            new int[][]{
                {Skill.SOCOLA, 7, 1000},
                {Skill.MASENKO, 7, 1000},
                {Skill.GALICK, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},
                {Skill.DE_TRUNG, 7, 1000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    // **************************************************************************
    // Boss Fide đại ca
    public static final BossData FIDE_DAI_CA_1 = new BossData(
            "Pongggggg đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{183, 184, 185, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            190000, // dame
            new long[]{200000000}, // hp
            new int[]{80}, // map join
            (int[][]) Util.addArray(FULL_ANTOMIC, FULL_GALICK), // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi tới số rồi mới gặp phải ta",
                "|-1|Toàn bọn tốt thí",
                "|-2|Không..thể..nào!!",
                "|-2|Không ngờ..Hắn mạnh cỡ này sao..!!",
                "|-1|Chúng mày nghĩ kiến lại thắng nổi khủng long sao?",
                "|-1|Hô hô hô",
                "|-1|Được thôi, nếu muốn chết đến vậy, ta rất vui lòng!!"
            }, // text chat 2
            new String[]{"|-1|Biến hình, hây aaaa..."}, // text chat 3
            REST_5_M // second rest
    );

    public static final BossData FIDE_DAI_CA_2 = new BossData(
            "Fide đại ca 2", // name
            ConstPlayer.XAYDA, // gender
            new short[]{186, 187, 188, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            190000, // dame
            new long[]{250000000}, // hp
            new int[]{80}, // map join
            (int[][]) Util.addArray(FULL_ANTOMIC, FULL_LIENHOAN), // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?",
                "|-1|Ê cố lên nhóc",
                "|-1|Ôi, xin lỗi nhé. Sức mạnh lớn quá nên ta cũng chẳng điều khiển nổi nữa!",
                "|-1|Hahaha! Ấn tượng đấy! Tên nào cũng lủi rất nhanh!",
                "|-2|A...Tốc độ nhanh quá!",
                "|-1|Hình như... mày không phải là một thằng nhóc bình thường!",
                "|-1|Mấy đòn vừa rồi, nói thật là cũng đau đấy!",
                "|-1|Nhưng tiếc rằng đối thủ của mày lại là Fide này...",
                "|-2|Chết tiệt.. chúng ta đã đánh giá quá thấp sức mạnh của hắn!!",
                "|-2|Đồ..Đồ quái vật..!",
                "|-2|Tốc độ kinh hoàng quá! Ai mà né nổi chứ!",}, // text chat 2
            new String[]{"|-1|Ác quỷ biến hình, Graaaaa...."}, // text chat 3
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    public static final BossData FIDE_DAI_CA_3 = new BossData(
            "Fide đại ca 3", // name
            ConstPlayer.XAYDA, // gender
            new short[]{189, 190, 191, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            90000, // dame
            new long[]{300000000}, // hp
            new int[]{80}, // map join
            (int[][]) Util.addArray(FULL_MASENKO, FULL_LIENHOAN), // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-2|Chết đi Fide!!!!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    // **************************************************************************
    // Boss TINHd
    public static final BossData DR_KORE = new BossData(
            "Dr.Kôrê", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{255, 256, 257, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{1000000000}, // hp
            new int[]{96, 94, 93}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 3, 100000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill
            // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?",
                "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Mi khá đấy, nhưng so với ta cũng chỉ là hạng tôm tép",
                "|-1|Lôi Công Trảo",
                "|-1|Cho dù ngươi có mạnh đến đâu.. thì cũng không đánh bại được rôbốt bọn ta",
                "|-2|Lão già khôn thật!!",
                "|-2|Hừ! Lão già khốn kiếp!",}, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    public static final BossData ANDROID_19 = new BossData(
            "Android 19", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{249, 250, 251, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            50000, // dame
            new long[]{1500000000L}, // hp
            new int[]{96, 94, 93}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?",
                "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Ngươi sẽ không bao giờ thắng được đâu!!",
                "|-2|Ngươi vừa hút được nhiều rồi đấy, nhưng giờ thì đừng hòng!!",}, // text
            // chat 2
            new String[]{}, // text chat 3
            REST_5_M, // second rest
            new int[]{BossID.DR_KORE});

    // **************************************************************************
    public static final BossData ANDROID_13 = new BossData(
            "Android 13", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{252, 253, 254, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            232550, // dame
            new long[]{300000000}, // hp
            new int[]{84, 104}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Sao thế hả? Ta mới chỉ khởi động thôi mà!",
                "|-2|Ngươi đánh giá thấp bọn ta quá đấy!",
                "|-2|Đừng có tưởng bở, lũ sâu bọ!",
                "|-1|Nếu có ý định gây trở ngại cho cuộc chiến giữa ta và Sôngôku, thì ta cũng sẽ giết ngươi ngay lập tức",
                "|-2|Ngươi tưởng ta để cho ngươi giết được ta ngay à?",
                "|-2|Đúng là mạnh mồm thật đấy!",
                "|-2|Đỡ này",}, // text chat 2
            new String[]{"|-1|Sô..Sông...gôku....."}, // text chat 3
            TypeAppear.CALL_BY_ANOTHER);

    public static final BossData ANDROID_14 = new BossData(
            "Android 14", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{246, 247, 248, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            230000, // dame
            new long[]{400000000}, // hp
            new int[]{84, 104}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|0|Số 14 và số 15 tiêu tùng cả rồi à?"}, // text chat 3
            REST_5_M,
            new int[]{BossID.ANDROID_13, BossID.ANDROID_15});

    public static final BossData ANDROID_15 = new BossData(
            "Android 15", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{261, 262, 263, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            239200, // dame
            new long[]{500000000}, // hp
            new int[]{84, 104}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-2|Thì ra vẫn chỉ là một đống sắt vụn!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    // **************************************************************************

    public static final BossData PIC = new BossData(
            "Số 17 Pic", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{237, 238, 239, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{400000000}, // hp
            new int[]{97, 98, 99}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi thực sự rất mạnh dù không phải là một rôbốt. Ngươi không phải là Piccôlô",
                "|-1|Nhưng ta không quan tâm ngươi là ai, ta chỉ cần biết Gôku đang ở đâu!",
                "|-1|Sao ngươi không chịu nói cho ta biết chứ!?",
                "|-2|Mục đích của ngươi không phải là giết Gôku sao? Vì vậy ta không nói cho ngươi biết cậu ấy đang ở đâu",
                "|-1|Vậy thì ta bắt buộc phải tiếp tục đánh buộc ngươi phải nói ra!",
                "|-1|Lần này ta không nương tay đâu!",
                "|-2|Ngươi thực sự rất nhanh. Nhưng chưa đủ thực lực đâu!!",
                "|-1|Cái gì!? Đó là điều ngu ngốc nhất ta từng nghe.. ta là chiến binh mạnh nhất từ trước đến giờ.!",
                "|1|Hắn thực sự rất mạnh, đúng là cuộc chiến cân sức",
                "|-3|Pic, trả nhẽ cậu lại để thua mấy tên nhóc vặt này sao?"
            }, // text chat 2
            new String[]{"|1|Pic tiêu rồi, tớ lên trước nhé!",
                "|-3|Okê, xin cứ tự nhiên"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    public static final BossData POC = new BossData(
            "Số 18 Poc", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{240, 241, 242, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{400000000}, // hp
            new int[]{97, 98, 99}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Đừng tưởng ta đây là con gái mà dễ bắt nạt nhé",
                "|-1|Khôn hồn thì chỉ chỗ Gôku cho bọn ta nhanh đi",
                "|-3|Coi kìa, một lũ xúm lại bắt nạt một cô gái kìa..",
                "|-1|Đừng có mà trọng nam khinh nữ",
                "|-2|Tại sao cô gái xinh đẹp thế này mà lại là rôbốt nhỉ?"
            }, // text chat 2
            new String[]{"|-2|Cô gái xinh đẹp vậy mà lại bị tên tiến sĩ Kôrê biến thành người máy.."}, // text
            // chat
            // 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    public static final BossData KING_KONG = new BossData(
            "Số 16 King Kong", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{243, 244, 245, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{400000000}, // hp
            new int[]{97, 98, 99}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Mau đền mạng cho những người bạn của ta",
                "|-1|Sức mạnh của ta chênh nhau với các ngươi một trời một vực đấy!",
                "|-1|Thằng kia đừng để bọn nó trói tao !"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M,
            new int[]{BossID.PIC, BossID.POC});
    // **************************************************************************
    // Boss cell

    public static final BossData XEN_BO_HUNG_1 = new BossData(
            "Xên bọ hung",
            ConstPlayer.XAYDA,
            new short[]{228, 229, 230, -1, -1, -1},
            420000,
            new long[]{900000000},
            new int[]{100},
            new int[][]{
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.THAI_DUONG_HA_SAN, 7, 30000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-2|Hắn làm ta bất ngờ đấy! Khốn kiếp!",
                "|-2|Tên đó muốn hấp thụ số 17 và 18 sao?",
                "|-1|Đến đây nào! Khi kết hợp với ta, ngươi sẽ trở nên bất bại, trở thành một thể sống hoàn mỹ!",
                "|-2|Mơ đi, sao ta phải để ngươi hấp thu hả!?",
                "|-2|Dù muốn hay không, ngươi cũng sẽ bị ta hấp thu thôi..",
                "|-2|Chúng ta không thể để hắn đạt đến dạng hoàn hảo được!",
                "|-2|Mục tiêu của hắn không phải là Sôngôku.., mà là phá hủy cả vũ trụ này!",
                "|-1|Làm đứt đuôi ta ư? Đừng quên ta có tế bào của Picôlô!!",
                "|-1|Ta có thể tái tạo.. mọi bộ phận cơ thể!",
                "|-2|Vậy thì để ngăn cản ngươi đạt đến dạng hoàn hảo, ta phải tiêu diệt ngươi!",
                "|-2|Hắn quá mạnh! Mình có thể làm được gì đây!?",
                "|-1|Có vẻ như ta đã trở nên quá mạnh, chắc là ta đã giết nhiều người hơn dự tính!!",
                "|-1|Ngươi không thể thắng nổi ta! Từ bỏ đi!!",
                "|-1|Đến lúc ta hấp thu ngươi rồi",
                "|-2|Đồ quái vật chết tiệt...",
                "|-1|Hê hê hê, rồi ngươi sẽ trở thành một phần của con quái vật này thôi!",
                "|-1|Lại thêm một tên ngốc nữa chán sống!"
            }, // text chat 2
            new String[]{"|-2|Khốn kiếp, Pic.. hắn bị Cell hấp thu rồi!!"}, // text chat 3
            REST_5_M);

    public static final BossData XEN_BO_HUNG_2 = new BossData(
            "Xên bọ hung 2",
            ConstPlayer.XAYDA,
            new short[]{231, 232, 233, -1, -1, -1},
            450000,
            new long[]{1200000000},
            new int[]{100},
            new int[][]{
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.THAI_DUONG_HA_SAN, 7, 30000},
                {Skill.LIEN_HOAN, 7, 300}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-2|Nguy rồi... thực sự nguy to rồi!",
                "|-1|Các ngươi nghĩ có thể chạy được sao!?",
                "|-1|Muốn chạy khỏi ta thì đừng hòng!!",
                "|-1|Ta cũng ngạc nhiên với tốc độ của mình! Đó tất nhiên là do ta hấp thụ được số 17!",
                "|-2|Hắn nhanh quá!!",
                "|-1|Ta muốn thử xem sức mạnh này đến đâu...",
                "|-1|Hmm.. có vẻ như sức mạnh này đã tăng lên gấp bội!",
                "|-1|Đã đến lúc ta đạt đến trạng thái hoàn hảo.!",
                "|-1|Có vẻ như ngươi muốn bị ép hơn là tự nguyện!!",
                "|-2|Bây giờ ta chưa thể thắng được ngươi!! Nhưng ngươi đừng hòng huyênh hoang!!!",
                "|-1|Muốn chạy à!!? Ta sẽ không để ngươi thoát đâu!!",}, // text chat 2
            new String[]{"|-1|Đến lúc rồi!"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);

    public static final BossData XEN_BO_HUNG_3 = new BossData(
            "Xên hoàn thiện",
            ConstPlayer.XAYDA,
            new short[]{234, 235, 236, -1, -1, -1},
            470000,
            new long[]{1500000000},
            new int[]{100},
            new int[][]{
                {Skill.KAMEJOKO, 7, 1300},
                {Skill.THAI_DUONG_HA_SAN, 7, 40000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 5, 500000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.THOI_MIEN, 7, 100000}},
            // skill

            new String[]{}, // text chat 1
            new String[]{"|-2|Cell đã đạt đến dạng hoàn hảo rồi!",
                "|-2|Đồ khốn, sao ngươi dám làm vậy với số 18!!",
                "|-2|Không ấn tượng lắm với dạng hoàn hảo của ngươi..",
                "|-2|Sao hắn không hề hấn gì?",
                "|-1|Xin lỗi.. Ngươi có thể giúp ta làm nóng cơ thể lên không !?",
                "|-2|Tình hình nguy cấp rồi!",
                "|-2|Khốn kiếp! Ngươi không chú tâm vào trận đấu!",
                "|-1|Thì ta đã bảo đây chỉ là làm nóng cơ thể mà!!",
                "|-1|Giờ ngươi chỉ là rác rưởi mà thôi!",
                "|-2|Không thể nào! Ngươi dù sao cũng chỉ là đồ sâu bọ!",}, // text chat 2
            new String[]{"|-1|Oái.. không...",
                "|-1|Cơ thể hoàn hảo của ta!!",
                "|-1|Ta không tin chuyện này sẽ xảy ra!!",
                "|-1|Đồ khốn kiếp!! Rồi ngươi sẽ phải trả giá"
            }, // text chat 3
            TypeAppear.ANOTHER_LEVEL);// **************************************************************************
    // *************
    public static final BossData SIEU_BO_HUNG_1 = new BossData(
            "Xên Hoàn Thiện",
            ConstPlayer.XAYDA,
            new short[]{234, 235, 236, -1, -1, -1},
            450000,
            new long[]{1700000000},
            new int[]{103},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.THAI_DUONG_HA_SAN, 7, 100000}},
            // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Đến đây",
                "|-1|Làm tốt lắm! Thế mới là chiến đấu chứ",
                "|-1|Chẳng hay ho gì nếu không dồn hết sức vào trận đấu!",
                "|-1|Ngươi được lắm, thực sự rất khá đấy...",
                "|-1|Cảnh báo với ngươi là ta sẽ không thất bại như lúc nãy nữa đâu!!",
                "|-1|Giờ mà ngươi phí sức vào những đòn tấn công vô ích thì trận đấu sẽ vô vị lắm đấy!!",
                "|-1|Ta muốn ngươi giải trí cho ta thêm chút nữa!!",
                "|-1|Nếu không còn ai tham dự trò chơi của Cell,.. thì toàn bộ cư dân trái đất sẽ bị tiêu diệt!"
            }, // text chat 2
            new String[]{"|-1|Hô hô hô, đây sẽ là kết thúc của lũ ngu ngốc các ngươi!! Ta sẽ chết nhưng sẽ kéo theo cái hành tinh này luôn"}, // text
            // chat
            // 3
            REST_5_M);

    public static final BossData SIEU_BO_HUNG_2 = new BossData(
            "Xên Hoàn Thiện",
            ConstPlayer.XAYDA,
            new short[]{234, 235, 236, -1, -1, -1},
            470000,
            new long[]{1800000000},
            new int[]{103},
            new int[][]{
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.THAI_DUONG_HA_SAN, 7, 150000},
                {Skill.LIEN_HOAN, 7, 300}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Đến đây",
                "|-1|Làm tốt lắm! Thế mới là chiến đấu chứ",
                "|-1|Chẳng hay ho gì nếu không dồn hết sức vào trận đấu!",
                "|-1|Ngươi được lắm, thực sự rất khá đấy...",
                "|-1|Cảnh báo với ngươi là ta sẽ không thất bại như lúc nãy nữa đâu!!",
                "|-1|Giờ mà ngươi phí sức vào những đòn tấn công vô ích thì trận đấu sẽ vô vị lắm đấy!!",
                "|-1|Ta muốn ngươi giải trí cho ta thêm chút nữa!!",
                "|-1|Nếu không còn ai tham dự trò chơi của Cell,.. thì toàn bộ cư dân trái đất sẽ bị tiêu diệt!"}, // text
            // chat
            // 2
            new String[]{}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);

    public static final BossData SIEU_BO_HUNG_3 = new BossData(
            "Siêu Xên Hoàn Thiện",
            ConstPlayer.XAYDA,
            new short[]{234, 235, 236, -1, -1, -1},
            550000,
            new long[]{2000000000},
            new int[]{103},
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Đến đây",
                "|-1|Ta sẽ không chừa đứa nào trong bọn bây",
                "|-1|Hãy tan thành cát bụi cùng với hành tinh này!!",
                "|-1|Ha ha ha! Các ngươi thích thế này chứ hả?!",
                "|-2|Ta hận sức mạnh của chúng ta không đủ đánh bại hắn!!",
                "|-2|Thật khốn kiếp!!!",
                "|-2|Tấn công đi!! Ta biết mình không còn đủ sức nữa...",
                "|-2|Nhưng ta vẫn muốn tiêu diệt ngươi!!!",}, // text chat 2
            new String[]{"|-1|Aahhh...",
                "|-1|Không thể nào... Điều này không thể nào xảy ra...",
                "|-1|Ta không tin...",
                "|-1|Ta là bấ...",}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);
    // **************************************************************************Boss
    // doanh trại
    public static final BossData TRUNG_UY_TRANG = new BossData(
            "Trung úy trắng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{141, 142, 143, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            120000, // dame
            new long[]{2000050000}, // hp
            new int[]{62}, // map join
            (int[][]) Util.addArray(FULL_DEMON), // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Nhóc con"}, // text chat 2
            new String[]{}, // text chat 3
            REST_10_S);
    // **************************************************************************
    public static final BossData COOLER_GOLD = new BossData(
            "Cooler Vàng", // name
            ConstPlayer.XAYDA, // gender
            new short[]{709, 710, 711, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            750000, // dame
            new long[]{3000000000L}, // hp
            new int[]{155, 177, 178}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 1, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Tao hơn hẳn mày, mày nên cầu cho may mắn ở phía mày đi",
                "|-1|Ghê chưa ghê chưa!",
                "|-1|Tao có rất nhiều vật phẩm quý giá,nhưng với mày thì có cái..nịt",
                "|-1|Đánh tao à,lo mà luyện tập thêm đi",
                "|-1|Nói cho mày biết,tao là anh trai của Fide",
                "|-1|trạng thái Goldend Meta Cooler sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Đêm qua em đẹp lắm!"}, // text chat 3
            REST_15_M // second rest
    );

    public static final BossData CUMBER = new BossData(
            "Sayan Tà Ác Cumber", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1207, 1208, 1209, -1, 0, -1}, // outfit {head, body, leg, bag, aura, eff}
            750000, // dame
            new long[]{3500000000L}, // hp
            new int[]{155, 177, 178}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.ANTOMIC, 7, 1000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 1, 60000}
            }, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_10_M // second rest
    );
    // **************************************************************************
    public static final BossData XEN_CON = new BossData(
            "Xên con", // name
            ConstPlayer.XAYDA, // gender
            new short[]{264, 265, 266, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            350000, // dame
            new long[]{500000000}, // hp
            new int[]{103}, // map join
            (int[][]) Util.addArray(FULL_DEMON, FULL_MASENKO), // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Tao hơn hẳn mày, mày nên cầu cho may mắn ở phía mày đi",
                "|-1|Ghê chưa ghê chưa!",
                "|-1|Tao có rất nhiều vật phẩm quý giá,nhưng với mày thì có cái..nịt",
                "|-1|Đánh tao à,lo mà luyện tập thêm đi",
                "|-1|Nói cho mày biết,tao là con của Xên ",
                "|-1|Tao sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Đêm qua em đẹp lắm!"}, // text chat 3
            REST_10_M // second rest
    );
    // **************************************************************************

    // **************************************************************************cha
    // con fide
    public static final BossData VUA_COLD = new BossData(
            "Thống Chế King COLD",
            ConstPlayer.XAYDA,
            new short[]{712, 713, 714, -1, -1, -1},
            1700000,
            new long[]{3600000000L},
            new int[]{111},
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thì ra đây là trái đất",
                "|-1|Hành tinh này bán đi chắc cũng kha khá đó!",
                "|-2|Ngươi làm ta khó chịu rồi đấy",
                "|-1|Ngươi sẽ không bao giờ thắng được đâu!!",
                "|-2|Tên này mạnh quá",}, // text chat 2
            new String[]{"|-1|Xin hãy tha cho ta !",
                "|-1|Ta sẽ cho ngươi nửa số hành tinh ta đang giữ!",
                "|-1|Đừng màaa!"}, // text chat 3
            REST_30_M, // second rest
            new int[]{BossID.FIDE_ROBOT});

    public static final BossData FIDE_ROBOT = new BossData(
            "Fide người máy", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{189, 190, 191, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1800000, // dame
            new long[]{4800000000L}, // hp
            new int[]{0, 1, 2, 3, 4}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Haaaahaa",
                "|-1|Chúng ta sẽ hủy diệt hành tinh này",
                "|-1|Tên Sôn gô ku mãi vẫn chưa tới",
                "|-1|Ngươi sẽ không bao giờ thắng được đâu!!",
                "|-2|Để xem ai mới là người chiến thắng!!",}, // text chat 2
            new String[]{"|-1|Ta thua rồi sao? Khôngggggggg!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    // **************************************************************************
    // **************************************************************************
    public static final BossData XUKA = new BossData(
            "Cô Bé Shizuka", // name
            ConstPlayer.XAYDA, // gender
            new short[]{802, 803, 804, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            450000, // dame
            new long[]{2200000000L}, // hp
            new int[]{6, 30}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Khoa có nhầm không nhỉ",
                "|-1|Các ngươi không nhúc nhích được sao?",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData XEKO = new BossData(
            "Mõm Nhọn Suneo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{850, 851, 852, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            450000, // dame
            new long[]{2500000000L}, // hp
            new int[]{6, 30}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData CHAIEN = new BossData(
            "Khỉ Đột Chaien", // name
            ConstPlayer.XAYDA, // gender
            new short[]{847, 848, 849, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            450000, // dame
            new long[]{2800000000L}, // hp
            new int[]{6, 30}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData NOBITA = new BossData(
            "Chú Bé Đần Nobita", // name
            ConstPlayer.XAYDA, // gender
            new short[]{844, 845, 846, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            450000, // dame
            new long[]{3000000000L}, // hp
            new int[]{6, 30}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Doraemon có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData DORAEMON = new BossData(
            "Người Máy Doraemon",
            ConstPlayer.XAYDA,
            new short[]{790, 791, 792, -1, -1, -1},
            650000,
            new long[]{3500000000L},
            new int[]{6, 30},
            // new int[]{14},
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_10_M // second rest
    );

    // **************************************************************************
    // **************************************************************************
    public static final BossData BLACK_GOKU_BASE = new BossData(
            "Black Goku", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{879, 880, 881, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            660000, // dame
            new long[]{3700000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 5, 6, 27, 28, 29}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi chỉ có vậy thôi sao?",
                "|-1|Đúng là loài người thấp kém",
                "|-2|Ngươi nói như thể ngươi không phải con người vậy?",
                "|-2|Chiếc nhẫn kia lẽ nào ngươi là một Kaioshin?!",
                "|-1|Các ngươi không nên biết quá nhiều",
                "|-2|Xem đòn đánh của ta đây !",
                "|-1|Được thôi, nếu muốn chết đến vậy, ta rất vui lòng!!"
            }, // text chat 2
            new String[]{"|-1|Biến hình! Super Sayan Rose"}, // text chat 3
            REST_10_M // second rest
    );
    // **************************************************************************
    public static final BossData BLACK_GOKU = new BossData(
            "Black Goku", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{879, 880, 881, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            880000, // dame
            new long[]{45000000000L}, // hp
            new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi chỉ có vậy thôi sao?",
                "|-1|Đúng là loài người thấp kém",
                "|-2|Ngươi nói như thể ngươi không phải con người vậy?",
                "|-2|Chiếc nhẫn kia lẽ nào ngươi là một Kaioshin?!",
                "|-1|Các ngươi không nên biết quá nhiều",
                "|-2|Xem đòn đánh của ta đây !",
                "|-1|Được thôi, nếu muốn chết đến vậy, ta rất vui lòng!!"
            }, // text chat 2
            new String[]{"|-1|Biến hình! Super Sayan Rose"}, // text chat 3
            REST_10_M // second rest
    );

    public static final BossData SUPER_BLACK_GOKU = new BossData(
            "Super Black Goku Rose", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{553, 880, 881, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            990000, // dame
            new long[]{45000000000L}, // hp
            new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta chính là người mang thân thể của Songoku",
                "|-1|Sức mạnh của ta là không có giới hạn",
                "|-1|Ta sẽ thống trị vũ trụ",
                "|-1|Để ta nói cho nghe,người Sayan sau khi hồi phục sức mạnh sẽ tăng lên rất nhiều",
                "|-2|Tại sao ngươi lại lấy thân thể của songoku chứ?"
            }, // text chat 2

            new String[]{"|-1|Chúng ta sẽ gặp lại nhau sớm thôi",
                "|-2|Ngươi nói gì chứ?"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    // -------------------------------------------------------------------
    public static final BossData SUPER_BLACK_GOKU_2 = new BossData(
            "Super Black Goku Rose", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{553, 880, 881, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            990000, // dame
            new long[]{45000000000L}, // hp
            new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta chính là người mang thân thể của Songoku",
                "|-1|Sức mạnh của ta là không có giới hạn",
                "|-1|Ta sẽ thống trị vũ trụ",
                "|-1|Để ta nói cho nghe,người Sayan sau khi hồi phục sức mạnh sẽ tăng lên rất nhiều",
                "|-2|Tại sao ngươi lại lấy thân thể của songoku chứ?"
            }, // text chat 2

            new String[]{"|-1|Hẹn gặp lại",
                "|-2|Không tiễn"}, // text chat 3
            REST_10_M, // second rest
            new int[]{BossID.ZAMASZIN});

    public static final BossData ZAMAS = new BossData(
            "Kaioshin Zamas", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{433, 904, 905, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            990000, // dame
            new long[]{45000000000L}, // hp
            new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta là kaioshin của vũ trụ thứ 10 ",
                "|-1|Tên của ta là Zamas, ta sẽ thay đổi thế giới này",
                "|-1|Lũ con người các ngươi là những thứ ta cần loại bỏ đầu tiên",
                "|-2|Tại sao các ngươi lại nhắm tới con người bọn ta chứ?",
                "|-1|Bởi vì ta muốn thực hiện kế hoạch đưa con người về số 0 !",
                "|-1|Lần này ta không nương tay đâu!",
                "|-2|Ngươi thực sự rất mạnh. Nhưng chưa đủ thực lực đâu!!",
                "|-1|Cái gì!? Đó là điều ngu ngốc nhất ta từng nghe! Mau biến đi",
                "|-1|Hắn thực sự rất mạnh, đúng là cuộc chiến hay",
                "|-3|Không lí nào ta lại run sợ bọn con người sao"
            }, // text chat 2

            new String[]{"|-1|Chỉ còn một cách duy nhất mà thôi",
                "|-1|Bông tai Porata!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    // -------------------------------------------------------------------
    public static final BossData THANZM2 = new BossData(
            "Thần Zamas Tối Thượng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{903, 904, 905, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            990000, // dame
            new long[]{45000000000L}, // hp
            new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta chính là thế giới",
                "|-1|Ta chính là công lí",
                "|-1|Hãy chiêm ngưỡng vẻ đẹp của ta !Hỡi con người",
                "|-1|Sức mạnh to lớn nằm trong cơ thể bất tử",
                "|-1|Ta sẽ đem công lí tới toàn bộ vũ trụ này",
                "|-2|Ngươi cứ lải nhải hoài 2 chữ công lí vậy?",
                "|-1|Lũ các ngươi làm ta thấy đau rồi ấy haha"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);

    // **************************************************************************
    public static final BossData MABU = new BossData(
            "Broly", // name
            ConstPlayer.XAYDA, // gender
            new short[]{291, 292, 293, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}       
            990000, // dame
            new long[]{45000000000L}, // hp
            new int[]{6, 27, 28, 29, 30, 13, 31, 32, 33, 34, 10, 19, 20, 35, 36, 37, 38}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi tới số rồi mới gặp phải ta",
                "|-1|Gaaaaaa",
                "|-2|Không..thể..nào!!",
                "|-2|Tên này điên thật rồi!!",
                "|-1|Được thôi, nếu muốn chết đến vậy, ta rất vui lòng!!"
            }, // text chat 2
            new String[]{"|-1|Khôngggggggg!!"}, // text chat 3
            REST_5_M // type appear
    );
    // *******************

    // **************************************************************************
    // Boss hủy diệt
    public static final BossData THIEN_SU_WHIS = new BossData(
            "Thiên sứ Whis", // name
            ConstPlayer.NAMEC, // gender
            new short[]{838, 839, 840, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1, // dame
            new long[]{150}, // hp
            new int[]{146, 147, 148}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta có thể ngồi ăn một chút được rồi!",
                "|-1|Các ngươi vẫn yếu vẫn như mọi khi",
                "|0|Thật là bực mình!",
                "|-2|Đây là sức mạnh của một thiên sứ sao?",
                "|-1|Hô Hô",
                "|-1|Các ngươi không đánh bại được ta đâu!",
                "|-2|Không thể nào",
                "|-2|Tại sao lại vậy chứ !",}, // text chat 2
            new String[]{"|-1|Ta đi về đây!Cảm ơn vì món ăn"}, // text chat 3
            REST_10_M, // second rest
            new int[]{BossID.THAN_HUY_DIET});
    public static final BossData THAN_HUY_DIET = new BossData(
            "Thần Hủy Diệt Berrus", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{508, 509, 510, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1000000, // dame
            new long[]{1500000000}, // hp
            new int[]{146, 147, 148}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Ta vẫn chưa dùng hết sức đâu!",
                "|-2|Hắn ta không cần phòng thủ luôn!",}, // text chat 2
            new String[]{"|-1|Ta buồn ngủ quá!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    public static final BossData THIEN_SU_VADOS = new BossData(
            "Thiên sứ Vados", // name
            ConstPlayer.NAMEC, // gender
            new short[]{530, 531, 532, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1, // dame
            new long[]{150}, // hp
            new int[]{146, 147, 148}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Ồ",
                "|-1|Ta làm vậy có hơi quá không?",
                "|0|Thật là bực mình!",
                "|-2|Sao ông ta lại mạnh tới vậy ?",
                "|-1|Hô Hô",
                "|-1|Các ngươi muốn đánh bại một Thiên Sứ sao?",
                "|-2|Khốn khiếp!",
                "|-2|Tại sao lại vậy chứ !",}, // text chat 2
            new String[]{"|-1|Hẹn gặp lại,ta rất hài lòng về cuộc chiến"}, // text chat 3
            REST_10_M, // second rest
            new int[]{BossID.THAN_HUY_DIET_CHAMPA});
    public static final BossData THAN_HUY_DIET_CHAMPA = new BossData(
            "Thần Hủy Diệt Champa", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{511, 512, 513, -1, -1, 77}, // outfit {head, body, leg, bag, aura, eff}
            3000000, // dame
            new long[]{5500000000L}, // hp
            new int[]{146, 147, 148}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Một lũ yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-2|Hắn ta không cần phòng thủ luôn!",}, // text chat 2
            new String[]{"|-1|Chết tiệt!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    // **************************************************************************
    // **************************************************************************
    // Boss goku
    public static final BossData SONGOKU_TA_AC = new BossData(
            "Siêu Goku Tà Ác", // name
            ConstPlayer.XAYDA, // gender
            new short[]{543, 57, 999, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            3000000, // dame
            new long[]{7000000000L}, // hp
            new int[]{155, 177, 178}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-2|Tỉnh lại đi chú Goku",
                "|-2|Đừng để bị hắn chi phối!",
                "|-1|Định chạy trốn hả?",
                "|-1|Ta sẽ tàn sát khu này trong vòng 5 phút nữa",
                "|-2|Không được rồi!",
                "|-2|Phải cố hết sức thôi"
            }, // text chat 2
            new String[]{"|-2|Mau nghỉ ngơi nào chú Goku"}, // text chat 3
            REST_15_M // second rest
    );

    // **************************************************************************
    // Boss nrd
    public static final BossData Rong_1Sao = new BossData(
            "Rồng Syn 1 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{204, 205, 206, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest
    );
    public static final BossData Rong_2Sao = new BossData(
            "Rồng Haze 2 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{219, 220, 221, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest

    );
    public static final BossData Rong_3Sao = new BossData(
            "Rồng Eis 3 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{207, 208, 209, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            11900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest

    );
    public static final BossData Rong_4Sao = new BossData(
            "Rồng Nuova 4 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{210, 211, 212, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest
    );
    public static final BossData Rong_5Sao = new BossData(
            "Rồng Rage 5 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{213, 214, 215, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest
    );
    public static final BossData Rong_6Sao = new BossData(
            "Rồng Oceanus 6 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{222, 223, 224, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest
    );
    public static final BossData Rong_7Sao = new BossData(
            "Rồng Naturon 7 Sao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{216, 217, 218, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1900000, // dame
            new long[]{1000000000}, // hp
            new int[]{85}, // map join
            new int[][]{
                {Skill.DEMON, 3, 1}, {Skill.DEMON, 6, 2}, {Skill.DRAGON, 7, 3},
                {Skill.DRAGON, 1, 4}, {Skill.GALICK, 5, 5},
                {Skill.KAMEJOKO, 7, 6}, {Skill.KAMEJOKO, 6, 7}, {Skill.KAMEJOKO, 5, 8},
                {Skill.KAMEJOKO, 4, 9}, {Skill.KAMEJOKO, 3, 10}, {Skill.KAMEJOKO, 2, 11},
                {Skill.KAMEJOKO, 1, 12},
                {Skill.ANTOMIC, 1, 13}, {Skill.ANTOMIC, 2, 14}, {Skill.ANTOMIC, 3, 15},
                {Skill.ANTOMIC, 4, 16}, {Skill.ANTOMIC, 5, 17}, {Skill.ANTOMIC, 6, 19},
                {Skill.ANTOMIC, 7, 20},
                {Skill.MASENKO, 1, 21}, {Skill.MASENKO, 5, 22}, {Skill.MASENKO, 6, 23},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.QUA_CAU_KENH_KHI, 3, 300000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.TAI_TAO_NANG_LUONG, 3, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.KHIEN_NANG_LUONG, 7, 100000},
                {Skill.THOI_MIEN, 7, 30000}
            },
            new String[]{"|-1|Gaaaaaa !!!!!!!!",
                "|-2|Tên kia là ai vậy",
                "|-1|Sức mạnh tà ác !"
            }, // text chat 1
            new String[]{"|-1|Ta muốn tìm một đối thủ xứng tầm",
                "|-1|Đi chết đi!",
                "|-1|Các ngươi không phải đối thủ của ta đâu",
                "|-1|trạng thái Tà Ác sẽ thiêu rụi mày"
            }, // text chat 2
            new String[]{"|-2|Tên đó mạnh thật!"}, // text chat 3
            REST_24_H // second rest
    );
    // **************************************************************************Team
    // Mabu 12h
    public static final BossData MABU_12H = new BossData(
            "Mabư",
            ConstPlayer.XAYDA,
            new short[]{297, 298, 299, -1, -1, -1},
            900000,
            new long[]{2200000000L},
            new int[]{120},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 200},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.THAI_DUONG_HA_SAN, 7, 70000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 100000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},
                {Skill.KAMEJOKO, 7, 1000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_2_M);
    public static final BossData DRABURA = new BossData(
            "Ma Vương Dabura",
            ConstPlayer.XAYDA,
            new short[]{418, 419, 420, -1, -1, -1},
            500000,
            new long[]{1200000000},
            new int[]{114},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_1_M);
    public static final BossData DRABURA_2 = new BossData(
            "Ma Vương Dabura",
            ConstPlayer.XAYDA,
            new short[]{418, 419, 420, -1, -1, -1},
            500000,
            new long[]{1400000000},
            new int[]{119},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_1_M);
    public static final BossData BUI_BUI = new BossData(
            "Bui Bui",
            ConstPlayer.XAYDA,
            new short[]{451, 452, 453, -1, -1, -1},
            200000,
            new long[]{1700000000},
            new int[]{115},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_1_M);

    public static final BossData BUI_BUI_2 = new BossData(
            "Bui Bui",
            ConstPlayer.XAYDA,
            new short[]{451, 452, 453, -1, -1, -1},
            500000,
            new long[]{1800000000},
            new int[]{117},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_1_M);
    public static final BossData YACON = new BossData(
            "Yacôn",
            ConstPlayer.XAYDA,
            new short[]{415, 416, 417, -1, -1, -1},
            200000,
            new long[]{1900000000},
            new int[]{118},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{"|-2|Ma nhân Bư đã xuất hiện rồi"}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_1_M);
    //
    public static final BossData BU_BEO = new BossData(
            "Bư béo",
            ConstPlayer.XAYDA,
            new short[]{297, 298, 299, -1, -1, -1},
            400000,
            new long[]{2900000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DEMON, 7, 10000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            REST_1_M);
    //

    public static final BossData BU_SUPER = new BossData(
            "Siêu Bư",
            ConstPlayer.XAYDA,
            new short[]{421, 422, 423, -1, -1, -1},
            520000,
            new long[]{2500000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300}, {Skill.KAMEJOKO, 7, 2000},
                {Skill.SOCOLA, 7, 20000}, {Skill.THOI_MIEN, 7, 40000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);
    //
    //
    public static final BossData BU_TENH = new BossData(
            "Bư Tênh",
            ConstPlayer.XAYDA,
            new short[]{424, 425, 426, -1, -1, -1},
            520000,
            new long[]{2500000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300}, {Skill.KAMEJOKO, 7, 2000},
                {Skill.SOCOLA, 7, 20000}, {Skill.THOI_MIEN, 7, 40000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);
    //
    public static final BossData BU_HAN = new BossData(
            "Bư Han",
            ConstPlayer.XAYDA,
            new short[]{427, 428, 429, -1, -1, -1},
            520000,
            new long[]{2500000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300}, {Skill.KAMEJOKO, 7, 2000},
                {Skill.SOCOLA, 7, 20000}, {Skill.THOI_MIEN, 7, 40000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);
    //
    public static final BossData BU_KID = new BossData(
            "Bư Con",
            ConstPlayer.XAYDA,
            new short[]{439, 440, 441, -1, -1, -1},
            520000,
            new long[]{2500000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300}, {Skill.KAMEJOKO, 7, 2000},
                {Skill.SOCOLA, 7, 20000}, {Skill.THOI_MIEN, 7, 40000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            TypeAppear.ANOTHER_LEVEL);
    //
    public static final BossData BU_BUNG = new BossData(
            "Bư Bụng",
            ConstPlayer.XAYDA,
            new short[]{421, 422, 423, -1, -1, -1},
            520000,
            new long[]{2500000000L},
            new int[]{144},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300}, {Skill.KAMEJOKO, 7, 2000},
                {Skill.SOCOLA, 7, 20000}, {Skill.THOI_MIEN, 7, 40000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            REST_1_M);
    //

    public static final BossData COOLER_1 = new BossData(
            "Cooler", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{320, 321, 322, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            520000, // dame
            new long[]{2600000000L}, // hp
            new int[]{105, 106, 107}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 10000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-1|Ta sẽ cho ngươi cái nịt!",}, // text chat 2
            new String[]{"|-1|Biến hình !!!!!!!!!!!!"}, // text chat 3
            REST_5_M);
    public static final BossData COOLER_2 = new BossData(
            "Cooler 2", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{317, 318, 319, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            520000, // dame
            new long[]{2600000000L}, // hp
            new int[]{105, 106, 107}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 10000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-1|Ta nghèo lắm!Đừng săn ta nữa",}, // text chat 2
            new String[]{"|-1|Đen lắm em trai !"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    public static final BossData FROST_1 = new BossData(
            "Frost", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{493, 494, 495, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            520000, // dame
            new long[]{2600000000L}, // hp
            new int[]{105, 106, 107}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 10000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-1|Ta nghèo lắm!Đừng săn ta nữa",}, // text chat 2
            new String[]{"|-1|Đen lắm em trai !"}, // text chat 3
            REST_5_M);
    public static final BossData FROST_2 = new BossData(
            "Frost 2", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{496, 497, 498, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            520000, // dame
            new long[]{2600000000L}, // hp
            new int[]{105, 106, 107}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 10000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-1|Ta nghèo lắm!Đừng săn ta nữa",}, // text chat 2
            new String[]{"|-1|Đen lắm em trai !"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    public static final BossData FROST_3 = new BossData(
            "Frost 3", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{499, 500, 501, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            520000, // dame
            new long[]{2600000000L}, // hp
            new int[]{105, 106, 107}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 10000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Không có ai đủ mạnh để đấu với ta sao?",
                "|-1|Ta nghèo lắm!Đừng săn ta nữa",}, // text chat 2
            new String[]{"|-1|Đen lắm em trai !"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    public static final BossData SUPER_ANDROID_17 = new BossData(
            "Super Hentai", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{636, 637, 638, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1700000, // dame
            new long[]{3000000000L}, // hp
            new int[]{98, 99, 100, 96, 92, 93}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M,
            new int[]{BossID.DR_KORE_GT, BossID.DR_MYUU});

    public static final BossData DR_MYUU = new BossData(
            "Dr.Myuu", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{255, 256, 257, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1700000, // dame
            new long[]{3000000000L}, // hp
            new int[]{98, 99, 100, 96, 92, 93}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?",
                "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Mi khá đấy, nhưng so với ta cũng chỉ là hạng tôm tép",
                "|-1|Lôi Công Trảo",
                "|-1|Cho dù ngươi có mạnh đến đâu.. thì cũng không đánh bại được rôbốt bọn ta",
                "|-2|Lão già khôn thật!!",
                "|-2|Hừ! Lão già khốn kiếp!",}, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    public static final BossData DR_KORE_GT = new BossData(
            "Dr.Kore GT", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{255, 256, 257, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1700000, // dame
            new long[]{3000000000L}, // hp
            new int[]{98, 99, 100, 96, 92, 93}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?",
                "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Mi khá đấy, nhưng so với ta cũng chỉ là hạng tôm tép",
                "|-1|Lôi Công Trảo",
                "|-1|Cho dù ngươi có mạnh đến đâu.. thì cũng không đánh bại được rôbốt bọn ta",
                "|-2|Lão già khôn thật!!",
                "|-2|Hừ! Lão già khốn kiếp!",}, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);

    public static final BossData SUPER_XEN = new BossData(
            "Super Xên", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{234, 235, 236, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1170000, // dame
            new long[]{3300000000L}, // hp
            new int[]{103}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);
    ///
    public static final BossData KAMIRIN = new BossData(
            "Touchi", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{356, 357, 358, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1170000, // dame
            new long[]{3300000000L}, // hp
            new int[]{103}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Sao thế hả? Ta mới chỉ khởi động thôi mà!",
                "|-2|Ngươi đánh giá thấp bọn ta quá đấy!",
                "|-2|Đừng có tưởng bở, lũ sâu bọ member!",
                "|-1|Nếu có ý định gây trở ngại cho cuộc chiến giữa ta và Sôngôku, thì ta cũng sẽ giết ngươi ngay lập tức",
                "|-2|Ngươi tưởng ta để cho ngươi giết được ta ngay à?",
                "|-2|Đúng là mạnh mồm thật đấy!",
                "|-2|Đỡ này",}, // text chat 2
            new String[]{"|-1|Sô..Sông...gôku....."}, // text chat 3
            REST_5_M);

    public static final BossData KAMILOC = new BossData(
            "LiuLiu", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{397, 398, 399, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1170000, // dame
            new long[]{3300000000L}, // hp
            new int[]{103}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|0|   tiêu tùng cả rồi à?"}, // text chat 3
            REST_5_M);

    public static final BossData KAMI_SOOME = new BossData(
            "hehe", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{409, 410, 411, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            152000, // dame
            new long[]{3000000000L}, // hp
            new int[]{29, 30, 5, 20, 37, 38, 13, 33, 34}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 1, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-2|Thì ra vẫn chỉ là một đống sắt vụn!"}, // text chat 3
            REST_5_M);
    // giang ho
    
}
