package Java_Fundamentals;
import java.util.*;
public class PalindromeCheck {
	static Scanner sc = new  Scanner(System.in);
	public static boolean checkPalindrome(int num) {
		int temp = num;
		int ans =0;
		while(num >0) {
			int a = num%10;
			ans = (ans * 10) +a;
			num /= 10;
			System.out.println(ans);
		}
		if(ans != temp )
			return false;
		
	return true;
	}
	public static void main(String args[]) {
		System.out.print("Enter the Number to check the NUmber is Palindrome or Not: ");
		int num = sc.nextInt();
		
		System.out.println(checkPalindrome(num));
	}
}
