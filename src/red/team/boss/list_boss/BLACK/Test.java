/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package red.team.boss.list_boss.BLACK;

import java.util.Random;
import red.team.server.Manager;

/**
 *
 * @author Acer
 */
public class Test {

    public static void main(String[] args) {
        byte randomDo;
        while (true) {
            randomDo = (byte) new Random().nextInt(Manager.itemIds_TL.length);
            System.out.println("Số được hiển thị ra là: " + randomDo);
        }
    }
}
