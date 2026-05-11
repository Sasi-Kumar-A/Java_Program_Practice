package Java_Fundamentals;
import java.util.*;
public class HappyNumber {
	static Scanner sc = new Scanner(System.in);
	public static void checkHappy(int num) {
		int temp = num;
		int sum =0;
		while(temp > 0) {
			int a = temp%10;
			sum += a*a;
			temp /=10;
		}
		
		if( sum == 1)
			System.out.println("It's Happy Number");
		else if( sum == 4 ) {
			System.out.println("It's Not an Happy Number: ");
		}
		else 
			checkHappy(sum);
	}
	public static void main(String args[]) {
		System.out.print("Enter the Number to check Happy Number or Not: ");
		int num = sc.nextInt();
		
		checkHappy(num);
	}
}
