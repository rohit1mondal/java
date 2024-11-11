import java.util.*;

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age > 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("not Adult");
//         }
//     }
// }

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a == b) {
//             System.out.println("Both are equal");
//         } else if (a > b) {
//             System.out.println("a is greater");
//         } else {
//             System.out.println(" a is lesser");
//         }
//     }
// }

public class conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:System.out.println("Hello");
                break;
            case 2:System.out.println("hey!");
            break;
            case 3:System.out.println("hii!");
            break;
            default:System.out.println("Invalid Button");
                break;
        }
    }
}