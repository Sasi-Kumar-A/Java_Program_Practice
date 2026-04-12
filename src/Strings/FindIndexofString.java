package Strings;
import java.util.*;
public class FindIndexofString {
	static Scanner sc = new Scanner(System.in);
	public static int strOccurance(String haystack , String needle) {
//		int a = haystack.length();
//		int b = needle.length();
//		
//		if(b > a)
//			return -1;
//		
//		for(int i=0;i<a-b;i++) {
//			if(haystack.substring(i,i+b).equals(needle))
//				return i;
//		}
//		return -1;
		
		return haystack.indexOf(needle);
	}
	public static void main(String args[]) {
		String haystack = sc.nextLine();
		String needle = sc.nextLine();
		
		int data = strOccurance(haystack,needle);
		System.out.println(data);
	}
}
