import java.util.*;

public class patterns {
    public static void main(String[] args) {
        // print the patterns
        int n = 4;
        // int m = 5;

        // 1st pattern (solid rectangle)
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 2nd pattern (hollow rectangle)
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if(i==1 || j==1 || i==n || j==m){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 3rd pattern (Half pyramid)
        // for (int i =1;i<=n;i++){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 4th pattern(Inveerted half pyramid)
        // for (int i = n;i>=1;i--){
        // for (int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 5th pattern (Inverted & rotated-180 half pyramid)
        // for (int i = 1; i <= n; i++) {
        // // inner loop ->spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // inner loop -> stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }
}