package Grooming;

import java.util.*;

public class SubString {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String s ="";
		String longest = "";
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				s = s+str.charAt(j);
				if(s.contains(str) && s.length() > longest.length()) {
					longest = s;
				}
			}
			s = "";
		}
		System.out.println(longest);
	}
}
