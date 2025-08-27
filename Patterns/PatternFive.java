package Patterns;
/*
    * 
   *** 
  ***** 
 *******

 */

import java.util.Scanner;;

public class PatternFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();

        for (int i = 1; i <=r; i++) {

            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

