package Strings;
import java.util.*;
public class ComparetheString {
	public static void main(String args[]) {
		String str[] = {"Grapes","Kiwi","Orange","Banana","lemon","Apple"};
		
		for(int i=0;i<str.length-1;i++) {
			for(int j=0;j<str.length-1;j++) {
				if(str[j].compareTo(str[j+1])>0) {
						String temp = str[j];
						str[j] = str[j+1];
						str[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
