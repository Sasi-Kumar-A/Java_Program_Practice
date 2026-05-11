package Java_Fundamentals;
import java.util.*;
public class FibonacciNumber {
	static Scanner sc = new Scanner(System.in);
	public static void getFibonacciNumber(int a , int b , int num) {
		int ans =0;
		System.out.print("Fibonacci Series: "+a+" "+b+" ");
		while(ans <= num) {
			ans= a+b;
			System.out.print(ans+" ");
			a = b;
			b = ans;
			
		}
		
	}
	public static void main(String args[]) {
		int a = 0, b =1;
		System.out.print("Enter the number upto the series is repeat: ");
		int num = sc.nextInt();
		
		getFibonacciNumber(a,b,num);
	}
}
