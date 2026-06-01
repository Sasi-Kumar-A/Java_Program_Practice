//<<<<<<< HEAD
package Strings;

import java.util.*;

public class ValidData {
    
    public static boolean isValid(String email) {
        
        return email.contains("@") &&
               email.contains(".") &&
               !email.contains(" ");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if(isValid(email))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}
//=======
//package Strings;
//
//import java.util.*;
//
//public class ValidData {
//    
//    public static boolean isValid(String email) {
//        
//        return email.contains("@") &&
//               email.contains(".") &&
//               !email.contains(" ");
//    }
//
//    public static void main(String[] args) {
//        
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Email: ");
//        String email = sc.nextLine();
//
//        if(isValid(email))
//            System.out.println("Valid Email");
//        else
//            System.out.println("Invalid Email");
//    }
//>>>>>>> b32fe2fb88d3f43a59f3bcb29af7453a8ca8a580
//}