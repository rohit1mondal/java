import java.util.*;

public class patterns1 {
    public static void main(String[] args) {
        // int n = 5;

        // 11th pattern
        // for (int i = 1; i <= n; i++) {
        // //spaces
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");
        // }

        // //stars
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 12th pattern
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // 13th pattern
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     // 1st half numbers
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }

        //     // 2nd half numbers
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }

        //14th pattern 
        int n = 4;
        //upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i>= 1; i--) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
