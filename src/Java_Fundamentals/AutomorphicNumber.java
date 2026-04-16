package Java_Fundamentals;
import java.util.*;
public class AutomorphicNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter the Number to check the Number is Automorphic or Not: ");
		int num = sc.nextInt();
//		int data = num * num;
		int count = 0;
		int temp = num;
		while(temp > 0) {
			count++;
			temp /= 10;
		}
//		int digits = String.valueOf(num).length();
		System.out.println(count);
		int res = (int)Math.pow(num, 2);
		int lastDigits =(res % Math.powExact(10, count));
		if( lastDigits == num)
			System.out.println("Its an Automorphic Number"+res);
		else 
			System.out.println("Its not a Automorphic Number: "+res);
	}
}
