import java.util.*;

public class patterns2 {

    public static void main(String[] args) {
        // 6th pattern (Pyramid with Numbers)

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // 7th pattern (Inverted half pyramid with numbers)
        // int n = 5;

        // //outer loop
        // for (int i =1; i<=n;i++){
        //     //inner loop
        //     for (int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //8th pattern (Floyd's triangle)
        // int n =5;
        // int number = 1;

        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print(number+ " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 9th pattern (0-1 triangle)

        int n = 5;

        for (int i = 1;i <= n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}