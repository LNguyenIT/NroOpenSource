/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encoding_Recoding;

import red.team.server.Manager;
import red.utils.Util;

/**
 *
 * @author Acer
 */

public class test {
//    private void increasePoint() {
//        if (this.nPoint != null && Util.canDoWithTime(lastTimeIncreasePoint, 1)) {
//            if (Util.isTrue(40, 100)) {
//                this.nPoint.increasePointDT((byte) 2, (short) 1);
//            } else {
//                byte tp = (byte) Util.nextInt(0, 1);
//                short point = (short) Util.nextInt(Manager.RATE_EXP_SERVER);
//                this.nPoint.increasePointDT(tp, point);
//            }
//            lastTimeIncreasePoint = System.currentTimeMillis();
//        }
//    }
    public static boolean isTrue(int ratio, int typeRatio) {
        int a = Util.nextInt(typeRatio);
        return a < ratio;
    }
    public static void main(String[] args){
        
//        for(int i = 0; i<=10; i++){
//            if (Util.isTrue(40, 100)) {
//                System.out.println("Nâng SD");
//            } else {
//                byte tp = (byte) Util.nextInt(0, 1);
//                System.out.println("Số in ra là: "+tp);
//            }
//        }
            System.out.println("Số in ra là: "+Long.MAX_VALUE);
        
    }
}
