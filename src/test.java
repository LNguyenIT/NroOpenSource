import java.io.*;
import java.util.*;

public class test {
    static Map<Integer, MobReward> MOB_REWARDS = new HashMap<>();

    public static void main(String[] args) {
        loadMobRewards();
        writeMobRewardsToFile("data/girlkun/mob_reward_output.txt");
    }

    public static void loadMobRewards() {
        try {
            File folder = new File("C:\\Users\\Acer\\OneDrive\\Máy tính\\FILE NRO\\redv4\\data\\girlkun\\mob_reward");
            for (File fileEntry : folder.listFiles()) {
                if (!fileEntry.isDirectory()) {
                    DataInputStream dis = new DataInputStream(new FileInputStream(fileEntry));
                    int size = dis.readInt();
                    for (int i = 0; i < size; i++) {
                        int mobId = dis.readInt();
                        MobReward mobReward = MOB_REWARDS.get(mobId);
                        if (mobReward == null) {
                            mobReward = new MobReward(mobId);
                            MOB_REWARDS.put(mobId, mobReward);
                        }
                        int itemId = dis.readInt();
                        String quantity = dis.readUTF();
                        String ratio = dis.readUTF();
                        int gender = dis.readInt();
                        String map = dis.readUTF();
                        String[] arrMap = map.replaceAll("[\\]\\[]", "").split(",");
                        int[] mapDrop = new int[arrMap.length];
                        for (int g = 0; g < mapDrop.length; g++) {
                            mapDrop[g] = Integer.parseInt(arrMap[g]);
                        }
                        ItemMobReward item = new ItemMobReward(itemId, mapDrop,
                                quantity.split("-"), ratio.split("-"), gender);
                        // Logic for item.getTemp().type
                        ItemTemplate temp = new ItemTemplate(itemId);
                        if (temp.type == 30) { // sao pha lê
                            item.ratio = new int[]{20, Integer.parseInt(ratio.split("-")[1])};
                        }
                        if (temp.type == 14) { // đá nâng cấp
                            item.ratio = new int[]{20, Integer.parseInt(ratio.split("-")[1])};
                        }
                        if (temp.type < 5) {
                            item.ratio = new int[]{Integer.parseInt(ratio.split("-")[0]), Integer.parseInt(ratio.split("-")[1]) / 4 * 3};
                        }
                        if (temp.type == 9) { // vàng
                            mobReward.getGoldReward().add(item);
                        } else {
                            mobReward.getItemReward().add(item);
                        }
                        int sizeOption = dis.readInt();
                        for (int j = 0; j < sizeOption; j++) {
                            int optionId = dis.readInt();
                            String param = dis.readUTF();
                            String ratioOption = dis.readUTF();
                            ItemOptionMobReward option = new ItemOptionMobReward(optionId,
                                    param.split("-"), ratioOption.split("-"));
                            item.options.add(option);
                        }
                    }
                    dis.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeMobRewardsToFile(String outputFilePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            for (MobReward mobReward : MOB_REWARDS.values()) {
                writer.write("Mob ID: " + mobReward.getMobId() + "\n");
                for (ItemMobReward item : mobReward.getItemReward()) {
                    writer.write("  Item Reward Item ID: " + item.itemId + "\n");
                    writer.write("    Quantity: " + Arrays.toString(item.quantity) + "\n");
                    writer.write("    Ratio: " + Arrays.toString(item.ratio) + "\n");
                    writer.write("    Gender: " + item.gender + "\n");
                    writer.write("    Map Drop: " + Arrays.toString(item.mapDrop) + "\n");
                    for (ItemOptionMobReward option : item.options) {
                        writer.write("    Option ID: " + option.optionId + "\n");
                        writer.write("      Param: " + Arrays.toString(option.param) + "\n");
                        writer.write("      Ratio Option: " + Arrays.toString(option.ratioOption) + "\n");
                    }
                }
            }
            writer.close();
            System.out.println("Dữ liệu đã được ghi thành công vào " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ItemMobReward {
        int itemId;
        int[] mapDrop;
        int[] quantity;
        int[] ratio;
        int gender;
        List<ItemOptionMobReward> options = new ArrayList<>();

        public ItemMobReward(int itemId, int[] mapDrop, String[] quantity, String[] ratio, int gender) {
            this.itemId = itemId;
            this.mapDrop = mapDrop;
            this.quantity = Arrays.stream(quantity).mapToInt(Integer::parseInt).toArray();
            this.ratio = Arrays.stream(ratio).mapToInt(Integer::parseInt).toArray();
            this.gender = gender;
        }
    }

    static class ItemOptionMobReward {
        int optionId;
        int[] param;
        int[] ratioOption;

        public ItemOptionMobReward(int optionId, String[] param, String[] ratioOption) {
            this.optionId = optionId;
            this.param = Arrays.stream(param).mapToInt(Integer::parseInt).toArray();
            this.ratioOption = Arrays.stream(ratioOption).mapToInt(Integer::parseInt).toArray();
        }
    }

    static class MobReward {
        int mobId;
        List<ItemMobReward> goldReward = new ArrayList<>();
        List<ItemMobReward> itemReward = new ArrayList<>();

        public MobReward(int mobId) {
            this.mobId = mobId;
        }

        public int getMobId() {
            return mobId;
        }

        public List<ItemMobReward> getGoldReward() {
            return goldReward;
        }

        public List<ItemMobReward> getItemReward() {
            return itemReward;
        }
    }

    static class ItemTemplate {
        int type;

        ItemTemplate(int id) {
            // Dummy implementation
            this.type = id % 30; // Example logic to set type
        }
    }
}
