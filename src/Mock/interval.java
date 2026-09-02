package Mock;

import java.util.Scanner;

public class interval {

	static Scanner sc = new Scanner(System.in);
	public static boolean isvalid(int temp) {
		
		String str = ""+temp;
		
		for(int i=1;i<str.length();i++) {
			int p = str.charAt(i-1)-'0';
			
			int cur = str.charAt(i)-'0';
			
			if(Math.abs(p-cur) != 1) {
				return false;
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		System.out.println(isvalid(num));
		
		
	}
}
