/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encoding_Recoding;

/**
 *
 * @author Acer
 */
import java.io.*;

public class ReadMobReward {
    public static void main(String[] args) throws IOException {
        File file = new File("data/girlkun/mob_reward/mob_reward.dat");
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        
        int size = dis.readInt();
        System.out.println("Số lượng quái: " + size);
        
        for (int i = 0; i < size; i++) {
            int mobId = dis.readInt();
            int itemId = dis.readInt();
            String quantity = dis.readUTF();
            String ratio = dis.readUTF();
            int gender = dis.readInt();
            String map = dis.readUTF();
            
            System.out.println("Mob: " + mobId + ", Item: " + itemId + ", Số lượng: " + quantity + ", Tỷ lệ: " + ratio);
            
            int sizeOption = dis.readInt();
            for (int j = 0; j < sizeOption; j++) {
                int optionId = dis.readInt();
                String param = dis.readUTF();
                String ratioOption = dis.readUTF();
                System.out.println(" - Option " + optionId + ": " + param + " (Tỷ lệ: " + ratioOption + ")");
            }
            System.out.println("----------------------");
        }
        
        dis.close();
    }
}

