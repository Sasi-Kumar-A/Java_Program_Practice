package Strings;
import java.util.*;
public class TakeStringSortedArray {
	public static void main(String args[]) {
		String str = "aUjYujMBeDs";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
		int x=0;
		String upper = "",lower ="";
		for(char c : ch) {
			if(Character.isUpperCase(c))
				upper += c;
			else
				lower +=c;
			
////			ch = str.charAt(i);
//			System.out.println(str.charAt(i));
//			if(str.charAt(i).equals(Character.isUpperCase(str[i])))
//				str.charAt(i) = Character.isUpperCase(ch[x++]);
//			else
//				str.charAt(i) = Character.isLowerCase(ch[y++]);
		}
		int u=0,l=0;
		char result[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				result[i] = upper.charAt(u++);
			else
				result[i] = lower.charAt(l++);
		}
		System.out.println(new String(result));
	}
}
