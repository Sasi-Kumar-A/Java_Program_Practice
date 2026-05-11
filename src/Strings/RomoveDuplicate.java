package Strings;
import java.util.Scanner;
public class RomoveDuplicate {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.print("Enter the String to Remove the Duplicate ");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if already exists in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Result: " + result);
    }
}
