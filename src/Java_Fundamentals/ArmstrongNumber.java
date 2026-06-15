package Java_Fundamentals;
import java.util.*;

public class ArmstrongNumber {

	static Scanner sc = new Scanner(System.in);
	public static void getArmstrong(int n) {
		int count = 0;
		int temp = n;
		while(temp > 0) {
			count++;
			temp /=10;
		}
		System.out.println(count);
		
		int res = n;
		int ans = 0;
		while(res > 0) {
			int a = res %10;
			ans = ans + (Math.powExact(a, count));
			
			res /=10;
		}
		
		if(ans == n) {
			System.out.println("This Number is Armstrong Number: "+ans);
		}
		else {
			System.out.println("This number is not a Armstrong Number:"+ans);
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Number to check the Armstrong: ");
		int num = sc.nextInt();
		
		getArmstrong(num);
	}
}
