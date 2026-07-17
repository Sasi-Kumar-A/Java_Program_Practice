package Java_Fundamentals;

import java.util.*;
public class PatternX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i == j || j == a-i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
