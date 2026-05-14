package Strings;
import java.util.*;
public class LengthofLastWord {
	static Scanner sc = new Scanner(System.in);
	public static int getlengthofLastWord(String str) {
		int count = 0;
		int n = str.length()-1;
		while(n >= 0 && str.charAt(n) == ' ')
			n--;
		
		while(n >=0 && str.charAt(n) != ' ') {
			count++;
			n--;
		}
		return count;
	}
	public static void main(String args[]) {
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println(getlengthofLastWord(str));
	}
}
