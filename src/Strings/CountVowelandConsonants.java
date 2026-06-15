package Strings;

import java.util.*;

public class CountVowelandConsonants {

	static Scanner sc = new Scanner(System.in);
	public static void getVowelCountandConsonantCount(String str) {
		char c[] = {'a','e','i','o','u'};
		int vowelcount = 0, consonantcount = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a'|| ch== 'e'||ch == 'i'|| ch == 'o'||ch == 'u') {
					vowelcount++;
				}
				else
				{
					consonantcount++;
				}
			}
		}
		
		System.out.println("The vowel Count is "+vowelcount+"\nThis is a Consonant Count"+consonantcount);
	}
	public static void main(String[] args) {
		System.out.print("Enter the String to Count the Vowels and Consonant: ");
		String str = sc.nextLine();
		
		getVowelCountandConsonantCount(str);
	}
}
