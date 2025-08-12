import sun.awt.geom.AreaOp;

import java.util.Scanner;

/**THIS CODE WRITE BY
 * SAHARIYAR AHAMAD
 * sahariarahamad (Github)
 * sahariyarahamadbd (facebook)
 * codewithnoyon (youtube)
 */

public class Main {

    // 1st way ===============================================

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            if (s1.length() > 10){
                s1 = s1.substring(0, 10);
            }

            System.out.printf("%-15s%03d \n", s1, x);


        }
        System.out.println("================================");



    } // end main ================================


    /* 2nd way =========================================================
        public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        String tenChar = "";
        System.out.println("================================");
        for(int i=0;i<3;i++){
        String s1=sc.next();
        int x=sc.nextInt();

        String tempConvert = String.valueOf(x);

        // cut up to 10 char
        if (s1.length() >= 10){
            tenChar = s1.substring(0, 10);
        }else {
            tenChar = s1;
        }

        // cut number
        if (tempConvert.length() < 3){
            if (tempConvert.length() == 1){
                System.out.printf("%-15s00%d \n", tenChar, x);
            }
            if (tempConvert.length() == 2){
                System.out.printf("%-15s0%d \n", tenChar, x);
            }
        }else if (tempConvert.length() >= 3){

            System.out.printf("%-15s%d \n", tenChar, x);
        }

    }
        System.out.println("================================");
} // end main ================================
    */

}