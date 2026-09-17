package Grooming;

import java.util.*;

public class SubStringNonRepeating {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;
        int start = 0;

        for (int right=0; right<str.length();right++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left,map.get(ch)+ 1);
            }
            map.put(ch, right);

            if (right - left+1 > maxLen) {
                maxLen = right - left+ 1;
                start = left;
            }
        }

        System.out.println("Longest Substring: "+str.substring(start, start+maxLen));

        System.out.println("Length: "+maxLen);
		
	}
}
