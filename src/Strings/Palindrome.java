package Strings;
import java.util.*;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	public static void Palindromecheck(String str) {
		String str1 = "";
		int left = 0, right = str.length()-1;
		boolean ispalindrome = true;
		while(left <= right) {
			if(str.charAt(left) != str.charAt(right)) {
				ispalindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(ispalindrome)System.out.println("Palindrome");
		else 
			System.out.println("Not a Palindrome");

	}
	public static void main(String args[]) {
		String str = sc.nextLine();
		
		Palindromecheck(str);
	}
}
