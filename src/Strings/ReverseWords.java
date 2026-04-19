package Strings;
import java.util.*;
public class ReverseWords {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the String to Reverse the String ");
        String str =sc.nextLine();
        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = ch + word; // reverse word
            } else {
                result += word + " ";
                word = "";
            }
        }

        result += word; // last word

        System.out.println(result);
    }

}
