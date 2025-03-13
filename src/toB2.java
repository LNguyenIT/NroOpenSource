/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.*;
public class toB2 {
    static Map<Integer, MobReward> MOB_REWARDS = new HashMap<>();

    public static void main(String[] args) {
        readMobRewardsFromFile("data/girlkun/mob_reward_output.txt");
        writeMobRewardsToBinaryFile("data/girlkun/mob_reward_rewritten");
    }

    public static void readMobRewardsFromFile(String inputFilePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            String line;
            MobReward currentMobReward = null;
            ItemMobReward currentItem = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Mob ID:")) {
                    int mobId = Integer.parseInt(line.split(":")[1].trim());
                    currentMobReward = new MobReward(mobId);
                    MOB_REWARDS.put(mobId, currentMobReward);
                } else if (line.startsWith("  Gold Reward Item ID:") || line.startsWith("  Item Reward Item ID:")) {
                    if (currentMobReward != null) {
                        int itemId = Integer.parseInt(line.split(":")[1].trim());
                        currentItem = new ItemMobReward(itemId, new int[]{}, new String[]{}, new String[]{}, 0);
                        if (line.startsWith("  Gold Reward Item ID:")) {
                            currentMobReward.getGoldReward().add(currentItem);
                        } else {
                            currentMobReward.getItemReward().add(currentItem);
                        }
                    }
                } else if (line.startsWith("    Quantity:")) {
                    if (currentItem != null) {
                        String[] quantity = line.split(":")[1].trim().replaceAll("[\\[\\]]", "").split(",");
                        currentItem.quantity = Arrays.stream(quantity).map(String::trim).mapToInt(Integer::parseInt).toArray();
                    }
                } else if (line.startsWith("    Ratio:")) {
                    if (currentItem != null) {
                        String[] ratio = line.split(":")[1].trim().replaceAll("[\\[\\]]", "").split(",");
                        currentItem.ratio = Arrays.stream(ratio).map(String::trim).mapToInt(Integer::parseInt).toArray();
                    }
                } else if (line.startsWith("    Gender:")) {
                    if (currentItem != null) {
                        currentItem.gender = Integer.parseInt(line.split(":")[1].trim());
                    }
                } else if (line.startsWith("    Map Drop:")) {
                    if (currentItem != null) {
                        String[] mapDrop = line.split(":")[1].trim().replaceAll("[\\[\\]]", "").split(",");
                        currentItem.mapDrop = Arrays.stream(mapDrop).map(String::trim).mapToInt(Integer::parseInt).toArray();
                    }
                } else if (line.startsWith("    Option ID:")) {
                    if (currentItem != null) {
                        int optionId = Integer.parseInt(line.split(":")[1].trim());
                        String param = reader.readLine().split(":")[1].trim().replaceAll("[\\[\\]]", "");
                        String ratioOption = reader.readLine().split(":")[1].trim().replaceAll("[\\[\\]]", "");
                        ItemOptionMobReward option = new ItemOptionMobReward(optionId,
                                param.split(","), ratioOption.split(","));
                        currentItem.options.add(option);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeMobRewardsToBinaryFile(String outputFilePath) {
        try {
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            DataOutputStream dos = new DataOutputStream(fos);

            for (MobReward mobReward : MOB_REWARDS.values()) {
                dos.writeInt(mobReward.getGoldReward().size() + mobReward.getItemReward().size());
                for (ItemMobReward item : mobReward.getGoldReward()) {
                    writeItemToBinary(dos, item);
                }
                for (ItemMobReward item : mobReward.getItemReward()) {
                    writeItemToBinary(dos, item);
                }
            }

            dos.close();
            fos.close();
            System.out.println("Dữ liệu đã được ghi thành công vào " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeItemToBinary(DataOutputStream dos, ItemMobReward item) throws IOException {
        dos.writeInt(item.itemId);
        dos.writeUTF(String.join("-", Arrays.toString(item.quantity)));
        dos.writeUTF(String.join("-", Arrays.toString(item.ratio)));
        dos.writeInt(item.gender);
        dos.writeUTF(Arrays.toString(item.mapDrop).replaceAll("[\\[\\] ]", ""));
        dos.writeInt(item.options.size());
        for (ItemOptionMobReward option : item.options) {
            dos.writeInt(option.optionId);
            dos.writeUTF(String.join("-", Arrays.toString(option.param).replaceAll("[\\[\\] ]", "")));
            dos.writeUTF(String.join("-", Arrays.toString(option.ratioOption).replaceAll("[\\[\\] ]", "")));
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
            this.quantity = Arrays.stream(quantity).map(String::trim).mapToInt(Integer::parseInt).toArray();
            this.ratio = Arrays.stream(ratio).map(String::trim).mapToInt(Integer::parseInt).toArray();
            this.gender = gender;
        }
    }

    static class ItemOptionMobReward {
        int optionId;
        int[] param;
        int[] ratioOption;

        public ItemOptionMobReward(int optionId, String[] param, String[] ratioOption) {
            this.optionId = optionId;
            this.param = Arrays.stream(param).map(String::trim).mapToInt(Integer::parseInt).toArray();
            this.ratioOption = Arrays.stream(ratioOption).map(String::trim).mapToInt(Integer::parseInt).toArray();
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
}
