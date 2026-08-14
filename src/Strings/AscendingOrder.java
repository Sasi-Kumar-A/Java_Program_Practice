package Strings;

import java.util.Scanner;
import java.util.*;

public class AscendingOrder {
	public static String Ascending(String str) {
		int n = str.length();
		char ans[] = str.toCharArray();
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				
				if(ans[j] > ans[j+1]) {
					char temp = ans[j];
					ans[j] = ans[j+1];
					ans[j+1] = temp;
				}
			}
		}
		String s = "";
		for(char c : ans) {
			s = s+c;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		String s[] = str.split("\\s+");
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String c : s) {
			ts.add(c);
		}
		
		for(String c : ts) {
			String ans = Ascending(c);
			System.out.print(ans+" ");
		}
		
	}
}
