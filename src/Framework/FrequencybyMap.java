package Framework;

import java.util.LinkedHashMap;

public class FrequencybyMap {

	public static void main(String[] args) {
		String str = "Hellosasi";
		
		LinkedHashMap<Character, Integer> lh = new  LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(lh.containsKey(c)) {
				lh.put(c, lh.get(c) + 1);
			}
			else {
				lh.put(c, 1);
			}
		}
		System.out.println(lh);
	}
}
