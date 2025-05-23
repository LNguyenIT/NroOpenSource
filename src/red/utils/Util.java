package red.utils;

import java.text.NumberFormat;
import java.util.*;

import com.girlkun.network.io.Message;
import com.girlkun.network.session.Session;
import red.jdbc.daos.GodGK;
import red.s1.boss.BossManager;
import red.team.item.Item;
import red.team.map.ItemMap;
import red.team.map.Zone;
import red.team.matches.TOP;
import red.team.mob.Mob;
import red.team.npc.Npc;
import red.team.player.Player;
import red.team.server.Client;
import red.team.server.Manager;
import red.server.io.MySession;
import red.services.ItemService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang.ArrayUtils;
import java.security.MessageDigest;
import java.math.BigInteger;
import static java.time.temporal.TemporalQueries.zone;

public class Util {

    private static final Random rand;

    static {
        rand = new Random();
    }

    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (Exception e) {
        }
        return "";
    }
//    private static final Random rand;
    private static final Locale locale = new Locale("vi", "VN");
    private static final NumberFormat num = NumberFormat.getInstance(locale);

    /**
     *
     * @param linhThu
     * @param linhThus
     * @return boolean
     * @author lucyonfire
     */
    public static boolean includes(int linhThu, int[] linhThus) {
        for (int i = 0; i < linhThus.length; i++) {
            if (linhThus[i] == linhThu) {
                return true; // If found, return true
            }
        }
        return false; // If not found, return false
    }

    public static int createIdBossClone(int idPlayer) {
        return -idPlayer - 100_000_000;
    }
    // public static MySession fakeSession() {

    // }
    public static boolean contains(String[] arr, String key) {
        return Arrays.toString(arr).contains(key);
    }

    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public static String msToTime(long ms) {
        ms = ms - System.currentTimeMillis();
        if (ms < 0) {
            ms = 0;
        }
        long mm = 0;
        long ss = 0;
        long hh = 0;
        ss = ms / 1000;
        mm = ss / 60;
        ss = ss % 60;
        hh = mm / 60;
        mm = mm % 60;
        String ssString = String.valueOf(ss);
        String mmString = String.valueOf(mm);
        String hhString = String.valueOf(hh);
        String time = null;
        if (hh != 0) {
            time = hhString + "h:" + mmString + "m:" + ssString + "s";
        } else if (mm != 0) {
            time = mmString + "m:" + ssString + "s";
        } else if (ss != 0) {
            time = ssString + "s";
        } else {
            time = "Hết hạn";
        }
        return time;
    }

    public static String numberToMoney(long power) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat num = NumberFormat.getInstance(locale);
        num.setMaximumFractionDigits(1);
        if (power >= 1000000000) {
            return num.format((double) power / 1000000000) + " Tỷ";
        } else if (power >= 1000000) {
            return num.format((double) power / 1000000) + " Tr";
        } else if (power >= 1000) {
            return num.format((double) power / 1000) + " k";
        } else {
            return num.format(power);
        }
    }

    public static String getFormatNumber(float hp) {
        // Telegram: @Tamkjll
        return Util.num.format(hp);
    }

    public static String powerToString(long power) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat num = NumberFormat.getInstance(locale);
        num.setMaximumFractionDigits(1);
        if (power >= 1000000000) {
            return num.format((double) power / 1000000000) + " Tỷ";
        } else if (power >= 1000000) {
            return num.format((double) power / 1000000) + " Tr";
        } else if (power >= 1000) {
            return num.format((double) power / 1000) + " k";
        } else {
            return num.format(power);
        }
    }

    public static String format(double power) {
        return num.format(power);
    }

    public static int getDistance(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static int getDistance(Player pl1, Player pl2) {
        return getDistance(pl1.location.x, pl1.location.y, pl2.location.x, pl2.location.y);
    }

    public static int getDistance(Player pl, Npc npc) {
        return getDistance(pl.location.x, pl.location.y, npc.cx, npc.cy);
    }

    public static int getDistance(Player pl, Mob mob) {
        return getDistance(pl.location.x, pl.location.y, mob.location.x, mob.location.y);
    }

    public static int getDistance(Mob mob1, Mob mob2) {
        return getDistance(mob1.location.x, mob1.location.y, mob2.location.x, mob2.location.y);
    }

    public static int nextInt(int from, int to) {
        return from + rand.nextInt(to - from + 1);
    }

    public static int nextInt(int max) {
        return rand.nextInt(max);
    }
    
    public static int nextInt(int[] percen) {
        int next = nextInt(1000), i;
        for (i = 0; i < percen.length; i++) {
            if (next < percen[i]) {
                return i;
            }
            next -= percen[i];
        }
        return i;
    }
    
    public static long nextLong(long from, long to) {
        if (from > to) {
            throw new IllegalArgumentException("`from` must be <= `to`");
        }
        return from + (long) (rand.nextDouble() * (to - from + 1));
    }

    public static long nextLong(long max) {
        if (max <= 0) {
            throw new IllegalArgumentException("`max` must be positive");
        }
        return (long) (rand.nextDouble() * max);
    }

    public static int nextLong(long[] percen) {
        long next = nextLong(1000L);
        for (int i = 0; i < percen.length; i++) {
            if (next < percen[i]) {
                return i;
            }
            next -= percen[i];
        }
        return percen.length;
    }

    public static int getOne(int n1, int n2) {
        return rand.nextInt() % 2 == 0 ? n1 : n2;
    }

    public static int currentTimeSec() {
        return (int) System.currentTimeMillis() / 1000;
    }

    public static String replace(String text, String regex, String replacement) {
        return text.replace(regex, replacement);
    }

    public static boolean isTrue(int ratio, int typeRatio) {
        int a = Util.nextInt(typeRatio);
        return a < ratio;
    }

    public static boolean isTrue(float ratio, int typeRatio) {
        if (ratio < 1) {
            ratio *= 10;
            typeRatio *= 10;
        }
        int a = Util.nextInt(typeRatio);
        return a < ratio;
    }

    public static boolean haveSpecialCharacter(String text) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        boolean b = m.find();
        return b || text.contains(" ");
    }

    public static boolean canDoWithTime(long lastTime, long miniTimeTarget) {
        return System.currentTimeMillis() - lastTime > miniTimeTarget;
    }

    private static final char[] SOURCE_CHARACTERS = {'À', 'Á', 'Â', 'Ã', 'È', 'É',
        'Ê', 'Ì', 'Í', 'Ò', 'Ó', 'Ô', 'Õ', 'Ù', 'Ú', 'Ý', 'à', 'á', 'â',
        'ã', 'è', 'é', 'ê', 'ì', 'í', 'ò', 'ó', 'ô', 'õ', 'ù', 'ú', 'ý',
        'Ă', 'ă', 'Đ', 'đ', 'Ĩ', 'ĩ', 'Ũ', 'ũ', 'Ơ', 'ơ', 'Ư', 'ư', 'Ạ',
        'ạ', 'Ả', 'ả', 'Ấ', 'ấ', 'Ầ', 'ầ', 'Ẩ', 'ẩ', 'Ẫ', 'ẫ', 'Ậ', 'ậ',
        'Ắ', 'ắ', 'Ằ', 'ằ', 'Ẳ', 'ẳ', 'Ẵ', 'ẵ', 'Ặ', 'ặ', 'Ẹ', 'ẹ', 'Ẻ',
        'ẻ', 'Ẽ', 'ẽ', 'Ế', 'ế', 'Ề', 'ề', 'Ể', 'ể', 'Ễ', 'ễ', 'Ệ', 'ệ',
        'Ỉ', 'ỉ', 'Ị', 'ị', 'Ọ', 'ọ', 'Ỏ', 'ỏ', 'Ố', 'ố', 'Ồ', 'ồ', 'Ổ',
        'ổ', 'Ỗ', 'ỗ', 'Ộ', 'ộ', 'Ớ', 'ớ', 'Ờ', 'ờ', 'Ở', 'ở', 'Ỡ', 'ỡ',
        'Ợ', 'ợ', 'Ụ', 'ụ', 'Ủ', 'ủ', 'Ứ', 'ứ', 'Ừ', 'ừ', 'Ử', 'ử', 'Ữ',
        'ữ', 'Ự', 'ự',};

    private static final char[] DESTINATION_CHARACTERS = {'A', 'A', 'A', 'A', 'E',
        'E', 'E', 'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a',
        'a', 'a', 'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u',
        'y', 'A', 'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u',
        'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A',
        'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e',
        'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E',
        'e', 'I', 'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o',
        'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O',
        'o', 'O', 'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u',
        'U', 'u', 'U', 'u',};

    public static char removeAccent(char ch) {
        int index = Arrays.binarySearch(SOURCE_CHARACTERS, ch);
        if (index >= 0) {
            ch = DESTINATION_CHARACTERS[index];
        }
        return ch;
    }

    public static String removeAccent(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, removeAccent(sb.charAt(i)));
        }
        return sb.toString();
    }

    public static String generateRandomText(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static Object[] addArray(Object[]... arrays) {
        if (arrays == null || arrays.length == 0) {
            return null;
        }
        if (arrays.length == 1) {
            return arrays[0];
        }
        Object[] arr0 = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            arr0 = ArrayUtils.addAll(arr0, arrays[i]);
        }
        return arr0;
    }

    public static ItemMap manhTS(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        return new ItemMap(zone, tempId, quantity, x, y, playerId);
    }

    public static ItemMap ratiDTL(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        ItemMap it = new ItemMap(zone, tempId, quantity, x, zone.map.yPhysicInTop(x, y - 24), playerId);
        List<Integer> ao = Arrays.asList(555, 557, 559);
        List<Integer> quan = Arrays.asList(556, 558, 560);
        List<Integer> gang = Arrays.asList(562, 564, 566);
        List<Integer> giay = Arrays.asList(563, 565, 567);
        int ntl = 561;
        if (ao.contains(tempId)) {
            it.options.add(new Item.ItemOption(47, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(501) + 1300)));
        }
        if (quan.contains(tempId)) {
            it.options.add(new Item.ItemOption(22, highlightsItem(it.itemTemplate.gender == 0, new Random().nextInt(11) + 45)));
        }
        if (gang.contains(tempId)) {
            it.options.add(new Item.ItemOption(0, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(1001) + 3500)));
        }
        if (giay.contains(tempId)) {
            it.options.add(new Item.ItemOption(23, highlightsItem(it.itemTemplate.gender == 1, new Random().nextInt(11) + 35)));
        }
        if (ntl == tempId) {
            it.options.add(new Item.ItemOption(14, new Random().nextInt(2) + 15));
        }
        it.options.add(new Item.ItemOption(209, 1)); // đồ rơi từ boss
        it.options.add(new Item.ItemOption(21, 18)); // ycsm 18 tỉ
        it.options.add(new Item.ItemOption(30, 1)); // ko thể gd
        if (Util.isTrue(90, 100)) {// tỉ lệ ra spl
            it.options.add(new Item.ItemOption(107, new Random().nextInt(2)));
        } else if (Util.isTrue(80, 100)) {
            it.options.add(new Item.ItemOption(107, new Random().nextInt(3) + 1));
        } else {
            it.options.add(new Item.ItemOption(107, new Random().nextInt(3) + 2));
        }
        return it;
    }

    public static ItemMap RaitiDoc12(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        ItemMap it = new ItemMap(zone, tempId, quantity, x, y, playerId);
        List<Integer> ao = Arrays.asList(555, 557, 559);
        List<Integer> quan = Arrays.asList(556, 558, 560);
        List<Integer> gang = Arrays.asList(562, 564, 566);
        List<Integer> giay = Arrays.asList(563, 565, 567);
        int rd12 = 561;
        if (ao.contains(tempId)) {
            it.options.add(new Item.ItemOption(47, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(121) + 750)));//giáp 350-470
        }
        if (quan.contains(tempId)) {
            it.options.add(new Item.ItemOption(22, highlightsItem(it.itemTemplate.gender == 0, new Random().nextInt(5) + 20)));//hp 20-24k
        }
        if (gang.contains(tempId)) {
            it.options.add(new Item.ItemOption(0, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(51) + 4200)));//2200-2250
        }
        if (giay.contains(tempId)) {
            it.options.add(new Item.ItemOption(23, highlightsItem(it.itemTemplate.gender == 1, new Random().nextInt(4) + 20)));//20-23k ki
        }
        if (rd12 == tempId) {
            it.options.add(new Item.ItemOption(14, new Random().nextInt(3) + 10));//10-12cm
        }
        it.options.add(new Item.ItemOption(209, 1));//đồ rơi từ boss
        if (Util.isTrue(98, 100)) {
            it.options.add(new Item.ItemOption(107, new Random().nextInt(5)));
        } else {
            it.options.add(new Item.ItemOption(107, new Random().nextInt(4) + 3));
        }
        it.options.add(new Item.ItemOption(21, 15));
        return it;
    }

    public static Item ratiItemTL(int tempId) {
        Item it = ItemService.gI().createItemSetKichHoat(tempId, 1);
        List<Integer> ao = Arrays.asList(555, 557, 559);
        List<Integer> quan = Arrays.asList(556, 558, 560);
        List<Integer> gang = Arrays.asList(562, 564, 566);
        List<Integer> giay = Arrays.asList(563, 565, 567);
        int ntl = 561;
        if (ao.contains(tempId)) {
            it.itemOptions.add(new Item.ItemOption(47, highlightsItem(it.template.gender == 2, new Random().nextInt(501) + 1000)));
        }
        if (quan.contains(tempId)) {
            it.itemOptions.add(new Item.ItemOption(22, highlightsItem(it.template.gender == 0, new Random().nextInt(11) + 45)));
        }
        if (gang.contains(tempId)) {
            it.itemOptions.add(new Item.ItemOption(0, highlightsItem(it.template.gender == 2, new Random().nextInt(1001) + 3500)));
        }
        if (giay.contains(tempId)) {
            it.itemOptions.add(new Item.ItemOption(23, highlightsItem(it.template.gender == 1, new Random().nextInt(11) + 35)));
        }
        if (ntl == tempId) {
            it.itemOptions.add(new Item.ItemOption(14, new Random().nextInt(3) + 15));
        }
        if (Util.isTrue(98, 100)) {
            it.itemOptions.add(new Item.ItemOption(107, new Random().nextInt(3)));
        } else {
            it.itemOptions.add(new Item.ItemOption(107, new Random().nextInt(4) + 3));
        }
        it.itemOptions.add(new Item.ItemOption(21, 15));
        return it;
    }

