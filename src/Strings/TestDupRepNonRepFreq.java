package Strings;

import java.util.*;
public class TestDupRepNonRepFreq {

	static Scanner sc = new Scanner(System.in);
	public static void getresult(String str) {
		int n = str.length();
		
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				lh.put(ch, lh.getOrDefault(ch, 0)+1);
			}
		}
		
		System.out.print("Repeating Character are:");
		for(Map.Entry<Character, Integer> entry : lh.entrySet())
		if(entry.getValue() > 1) {
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		
		System.out.print("Non-Repeating Character are:");
		for(Map.Entry<Character, Integer> entry : lh.entrySet())
		if(entry.getValue() == 1) {
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		
		System.out.print("Duplicate Character are:");
		for(Map.Entry<Character, Integer> entry : lh.entrySet())
		if(entry.getValue() > 1) {
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		
		
		System.out.println("Frequency of the Characters: "+lh);
	}
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		getresult(str);
	}
}
