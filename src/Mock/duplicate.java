package Mock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
		for(String a : arr) {
			lh.put(a, lh.getOrDefault(a, 0)+1);
		}
		
		System.out.println(lh.keySet());
		System.out.println(lh);
		
		
	}
}
