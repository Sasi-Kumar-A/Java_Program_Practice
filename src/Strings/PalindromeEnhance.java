package Strings;
import java.util.*;

public class PalindromeEnhance {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the String to check Palindrome or not:");
		String str = sc.nextLine();
		
		boolean st = str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
		
		System.out.println(st?"Palindrome":"Not Palindrome");
		
	}
}
