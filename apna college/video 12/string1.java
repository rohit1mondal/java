import java.util.*;

public class string1 {
    public static void main(String args[]) {
        // String Declaration
        // String name = "Tony Starc";

        // Scanner sc = new Scanner(System.in);
        // string1 name = sc.next();
        // System.out.println("Your name is: "+ name);

        // Concatenation
        // String firstName = "Tony";
        // String lastName = "Starc";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // charAt
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }

}
// import java.util.Scanner;

// public class string1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your name: ");
// String name = sc.next(); // Use the correct type
// System.out.println("Hello, " + name + "!");
// sc.close();
// }
// }
