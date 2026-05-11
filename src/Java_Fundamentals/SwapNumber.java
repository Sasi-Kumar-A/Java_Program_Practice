package Java_Fundamentals;
import java.util.*;
public class SwapNumber {
	static Scanner sc = new Scanner(System.in);
	public static void valueSwap(int a , int b) {
//		int temp = 0;
		
//		temp = a;
//		a = b;
//		b = temp;
		
		a = a+b-a;
		b = a+b-b;
		System.out.println(a+" "+b);
	}
	public static void main(String args[]) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+" "+num2);
		valueSwap(num1,num2);
	}
}
