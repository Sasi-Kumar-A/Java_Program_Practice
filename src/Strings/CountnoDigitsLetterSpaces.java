package Strings;
import java.util.*;

public class CountnoDigitsLetterSpaces {
	static Scanner sc = new Scanner(System.in);
	public static void countType(String str) {
		int letter = 0,number = 0,space = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch))
				letter++;
			else if(Character.isDigit(ch))
				number++;
			else if(ch == ' ')
				space++;
			
		}
		System.out.println("Character Letter Count is: "+letter);
		System.out.println("Number of Count in the Sentence is: "+number);
		System.out.println("Number of Space in the Sentence: "+space);
	}
	public static void main(String args[]) {
		System.out.println("Enter the String that must mixed Alphabet , Number , Space.:" );
		String str = sc.nextLine();
		
		countType(str);
	}

}
