package Java_Fundamentals;

import java.util.*;

public class Neon_Number {

	static Scanner sc = new Scanner(System.in);
	public static void checkNeon(int num) {
		int res =Math.powExact(num, 2);
		int temp = num, sum = 0;
		
		while(temp > 0) {
			int a = temp%10;
			sum += a;
			temp /=10;
		}
		
		if(sum == num) {
			System.out.println("This Number is Neon Number: "+num);
		}
		else {
			System.out.println("This is not a Neon Number");
		}
	}
	
	public static void main(String args[]) {
		System.out.print("Enter the Number to check Neon or Not: ");
		int num = sc.nextInt();
		
		checkNeon(num);
	}
}