//    public static Item docui(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
//        ItemMap it = new ItemMap(zone, tempId, quantity, x, y, playerId);
//// Áo
//        List<Integer> ao = Arrays.asList(0, 1, 2, 3, 4, 5, 33, 34, 41, 42, 49, 50);
//
//// Quần
//        List<Integer> quan = Arrays.asList(6, 7, 8, 9, 10, 11, 35, 36, 51, 52);
//
//// Găng tay
//        List<Integer> gang = Arrays.asList(21, 22, 23, 24, 25, 26, 37, 38, 45, 46, 53, 54);
//
//// Giày
//        List<Integer> giay = Arrays.asList(27, 28, 29, 30, 31, 32, 39, 40, 47, 48, 55, 56);
//
//// Rada
//        List<Integer> rada = Arrays.asList(12, 13, 14, 15, 16, 17, 18, 19, 20, 57, 58, 59);
//
//        if (ao.contains(tempId)) {
//            it.itemOptions.add(new Item.ItemOption(47, highlightsItem(it.template.gender == 2, new Random().nextInt(10))));
//        }
//        if (quan.contains(tempId)) {
//            it.itemOptions.add(new Item.ItemOption(22, highlightsItem(it.template.gender == 0, new Random().nextInt(11))));
//        }
//        if (gang.contains(tempId)) {
//            it.itemOptions.add(new Item.ItemOption(0, highlightsItem(it.template.gender == 2, new Random().nextInt(10) + 20)));
//        }
//        if (giay.contains(tempId)) {
//            it.itemOptions.add(new Item.ItemOption(23, highlightsItem(it.template.gender == 1, new Random().nextInt(9))));
//        }
//        if (rada.contains(tempId)) {
//            it.itemOptions.add(new Item.ItemOption(14, new Random().nextInt(3) + 1));
//        }
//        it.itemOptions.add(new Item.ItemOption(21, 15));
//        return it;
//    }
    public static ItemMap useItem(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        ItemMap it = new ItemMap(zone, tempId, quantity, x, zone.map.yPhysicInTop(x, y - 24), playerId);
        List<Integer> tanjiro = Arrays.asList(1087, 1088, 1091, 1090);
        if (tanjiro.contains(tempId)) {
            it.options.add(new Item.ItemOption(77, highlightsItem(it.itemTemplate.gender == 3, new Random().nextInt(30) + 1)));
            it.options.add(new Item.ItemOption(103, highlightsItem(it.itemTemplate.gender == 3, new Random().nextInt(30) + 1)));
            it.options.add(new Item.ItemOption(50, highlightsItem(it.itemTemplate.gender == 3, new Random().nextInt(30) + 1)));
        }
        it.options.add(new Item.ItemOption(209, 1)); // đồ rơi từ boss
        it.options.add(new Item.ItemOption(30, 1)); // ko thể gd

        return it;
    }

    public static ItemMap ratiItem(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        ItemMap it = new ItemMap(zone, tempId, quantity, x, y, playerId);
        List<Integer> ao = Arrays.asList(555, 557, 559);
        List<Integer> quan = Arrays.asList(556, 558, 560);
        List<Integer> gang = Arrays.asList(562, 564, 566);
        List<Integer> giay = Arrays.asList(563, 565, 567);
        int ntl = 561;
        if (ao.contains(tempId)) {
            it.options.add(new Item.ItemOption(47, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(501) + 1000)));
        }
        if (quan.contains(tempId)) {
            it.options.add(new Item.ItemOption(22, highlightsItem(it.itemTemplate.gender == 0, new Random().nextInt(11) + 45)));
        }
        if (gang.contains(tempId)) {
            it.options.add(new Item.ItemOption(0, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(1001) + 4500)));
        }
        if (giay.contains(tempId)) {
            it.options.add(new Item.ItemOption(23, highlightsItem(it.itemTemplate.gender == 1, new Random().nextInt(11) + 45)));
        }
        if (ntl == tempId) {
            it.options.add(new Item.ItemOption(14, new Random().nextInt(3) + 15));
        }
        it.options.add(new Item.ItemOption(209, 1));//đồ rơi từ boss
        if (Util.isTrue(1, 300)) {
            it.options.add(new Item.ItemOption(107, 7));
        } else if (Util.isTrue(60, 100)) {
            it.options.add(new Item.ItemOption(107, new Random().nextInt(5)));
        }
        it.options.add(new Item.ItemOption(209, 1));
        it.options.add(new Item.ItemOption(21, 15));
        return it;
    }

    public static ItemMap docui(Zone zone, int tempId, int quantity, int x, int y, long playerId) {
        ItemMap it = new ItemMap(zone, tempId, quantity, x, y, playerId);
        //Áo
        List<Integer> ao = Arrays.asList(0, 1, 2, 3, 4, 5, 33, 34, 41, 42, 49, 50);

// Quần
        List<Integer> quan = Arrays.asList(0, 1, 2, 3, 4, 5, 33, 34, 41, 42, 49, 50);

// Găng tay
        List<Integer> gang = Arrays.asList(21, 22, 23, 24, 25, 26, 37, 38, 45, 46, 53, 54);

// Giày
        List<Integer> giay = Arrays.asList(27, 28, 29, 30, 31, 32, 39, 40, 47, 48, 55, 56);

// Rada
        List<Integer> rada = Arrays.asList(12, 13, 14, 15, 16, 17, 18, 19, 20, 57, 58, 59);
        if (ao.contains(tempId)) {
            it.options.add(new Item.ItemOption(47, highlightsItem(it.itemTemplate.gender == 2, 100)));
        }
        if (quan.contains(tempId)) {
            it.options.add(new Item.ItemOption(22, highlightsItem(it.itemTemplate.gender == 0, new Random().nextInt(11) + 5)));
        }
        if (gang.contains(tempId)) {
            it.options.add(new Item.ItemOption(0, highlightsItem(it.itemTemplate.gender == 2, new Random().nextInt(1001) + 200)));
        }
        if (giay.contains(tempId)) {
            it.options.add(new Item.ItemOption(23, highlightsItem(it.itemTemplate.gender == 1, new Random().nextInt(11) + 5)));
        }
        if (rada.contains(tempId)) {
            it.options.add(new Item.ItemOption(14, new Random().nextInt(3) + 15));
        }
        it.options.add(new Item.ItemOption(205, 1));
//        it.options.add(new Item.ItemOption(21, 0));
        if (Util.isTrue(90, 100)) {// tỉ lệ ra spl
            it.options.add(new Item.ItemOption(107, new Random().nextInt(4)));
        } else if (Util.isTrue(80, 100)) {
            it.options.add(new Item.ItemOption(107, 3 + new Random().nextInt(2)));
        }
        it.options.add(new Item.ItemOption(21, 15));
        return it;
    }

    public static int highlightsItem(boolean highlights, int value) {
        double highlightsNumber = 1.1;
        return highlights ? (int) (value * highlightsNumber) : value;
    }

    public static Item sendDo(int itemId, int sql, List<Item.ItemOption> ios) {
//        InventoryServiceNew.gI().addItemBag(player, ItemService.gI().createItemFromItemShop(is));
//        InventoryServiceNew.gI().sendItemBags(player);
        Item item = ItemService.gI().createNewItem((short) itemId);
        item.itemOptions.addAll(ios);
        item.itemOptions.add(new Item.ItemOption(107, sql));
        return item;
    }

    public static boolean checkDo(Item.ItemOption itemOption) {
        switch (itemOption.optionTemplate.id) {
            case 0:// tấn công
                if (itemOption.param > 12000) {
                    return false;
                }
                break;
            case 14:// chí mạng
                if (itemOption.param > 30) {
                    return false;
                }
                break;
            case 107:// spl
            case 102:// spl
                if (itemOption.param > 8) {
                    return false;
                }
                break;
            case 77:
            case 103:
            case 95:
            case 96:
                if (itemOption.param > 41) {
                    return false;
                }
                break;
            case 50:// sd 3%
                if (itemOption.param > 24) {
                    return false;
                }
                break;
            case 6:// hp
            case 7:// ki
                if (itemOption.param > 120000) {
                    return false;
                }
                break;
            case 47:// giáp
                if (itemOption.param > 3500) {
                    return false;
                }
                break;
        }
        return true;
    }

    public static void useCheckDo(Player player, Item item, String position) {
        try {
            if (item.template != null) {
                if (item.template.id >= 381 && item.template.id <= 385) {
                    return;
                }
                if (item.template.id >= 66 && item.template.id <= 135) {
                    return;
                }
                if (item.template.id >= 474 && item.template.id <= 515) {
                    return;
                }
                item.itemOptions.forEach(itemOption -> {
                    if (!Util.checkDo(itemOption)) {
                        Logger.error(player.name + "-" + item.template.name + "-" + position + "\n");
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.logException(Manager.class, e, "Lỗi use checkdo");
        }
    }

    public static String phanthuong(int i) {
        switch (i) {
            case 1:
                return "5tr";
            case 2:
                return "3tr";
            case 3:
                return "1tr";
            default:
                return "100k";
        }
    }

    public static int randomBossId() {
        int bossId = Util.nextInt(9999999);
        while (BossManager.gI().getBossById(bossId) != null) {
            bossId = Util.nextInt(9999999);
        }
        if (bossId > 0) {
            bossId *= -1;
        }
        return bossId;
    }

    public static long tinhLuyThua(int coSo, int soMu) {
        long ketQua = 1;

        for (int i = 0; i < soMu; i++) {
            ketQua *= coSo;
        }
        return ketQua;
    }

    public static void checkPlayer(Player player) {
        new Thread(() -> {
            List<Player> list = Client.gI().getPlayers().stream().filter(p -> !p.isPet && !p.isNewPet && p.getSession().userId == player.getSession().userId).collect(Collectors.toList());
            if (list.size() > 1) {
                list.forEach(pp -> Client.gI().kickSession(pp.getSession()));
                list.clear();
            }
        }).start();
    }

    public static int[] pickNRandInArr(int[] array, int n) {
        List<Integer> list = new ArrayList<Integer>(array.length);
        for (int i : array) {
            list.add(i);
        }
        Collections.shuffle(list);
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
