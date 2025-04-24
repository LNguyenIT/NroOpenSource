package red.s1.boss;

import red.consts.ConstPlayer;
import red.team.skill.Skill;

/**
 * @Stole By Lucy#0800❤
 */
public class BossesData1 {

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
    public static final BossData SOI_GIANGHO = new BossData(
            "Sói đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{394, 395, 396, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1100000, // dame
            new long[]{275000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
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
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            REST_5_M);

    public static final BossData ODO_GIANGHO = new BossData(
            "Ở dơ đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{400, 401, 402, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1100000, // dame
            new long[]{3400000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData XINBATO_GIANGHO = new BossData(
            "Xinbato đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{359, 360, 361, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1100000, // dame
            new long[]{3400000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData CHACHA_GIANGHO = new BossData(
            "Chacha đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{362, 363, 364, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            290000, // dame
            new long[]{2800000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData PONPUT_GIANGHO = new BossData(
            "Ponput đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{365, 366, 367, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            50000, // dame
            new long[]{2900000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData CHANXU_GIANGHO = new BossData(
            "Chanxu đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{371, 372, 373, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            400000, // dame
            new long[]{3000000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData TAUPAYPAY_GIANGHO = new BossData(
            "Taupaypay đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{92, 93, 94, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            99000, // dame
            new long[]{3100000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData YAMCHA_GIANGHO = new BossData(
            "Yamcha đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{374, 375, 376, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1000000, // dame
            new long[]{3200000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData JACKYCHUN_GIANGHO = new BossData(
            "Jackychun đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{356, 357, 358, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1000000, // dame
            new long[]{3300000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData THIENXINHANG_GIANGHO = new BossData(
            "Thenxinhang đại ca", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{368, 369, 370, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1000000, // dame
            new long[]{3400000000L}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    ///
    public static final BossData CUMBERBLACK = new BossData(
            "CumBer  Black", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{1204, 1205, 1206, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{5000000000L}, // hp
            new int[]{193}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);
    public static final BossData CUMBERYELLOW = new BossData(
            "Cumber Vàng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{1207, 1208, 1209, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            190000, // dame
            new long[]{5000000000L}, // hp
            new int[]{194}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);
    public static final BossData CUMBERRED = new BossData(
            "Cumber Đỏ", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{2063, 2064, 2065, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            190000, // dame
            new long[]{5000000000L}, // hp
            new int[]{195}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);
    public static final BossData SOI_HEC_QUYN = new BossData(
            "Sói Hẹc Quyn", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{394, 395, 396, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            40000, // dame
            new long[]{500000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S // second rest
    );

    public static final BossData O_DO = new BossData(
            "Ở Dơ", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{400, 401, 402, -1, -1, -1}, // outfit
            60000, // dame
            new long[]{80000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData XINBATO = new BossData(
            "Xinbatô", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{359, 360, 361, -1, -1, -1}, // outfit
            80000, // dame
            new long[]{130000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData CHA_PA = new BossData(
            "Cha pa", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{362, 363, 364, -1, -1, -1}, // outfit
            100000, // dame
            new long[]{170000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData PON_PUT = new BossData(
            "Pon put", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{365, 366, 367, -1, -1, -1}, // outfit
            120000, // dame
            new long[]{190000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData CHAN_XU = new BossData(
            "Chan xư", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{371, 372, 373, -1, -1, -1}, // outfit
            140000, // dame
            new long[]{240000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData TAU_PAY_PAY = new BossData(
            "Tàu Pảy Pảy", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{92, 93, 94, -1, -1, -1}, // outfit
            160000, // dame
            new long[]{280000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData YAMCHA = new BossData(
            "Yamcha", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{374, 375, 376, -1, -1, -1}, // outfit
            200000, // dame
            new long[]{340000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData JACKY_CHUN = new BossData(
            "Jacky Chun", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{356, 357, 358, -1, -1, -1}, // outfit
            220000, // dame
            new long[]{390000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData THIEN_XIN_HANG = new BossData(
            "Thiên Xin Hăng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{368, 369, 370, -1, -1, -1}, // outfit
            300000, // dame
            new long[]{500000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData THIEN_XIN_HANG_CLONE = new BossData(
            "Thiên Xin Hăng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{368, 369, 370, -1, -1, -1}, // outfit
            75000, // dame
            new long[]{200000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    public static final BossData LIU_LIU = new BossData(
            "Lêu Lêu", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{397, 398, 399, -1, -1, -1}, // outfit
            250000, // dame
            new long[]{250000000}, // hp
            new int[]{129}, // map join
            new int[][]{ // skill
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210},
                {Skill.TAI_TAO_NANG_LUONG, 7, 60000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_S
    );

    // Thinh kinh
    public static final BossData DUONGTANG = new BossData(
            "Đường Tăng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{467, 468, 464, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            3000, // dame
            new long[]{999999999}, // hp
            new int[]{122, 123, 124}, // map
            new int[][]{{Skill.TAI_TAO_NANG_LUONG, 7, 30000},
            {Skill.KHIEN_NANG_LUONG, 7, 300000},
            {Skill.THAI_DUONG_HA_SAN, 7, 30000}},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|serizawa.store"}, // text chat 3
            REST_1_M, // second rest
            new int[]{BossID.NGOKHONG, BossID.CHUBATGIOI, BossID.XA_TANG} // boss join map together
    );
    public static final BossData NGOKHONG = new BossData(
            "Ngộ Không", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{462, 463, 464, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{888888888}, // hp
            new int[]{122, 123, 124}, // map
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            },
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|serizawa.store"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData CHUBATGIOI = new BossData(
            "Bát Giới", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{465, 466, 464, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{777777777}, // hp
            new int[]{122, 123, 124}, // map
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            },
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|serizawa.store"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData XA_TANG = new BossData(
            "Xa tăng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{1296, 1297, 464, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{777777777}, // hp
            new int[]{122, 123, 124}, // map
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            },
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|serizawa.store"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    // bojectF
    public static final BossData BOJACK_GIANGHO = new BossData(
            "Bojack đại ca",
            ConstPlayer.XAYDA,
            new short[]{323, 324, 325, -1, -1, -1},
            50000,
            new long[]{200000000},
            new int[]{2, 3, 27, 28, 17, 18, 35, 36, 11, 12, 31, 32}, //
            // new int[]{14},
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Sao thế hả? Ta mới chỉ khởi động thôi mà!",
                "|-2|Ngươi đánh giá thấp bọn ta quá đấy!",
                "|-2|Đừng có tưởng bở, lũ sâu bọ member!",
                "|-1|Nếu có ý định gây trở ngại cho cuộc chiến giữa ta và Sôngôku, thì ta cũng sẽ giết ngươi ngay lập tức",
                "|-2|Ngươi tưởng ta để cho ngươi giết được ta ngay à?",
                "|-2|Đúng là mạnh mồm thật đấy!",
                "|-2|Đỡ này"}, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData ZANGYA_GIANGHO = new BossData(
            "Zangya đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{332, 333, 334, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{190000000}, // hp
            new int[]{2, 3, 27, 28, 17, 18, 35, 36, 11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Bojack có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData KOGU_GIANGHO = new BossData(
            "Kogu đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{329, 330, 331, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{180000000}, // hp
            new int[]{2, 3, 27, 28, 17, 18, 35, 36, 11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Bojack có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData BUJIN_GIANGHO = new BossData(
            "Bujin đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{341, 342, 343, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{170000000}, // hp
            new int[]{2, 3, 27, 28, 17, 18, 35, 36, 11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Bojack có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);

    public static final BossData BIDO_GIANGHO = new BossData(
            "Bido đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{335, 336, 337, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{160000000}, // hp
            new int[]{2, 3, 27, 28, 17, 18, 35, 36, 11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Bojack có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    // kymestu
    public static final BossData TANJIRO_GIANGHO = new BossData(
            "Tanjiro đại ca",
            ConstPlayer.XAYDA,
            new short[]{1119, 1120, 1121, -1, -1, -1},
            50000,
            new long[]{200000000},
            new int[]{17, 18, 35, 36,}, //
            // new int[]{14},
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}
            }, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Sao thế hả? Ta mới chỉ khởi động thôi mà!",
                "|-2|Ngươi đánh giá thấp bọn ta quá đấy!",
                "|-2|Đừng có tưởng bở, lũ sâu bọ member!",
                "|-1|Nếu có ý định gây trở ngại cho cuộc chiến giữa ta và Sôngôku, thì ta cũng sẽ giết ngươi ngay lập tức",
                "|-2|Ngươi tưởng ta để cho ngươi giết được ta ngay à?",
                "|-2|Đúng là mạnh mồm thật đấy!",
                "|-2|Đỡ này"}, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M // second rest
    );

    public static final BossData NEZUKO_GIANGHO = new BossData(
            "Nezuko đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1128, 1129, 1130, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{170000000}, // hp
            new int[]{17, 18, 35, 36}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Tanjiro có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData ZENITSU_GIANGHO = new BossData(
            "Zenitsu đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1125, 1126, 1127, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{180000000}, // hp
            new int[]{17, 18, 35, 36}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Tanjiro có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData INOSUKE_GIANGHO = new BossData(
            "Inosuke đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1131, 1132, 1133, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{190000000}, // hp
            new int[]{17, 18, 35, 36}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Tanjiro có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    // lufy
    public static final BossData LUFFY_GIANGHO = new BossData(
            "Luffy đại ca",
            ConstPlayer.XAYDA,
            new short[]{582, 583, 584, -1, -1, -1},
            50000,
            new long[]{200000000},
            new int[]{11, 12, 31, 32}, //
            // new int[]{14},
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Sao thế hả? Ta mới chỉ khởi động thôi mà!",
                "|-2|Ngươi đánh giá thấp bọn ta quá đấy!",
                "|-2|Đừng có tưởng bở, lũ sâu bọ member!",
                "|-1|Nếu có ý định gây trở ngại cho cuộc chiến giữa ta và Sôngôku, thì ta cũng sẽ giết ngươi ngay lập tức",
                "|-2|Ngươi tưởng ta để cho ngươi giết được ta ngay à?",
                "|-2|Đúng là mạnh mồm thật đấy!",
                "|-2|Đỡ này"}, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData ZORO_GIANGHO = new BossData(
            "Zoro đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{585, 586, 587, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{190000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData SANJI_GIANGHO = new BossData(
            "Sanji đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{588, 589, 590, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{180000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData BROOK_GIANGHO = new BossData(
            "Brook đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{591, 592, 593, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{170000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData CHOPPER_GIANGHO = new BossData(
            "Chopper đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{606, 607, 608, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{160000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData NAMI_GIANGHO = new BossData(
            "Nami đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{600, 601, 602, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{150000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData FRANKY_GIANGHO = new BossData(
            "Franky đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{594, 595, 596, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{140000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData USOP_GIANGHO = new BossData(
            "Usop đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{597, 598, 599, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{140000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData ROBIN_GIANGHO = new BossData(
            "Robin đại ca", // name
            ConstPlayer.XAYDA, // gender
            new short[]{603, 604, 605, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            41111, // dame
            new long[]{140000000}, // hp
            new int[]{11, 12, 31, 32}, // map join
            new int[][]{
                {Skill.KHIEN_NANG_LUONG, 7, 300000},
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 1, 1000}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.TAI_TAO_NANG_LUONG, 7, 30000},
                {Skill.GALICK, 1, 100}, {Skill.BIEN_KHI, 7, 300000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Luffy có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_5_M);
    public static final BossData NGOKHONG_THAN = new BossData(
            "Tề thiên đại thánh",
            ConstPlayer.XAYDA,
            new short[]{462, 463, 464, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000,
            new long[]{5000000000L},
            new int[]{1, 2, 3, 4, 5, 8, 9, 11, 12, 15, 16, 17, 18},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 3, 60000},
                {Skill.THOI_MIEN, 7, 22000},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000},
                {Skill.QUA_CAU_KENH_KHI, 7, 10000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_10_M);
    public static final BossData MABU_THAN = new BossData(
            "Mabư",
            ConstPlayer.XAYDA,
            new short[]{903, 904, 905, -1, -1, -1},
            250000,
            new long[]{1500000000},
            new int[]{223},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 3, 60000},
                {Skill.THOI_MIEN, 7, 22000},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 2400},
                {Skill.KHIEN_NANG_LUONG, 7, 60000},
                {Skill.QUA_CAU_KENH_KHI, 7, 10000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Thấy ảo chưa nè!"}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_10_M);
    public static final BossData BERUS_THAN = new BossData(
            "Thần Hủy Diệt Berrus", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{508, 509, 510, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1600000000}, // hp
            new int[]{1, 2, 3, 4, 5, 8, 9, 11, 12, 15, 16, 17, 18}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 3, 60000},
                {Skill.THOI_MIEN, 7, 22000},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000},
                {Skill.QUA_CAU_KENH_KHI, 7, 10000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Các ngươi thật là yếu ớt",
                "|-1|Ta sẽ phá hủy hành tinh này",
                "|-1|Chán quá!",
                "|-1|Ta vẫn chưa dùng hết sức đâu!",
                "|-2|Hắn ta không cần phòng thủ luôn!",}, // text chat 2
            new String[]{"|-1|Ta buồn ngủ quá!"}, // text chat 3
            REST_10_M);
    public static final BossData ADMIN_THAN = new BossData(
            "Admin đẹp trai", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{2030, 2031, 2032, -1, 13, -1}, // outfit {head, body, leg, bag, aura, eff}
            350000, // dame
            new long[]{1800000000}, // hp
            new int[]{1, 2, 3, 4, 5, 8, 9, 11, 12, 15, 16, 17, 18}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 3, 60000},
                {Skill.THOI_MIEN, 7, 22000},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000},
                {Skill.QUA_CAU_KENH_KHI, 7, 10000},},
            // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Yếu thế cu",
                "|-1|Nạp lần đầu đi nhé",
                "|-1|Thiên thượng thiên hạ",
                "|-1|Duy ngã độc tôn",
                "|-1|Tuổi gì đòi 1vs1?", "|-2|Anh bảo chú này, nạp lần đầu đi!",
                "|-1|Gọi cả bang đến đây anh tiếp"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_10_M);

    public static final BossData GRANOLA = new BossData(
            "Granola",
            ConstPlayer.XAYDA,
            new short[]{2018, 2019, 2020, -1, -1, -1},
            200000,
            new long[]{2000000000},
            new int[]{177, 178},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.THOI_MIEN, 7, 22000},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.SOCOLA, 7, 4000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000},
                {Skill.QUA_CAU_KENH_KHI, 3, 30000}, {Skill.TAI_TAO_NANG_LUONG, 1, 20010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Bọn xayda khốn khiếp!",
                "|-1|Tất cả là do bọn xayda",}, // text chat 2
            new String[]{"|-1|Nhớ mặt tao đấy",
                "|-1|Tobe continue.."}, // text chat 3
            REST_10_M);
    //// boss nữ
    public static final BossData CHICHI = new BossData(
            "Thất Thất thỏ ngọc",
            ConstPlayer.XAYDA,
            new short[]{1098, 1099, 1100, -1, -1, -1},
            60000,
            new long[]{100},
            new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 42, 43, 44},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000}, {Skill.BIEN_KHI, 6, 100010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Hế lô mấy cưng!",}, // text chat 2
            new String[]{"|-1|Yametekudasai",}, // text chat 3
            REST_10_M);

    public static final BossData BULMA = new BossData(
            "Bún mắm thỏ ngọc",
            ConstPlayer.XAYDA,
            new short[]{409, 410, 411, -1, -1, -1},
            60000,
            new long[]{100},
            new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 42, 43, 44},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000}, {Skill.BIEN_KHI, 6, 200010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Hế lô mấy cưng!",}, // text chat 2
            new String[]{"|-1|Yametekudasai",}, // text chat 3
            REST_1_M);

    public static final BossData LYTIEUNUONG = new BossData(
            "Lý thỏ ngọc",
            ConstPlayer.XAYDA,
            new short[]{1095, 1096, 1097, -1, -1, -1},
            60000,
            new long[]{100},
            new int[]{0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 42, 43, 44},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000}, {Skill.BIEN_KHI, 6, 200010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Hế lô mấy cưng!",}, // text chat 2
            new String[]{"|-1|Yametekudasai",}, // text chat 3
            REST_1_M);

    public static final BossData SO18 = new BossData(
            "Thập bát thỏ ngọc",
            ConstPlayer.XAYDA,
            new short[]{1101, 1102, 1103, -1, -1, -1},
            60000,
            new long[]{100},
            new int[]{42, 43, 44, 0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000}, {Skill.BIEN_KHI, 6, 200010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Hế lô mấy cưng!",}, // text chat 2
            new String[]{"|-1|Yametekudasai",}, // text chat 3
            REST_1_M);
    public static final BossData THODAICA = new BossData(
            "Thỏ đại ca",
            ConstPlayer.XAYDA,
            new short[]{403, 404, 405, -1, -1, -1},
            90000,
            new long[]{200},
            new int[]{42, 43, 44, 0, 1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20},
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.THAI_DUONG_HA_SAN, 7, 24000},
                {Skill.KHIEN_NANG_LUONG, 7, 60000}, {Skill.BIEN_KHI, 6, 200010},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Hế lô mấy cưng!",}, // text chat 2
            new String[]{"|-1|Yametekudasai",}, // text chat 3
            REST_10_M);
    /// vo dai hat mit
    // giang ho
    public static final BossData DRACULA = new BossData(
            "Dracula", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{353, 354, 355, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            42000, // dame
            new long[]{150000000}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 7, 100}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.GALICK, 1, 100}}, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"}, // text chat 3
            REST_10_M);

    public static final BossData NGUOIVOHINH = new BossData(
            "Vô hình", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{377, 378, 379, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            44000, // dame
            new long[]{160000000}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 7, 100}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.GALICK, 1, 100}
            }, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData BONGBANG = new BossData(
            "Bông băng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{350, 351, 352, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            44000, // dame
            new long[]{170000000}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 7, 100}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.GALICK, 1, 100}
            }, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData SATAN = new BossData(
            "Sa tăng", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{344, 345, 346, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            44000, // dame
            new long[]{180000000}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.DRAGON, 1, 100}, {Skill.DRAGON, 2, 200}, {Skill.DRAGON, 3, 300},
                {Skill.DRAGON, 7, 700},
                {Skill.KAMEJOKO, 7, 100}, {Skill.KAMEJOKO, 2, 1200},
                {Skill.KAMEJOKO, 5, 1500}, {Skill.KAMEJOKO, 7, 1700},
                {Skill.GALICK, 1, 100}
            }, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData THODAUBAC = new BossData(
            "Gô han", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{347, 348, 349, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            60000, // dame
            new long[]{200000000}, // hp
            new int[]{0, 1, 2, 3, 4, 7, 8, 11, 12, 14, 15, 15, 17, 18, 19, 27, 28, 32, 32, 35, 36}, // map
            // join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",
                "|-1|Hãy trả thù cho ta!"
            }, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    //////
    public static final BossData GOKU_FAKE = new BossData(
            "Gôku", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{0, 523, 524, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            150000, // dame
            new long[]{800000000}, // hp
            new int[]{131, 132, 133}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{
                "|-1|Ngươi nghĩ có thể đánh bại được sao?",
                "|-1|Ta sẽ trồng cây sức mạnh tại đây"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",}, // text chat 3
            REST_30_M // type appear
    );
    //////
    public static final BossData POCOLO_FAKE = new BossData(
            "Calic", // name
            ConstPlayer.NAMEC, // gender
            new short[]{102, 523, 524, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            150000, // dame
            new long[]{800000000}, // hp
            new int[]{131, 132, 133}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{
                "|-1|Ngươi nghĩ có thể đánh bại được sao?",
                "|-1|Ta sẽ trở lại tuổi thanh xuân và thống trị hành tinh này"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",}, // text chat 3
            REST_30_M // type appear
    );
    //////
    public static final BossData CADIC_FAKE = new BossData(
            "Vegeta", // name
            ConstPlayer.XAYDA, // gender
            new short[]{103, 523, 524, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            150000, // dame
            new long[]{800000000}, // hp
            new int[]{131, 132, 133}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{
                "|-1|Ngươi nghĩ có thể đánh bại được sao?",
                "|-1|Ta sẽ hủy diệt hành tinh này"}, // text chat 2
            new String[]{"|-1|Cay quá!",
                "|-1|Ta mà lại thua được sao?",}, // text chat 3
            REST_30_M // type appear
    );
    public static final BossData PILAP = new BossData(
            "Pi láp",
            ConstPlayer.XAYDA,
            new short[]{612, 613, 614, -1, -1, -1},
            70000,
            new long[]{250000000},
            new int[]{141, 142, 143},
            // new int[]{14},
            new int[][]{
                {Skill.DRAGON, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{}, // text chat 3
            REST_10_M, // second rest
            new int[]{BossID.MAI, BossID.SU} // boss join map together
    );

    public static final BossData MAI = new BossData(
            "Mai", // name
            ConstPlayer.XAYDA, // gender
            new short[]{615, 616, 617, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            71111, // dame
            new long[]{250000000}, // hp
            new int[]{141, 142, 143}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.MASENKO, 7, 1000},
                {Skill.ANTOMIC, 7, 10000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Doraemon có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData SU = new BossData(
            "Su", // name
            ConstPlayer.XAYDA, // gender
            new short[]{618, 619, 620, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            71111, // dame
            new long[]{250000000}, // hp
            new int[]{141, 142, 143}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.MASENKO, 7, 1000},
                {Skill.ANTOMIC, 7, 10000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Doraemon có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    // chill
    public static final BossData CHILL_1 = new BossData(
            "Chill 1", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1024, 1025, 1026, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            220000, // dame
            new long[]{1000000000}, // hp
            new int[]{160, 161, 162, 163}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Doraemon có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_15_M);

    public static final BossData CHILL_2 = new BossData(
            "Chill 2", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1021, 1022, 1023, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            260000, // dame
            new long[]{1500000000}, // hp
            new int[]{160, 161, 162, 163}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 1, 300}, {Skill.LIEN_HOAN, 2, 400},
                {Skill.LIEN_HOAN, 3, 500}, {Skill.LIEN_HOAN, 4, 600},
                {Skill.LIEN_HOAN, 5, 700}, {Skill.LIEN_HOAN, 6, 800},
                {Skill.LIEN_HOAN, 7, 900},
                {Skill.KAMEJOKO, 7, 600}, {Skill.KAMEJOKO, 6, 700},
                {Skill.KAMEJOKO, 5, 800}, {Skill.KAMEJOKO, 4, 900},
                {Skill.KAMEJOKO, 3, 1000}, {Skill.KAMEJOKO, 2, 1100},
                {Skill.KAMEJOKO, 1, 1002},
                {Skill.ANTOMIC, 1, 130}, {Skill.ANTOMIC, 2, 140}, {Skill.ANTOMIC, 3, 150},
                {Skill.ANTOMIC, 4, 160}, {Skill.ANTOMIC, 5, 170}, {Skill.ANTOMIC, 6, 190},
                {Skill.ANTOMIC, 7, 200},
                {Skill.MASENKO, 1, 210}, {Skill.MASENKO, 5, 220}, {Skill.MASENKO, 6, 230},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.KHIEN_NANG_LUONG, 7, 50000},
                {Skill.TAI_TAO_NANG_LUONG, 7, 50000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Doraemon có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    public static final BossData CAULIFA_1 = new BossData(
            "Caulifa", // name
            ConstPlayer.XAYDA, // gender
            new short[]{690, 691, 692, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{800000000}, // hp
            new int[]{164, 165, 166, 167, 168}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 300},
                {Skill.LIEN_HOAN, 4, 200},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Bọn vũ trụ 7 các người yếu quá",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_20_M);

    public static final BossData SUPER_CAULIFA = new BossData(
            "Super Caulifa", // name
            ConstPlayer.XAYDA, // gender
            new short[]{757, 691, 692, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1400000000}, // hp
            new int[]{164, 165, 166, 167, 168}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Mày làm chị phải nghiêm túc rồi",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    //
    public static final BossData THAN_VU_TRU = new BossData(
            "Thần vũ trụ", // name
            ConstPlayer.XAYDA, // gender
            new short[]{98, 99, 100, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{156, 157, 158, 159}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta sẽ dạy con chiêu Kaioken"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_15_M);
    public static final BossData THAN_MEO = new BossData(
            "Thần mèo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{89, 90, 91, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{156, 157, 158, 159}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Con cần phải tiến bộ hơn"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_15_M);

    public static final BossData THUONG_DE = new BossData(
            "Thượng đế", // name
            ConstPlayer.XAYDA, // gender
            new short[]{86, 87, 88, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{156, 157, 158, 159}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hãy làm chủ sức mạnh của mình"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_15_M);

    ///
    public static final BossData BASIL = new BossData(
            "Sói Basil", // name
            ConstPlayer.XAYDA, // gender
            new short[]{745, 746, 747, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{600000000}, // hp
            new int[]{164, 165, 166, 167, 168}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hãy làm chủ sức mạnh của mình"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_20_M);
    ///
    public static final BossData LAVENDE = new BossData(
            "Sói lavende", // name
            ConstPlayer.XAYDA, // gender
            new short[]{748, 749, 750, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{600000000}, // hp
            new int[]{164, 165, 166, 167, 168}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hãy làm chủ sức mạnh của mình"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    ///
    public static final BossData BERGAMO = new BossData(
            "Sói Bergamo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{751, 752, 753, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{600000000}, // hp
            new int[]{164, 165, 166, 167, 168}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 4, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hãy làm chủ sức mạnh của mình"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );

    ///
    public static final BossData ANDROID_21 = new BossData(
            "Số 21", // name
            ConstPlayer.XAYDA, // gender
            new short[]{687, 688, 689, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1500000000}, // hp
            new int[]{111}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.MASENKO, 7, 10000}}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Nứng quá"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_30_M // type appear
    );
    ///
    public static final BossData GOKU_BLUE = new BossData(
            "Super Blue", // name
            ConstPlayer.XAYDA, // gender
            new short[]{542, 523, 524, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{139, 140}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.KAMEJOKO, 7, 500},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.DRAGON, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Siêu phản động thần thánh"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_30_M // type appear
    );
    public static final BossData CADIC_BLUE = new BossData(
            "Super Blue", // name
            ConstPlayer.XAYDA, // gender
            new short[]{538, 523, 524, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{139, 140}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.ANTOMIC, 7, 500},
                {Skill.GALICK, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Siêu phản động thần thánh"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_30_M // type appear
    );
    ///
    public static final BossData ZENO_VANG = new BossData(
            "Super Zeno", // name
            ConstPlayer.XAYDA, // gender
            new short[]{2060, 2061, 2062, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1200000000}, // hp
            new int[]{174, 175, 176}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.ANTOMIC, 7, 400},
                {Skill.GALICK, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Quỳ xuống dưới chân ta"
            }, // text chat 2
            new String[]{}, // text chat 3
            REST_15_M // type appear
    );
    public static final BossData ZENO_XANH = new BossData(
            "Rage Zeno", // name
            ConstPlayer.XAYDA, // gender
            new short[]{2051, 2052, 2053, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{1400000000}, // hp
            new int[]{174, 175, 176}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.ANTOMIC, 7, 400},
                {Skill.GALICK, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Quỳ xuống dưới chân ta"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData ZENO_TIM = new BossData(
            "Mystic Zeno", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1213, 1214, 1215, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1800000000}, // hp
            new int[]{174, 175, 176}, // map join
            new int[][]{
                {Skill.THOI_MIEN, 7, 100000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.ANTOMIC, 7, 400},
                {Skill.GALICK, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Quỳ xuống dưới chân ta"
            }, // text chat 2
            new String[]{}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    public static final BossData UUB = new BossData(
            "Uub", // name
            ConstPlayer.XAYDA, // gender
            new short[]{946, 947, 948, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            1000, // dame
            new long[]{1800000000}, // hp
            new int[]{49}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.LIEN_HOAN, 7, 300},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Xin hãy luyện tập với con!"
            }, // text chat 2
            new String[]{"|-1|Mạnh quá!"}, // text chat 3
            REST_1_M // type appear
    );
    public static final BossData BROLY_BASE_1 = new BossData(
            "Broly", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1080, 1081, 1082, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1000000000}, // hp
            new int[]{170, 171, 172}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 10000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Argggg!"}, // text chat 3
            REST_1_H // type appear
    );
    public static final BossData BROLY_BASE_2 = new BossData(
            "Super Broly", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1083, 1084, 1085, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            250000, // dame
            new long[]{1200000000}, // hp
            new int[]{170, 171, 172}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 10000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Argggg!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    public static final BossData BROLY_BASE_3 = new BossData(
            "Rage Broly", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1086, 1087, 1088, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1400000000}, // hp
            new int[]{170, 171, 172}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER);
    //
    public static final BossData VOI_9_NGA = new BossData(
            "Voi 9 ngà", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1252, 1253, 1254, -1, 2, -1}, // outfit {head, body, leg, bag, aura, eff}
            50000, // dame
            new long[]{1000000000}, // hp
            new int[]{42}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_15_M);
    public static final BossData GA_9_CUA = new BossData(
            "Gà 9 cựa", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1246, 1247, 1248, -1, 7, -1}, // outfit {head, body, leg, bag, aura, eff}
            50000, // dame
            new long[]{1000000000}, // hp
            new int[]{43}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_15_M);
    public static final BossData NGUA_9_LMAO = new BossData(
            "Ngựa 9 hồng mao", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1249, 1250, 1251, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            50000, // dame
            new long[]{1000000000}, // hp
            new int[]{44}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.DICH_CHUYEN_TUC_THOI, 2, 60000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_15_M);

    public static final BossData TAU_PAY_PAY_ROBOT = new BossData(
            "Tàu pảy pảy người máy", // name
            ConstPlayer.XAYDA, // gender
            new short[]{338, 339, 340, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1000000000}, // hp
            new int[]{189}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_30_S);
    public static final BossData TAU_PAY_PAY_KARIN = new BossData(
            "Tàu pảy pảy", // name
            ConstPlayer.XAYDA, // gender
            new short[]{92, 93, 94, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            20000, // dame
            new long[]{100000000}, // hp
            new int[]{47}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData THAN_MEO_KARIN = new BossData(
            "Thần mèo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{89, 90, 91, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            40000, // dame
            new long[]{200000000}, // hp
            new int[]{46}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData YAJIROBE_KARIN = new BossData(
            "Yajirobe", // name
            ConstPlayer.XAYDA, // gender
            new short[]{77, 78, 79, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            40000, // dame
            new long[]{200000000}, // hp
            new int[]{46}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData THUONG_DE_KARIN = new BossData(
            "Thượng đế", // name
            ConstPlayer.XAYDA, // gender
            new short[]{86, 87, 88, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            60000, // dame
            new long[]{300000000}, // hp
            new int[]{45}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);

    public static final BossData THAN_VU_TRU_KARIN = new BossData(
            "Thần vũ trự", // name
            ConstPlayer.XAYDA, // gender
            new short[]{98, 99, 100, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            80000, // dame
            new long[]{400000000}, // hp
            new int[]{48}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData TO_SU_KARIN = new BossData(
            "Tổ sư kaio", // name
            ConstPlayer.XAYDA, // gender
            new short[]{448, 449, 450, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{700000000}, // hp
            new int[]{50}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData THAN_HUY_DIET_KARIN = new BossData(
            "Thần hủy diệt", // name
            ConstPlayer.XAYDA, // gender
            new short[]{508, 509, 510, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            160000, // dame
            new long[]{1500000000}, // hp
            new int[]{154}, // map join
            new int[][]{
                {Skill.KAMEJOKO, 7, 4000},
                {Skill.LIEN_HOAN, 7, 300},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);

    // ho tong
    public static final BossData KI_LAN_HO_TONG = new BossData(
            "Kì lân",
            (byte) 0,
            new short[]{763, 764, 765, -1, -1, -1},
            100000,
            new long[]{100},
            new int[]{6},
            new int[][]{
                {Skill.DICH_CHUYEN_TUC_THOI, 1, 60000}
            },
            new String[]{}, // text chat 1
            new String[]{"|-1|Chậm thôi",
                "|-1|Cứu ta ",
                "|-1|Ui da đau quá",
                "|-1|Nhanh thế? ",
                "|-1|Lề mề quá, đứng gần ta thôi"
            }, // text chat 2
            new String[]{}, // text chat 3
            60);

    public static final BossData DUONG_TANG_HO_TONG = new BossData(
            "Đường Tank",
            (byte) 0,
            new short[]{467, 468, 469, -1, -1, -1},
            100000,
            new long[]{100},
            new int[]{0, 103},
            new int[][]{
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Chậm thôi",
                "|-1|Cứu ta ",
                "|-1|Ui da đau quá",
                "|-1|Nhanh thế? ",
                "|-1|Lề mề quá, đứng gần ta thôi"
            }, // text chat 2
            new String[]{}, // text chat 3
            60);
    public static final BossData MI_NUONG_HO_TONG = new BossData(
            "Mị nương",
            (byte) 0,
            new short[]{841, 842, 843, -1, -1, -1},
            100000,
            new long[]{100},
            new int[]{179},
            new int[][]{
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000}},
            new String[]{}, // text chat 1
            new String[]{"|-1|Chậm thôi",
                "|-1|Cứu ta ",
                "|-1|Ui da đau quá",
                "|-1|Nhanh thế? ",
                "|-1|Lề mề quá, đứng gần ta thôi"
            }, // text chat 2
            new String[]{}, // text chat 3
            60);
    public static final BossData TRAI_DAT = new BossData(
            "Trái đất", // name
            ConstPlayer.TRAI_DAT, // gender
            new short[]{569, 472, 473, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{100000000}, // hp
            new int[]{190}, // map join
            new int[][]{{Skill.DRAGON, 7, 400},
            {Skill.KAMEJOKO, 7, 5000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    // NAMEC new short[] { 536, 476, 477, -1, -1, -1 },
    public static final BossData NAMEC = new BossData(
            "Na mếc", // name
            ConstPlayer.NAMEC, // gender
            new short[]{536, 476, 477, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{100000000}, // hp
            new int[]{191}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.MASENKO, 7, 500},
            {Skill.SOCOLA, 7, 30000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    // XAYDA new short[] { 538, 474, 475, -1, -1, -1 },
    public static final BossData XAYDA = new BossData(
            "Xay da", // name
            ConstPlayer.XAYDA, // gender
            new short[]{538, 474, 475, -1, 6, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{100000000}, // hp
            new int[]{192}, // map join
            new int[][]{{Skill.GALICK, 7, 300},
            {Skill.ANTOMIC, 7, 2000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 30000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Ngươi làm ta nổi giận rồi!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_5_M);
    public static final BossData LUCYONFIRE = new BossData(
            "Lucy", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1056, 1057, 1058, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{200}, // hp
            new int[]{177}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 2000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|7|Hãy về phe của ta!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_15_M);

    public static final BossData KABUTO = new BossData(
            "Kabuto", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1053, 1054, 1055, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{200}, // hp
            new int[]{178}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 2000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},}, // skill//skill
            new String[]{}, // text chat 1
            new String[]{"|7|Hãy về phe của ta!"
            }, // text chat 2
            new String[]{"|-1|Hự!"}, // text chat 3
            REST_15_M);

    // dia nguc
    public static final BossData FIDE_DIA_NGUC = new BossData(
            "Fide", // name
            ConstPlayer.XAYDA, // gender
            new short[]{189, 190, 191, 45, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1200000000}, // hp
            new int[]{197, 197, 199}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.ANTOMIC, 7, 2000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
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
            REST_15_M // type appear
    );
    // dia nguc
    public static final BossData XEN_DIA_NGUC = new BossData(
            "Xên bọ hung", // name
            ConstPlayer.XAYDA, // gender
            new short[]{234, 235, 236, 45, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1500000000}, // hp
            new int[]{197, 197, 199}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-2|Chết đi Xên!!!!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            REST_15_M // type appear
    );
    // Khi dot
    public static final BossData KHI_BAC = new BossData(
            "Khỉ Bạc", // name
            ConstPlayer.XAYDA, // gender
            new short[]{198, 193, 194, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1000000000}, // hp
            new int[]{20, 37, 38}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            REST_15_M // type appear
    );
    public static final BossData KHI_VANG = new BossData(
            "Khỉ Vàng", // name
            ConstPlayer.XAYDA, // gender
            new short[]{197, 193, 194, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1000000000}, // hp
            new int[]{20, 37, 38}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            REST_15_M // type appear
    );
    public static final BossData KHI_DEN = new BossData(
            "Khỉ Đen", // name
            ConstPlayer.XAYDA, // gender
            new short[]{192, 193, 194, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1000000000}, // hp
            new int[]{20, 37, 38}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            REST_15_M // type appear
    );
    // NHAT NGUYET
    public static final BossData NHAT_THAN = new BossData(
            "Nhật thần", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1298, 1299, 1300, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1500000000}, // hp
            new int[]{3, 4, 17, 18, 11, 12}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            REST_30_M, // type appear,
            new int[]{BossID.NGUYET_THAN}
    );
    public static final BossData NGUYET_THAN = new BossData(
            "Nguyệt thần", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1290, 1291, 1292, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            100000, // dame
            new long[]{1900000000}, // hp
            new int[]{3, 4, 17, 18, 11, 12}, // map join
            new int[][]{{Skill.LIEN_HOAN, 7, 300},
            {Skill.KAMEJOKO, 7, 4000},
            {Skill.DICH_CHUYEN_TUC_THOI, 7, 20000},},
            new String[]{}, // text chat 1
            new String[]{"|-1|Ta nói các ngươi rồi! Sức mạnh này của ta còn đáng sợ hơn địa ngục!!",
                "|-1|Ta chơi thêm chút nữa chắc ngươi chóng mặt buồn nôn mất!!",
                "|-2|Ăn gì mà khỏe thế!",
                "|-1|Hô hô hô hô",
                "|-1|Chán thật! Khí của ngươi sắp hết rồi. Để ta tiễn ngươi về địa ngục!",
                "|-1|Ngươi quá tự cao rồi đấy,xem ta đây!",}, // text chat 2
            new String[]{"|-1|Lũ khốn..",
                "|-1|..Một ngày nào đó ta sẽ quay lại và trả thù các ngươi",
                "|-1|Nhớ mặt tao đấy !",}, // text chat 3
            TypeAppear.APPEAR_WITH_ANOTHER // type appear
    );
    //////// nro namec
    public static final BossData KUKU_NRO = new BossData(
            "Kuku", // name
            ConstPlayer.XAYDA, // gender
            new short[]{159, 160, 161, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            200000, // dame
            new long[]{1200000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},},
            new String[]{}, // text chat 1
            new String[]{}, // text chat 2
            new String[]{"|-2|Đẹp trai nó phải thế"}, // text chat 3
            REST_10_M // second rest
    );

    public static final BossData MAP_DAU_DINH_NRO = new BossData(
            "Mập Đầu Đinh", // name
            ConstPlayer.XAYDA, // gender
            new short[]{165, 166, 167, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            220000, // dame
            new long[]{1300000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill //skill
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
            TypeAppear.ANOTHER_LEVEL// second rest
    );

    public static final BossData RAMBO_NRO = new BossData(
            "Rambo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{162, 163, 164, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            240000, // dame
            new long[]{1400000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill //skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Hahaha",
                "|-1|Ngạc nhiên thật, đúng là mày đã tiến bộ rất nhanh..",
                "|-1|Tao sẽ cho mày biết lý do tại sao tao lại không dùng đến năng lực thực sự..",
                "|-1|Đến tao còn không thắng nổi thì đừng mộng tưởng đối đầu với đại ca Fide!",
                "|-1|Ha ha ha! Ngươi tưởng chạy trốn được sao?",
                "|-2|Oái..!",
                "|-2|Đừng tưởng thế này là xong..! Tao sẽ còn mạnh hơn nữa!",}, // text chat 2
            new String[]{"|-1|Ôi bạn ơi..."}, // text chat 3
            TypeAppear.ANOTHER_LEVEL // second rest
    );

    // **************************************************************************
    // Boss tiểu đội sát thủ
    public static final BossData SO_4_NRO = new BossData(
            "Số 4 Guldo", // name
            ConstPlayer.XAYDA, // gender
            new short[]{168, 169, 170, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            260000, // dame
            new long[]{1500000000}, // hp
            new int[]{206}, // map join
            // new int[]{86}, //map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill
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
            TypeAppear.ANOTHER_LEVEL
    );

    public static final BossData SO_3_NRO = new BossData(
            "Số 3 Recome", // name
            ConstPlayer.XAYDA, // gender
            new short[]{174, 175, 176, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1600000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill
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
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    public static final BossData SO_2_NRO = new BossData(
            "Số 2 Jeice", // name
            ConstPlayer.XAYDA, // gender
            new short[]{171, 172, 173, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            320000, // dame
            new long[]{1700000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill//skill
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
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    public static final BossData SO_1_NRO = new BossData(
            "Số 1 Burter", // name
            ConstPlayer.XAYDA, // gender
            new short[]{177, 178, 179, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            340000, // dame
            new long[]{1800000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill//skill
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
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    public static final BossData TIEU_DOI_TRUONG_NRO = new BossData(
            "Tiểu đội trưởng Ginyu", // name
            ConstPlayer.XAYDA, // gender
            new short[]{180, 181, 182, -1, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            360000, // dame
            new long[]{1900000000}, // hp
            new int[]{206}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán", "|-1|Đại ca Fide có nhầm không nhỉ",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!"
            }, // text chat 3
            TypeAppear.ANOTHER_LEVEL // type appear
    );

    public static final BossData PAIKUHAN = new BossData(
            "Paikuhan", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1326, 1327, 1328, 45, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            300000, // dame
            new long[]{1700000000}, // hp
            new int[]{200, 201, 202, 203}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!"
            }, // text chat 3
            REST_15_M // type appear
    );
    public static final BossData DEMONKING = new BossData(
            "Vua quỷ địa ngục", // name
            ConstPlayer.XAYDA, // gender
            new short[]{1329, 1330, 1331, 45, -1, -1}, // outfit {head, body, leg, bag, aura, eff}
            400000, // dame
            new long[]{1900000000}, // hp
            new int[]{200, 201, 202, 203}, // map join
            new int[][]{
                {Skill.LIEN_HOAN, 7, 300},
                {Skill.KAMEJOKO, 7, 1000},
                {Skill.DICH_CHUYEN_TUC_THOI, 7, 15000},}, // skill
            new String[]{}, // text chat 1
            new String[]{"|-1|Oải rồi hả?", "|-1|Ê cố lên nhóc",
                "|-1|Chán",
                "|-1|Một mình tao chấp hết tụi bây",
                "|-1|HAHAHAHA", "|-1|Chỉ là bọn con nít"
            }, // text chat 2
            new String[]{"|-1|Cay quá!"
            }, // text chat 3
            REST_15_M // type appear
    );
}
