
// video 15
import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {
        // get bit
        // int n =5; // 0101
        // int pos = 3;
        // int bitMask = 1<< pos;

        // if((bitMask & n) == 0){
        // System.out.println("bit was zero");
        // }else{
        // System.out.println("bit was one");
        // }

        // set bit
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // clear bit
        // int n = 5; // 0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 : set ; oper = 0: clear
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
