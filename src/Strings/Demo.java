package Strings;
import java.util.*;

public class Demo {
	static Scanner  sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter the String ");
		String str = sc.nextLine();
		
		String word = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				System.out.println(word= ch+word);
			}
		}
	}
}
