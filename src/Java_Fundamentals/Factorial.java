package Java_Fundamentals;
import java.util.*;
public class Factorial {
	static Scanner sc = new Scanner(System.in);
	public static int getFactorialValue(int num) {
		int ans =1;
		for(int i=1;i<=num;i++) {
			ans = ans *i;
		}
		return ans;
	}
	public static void main(String args[]) {
		System.out.print("Enter the Number to get the Factorial Value: ");
		int num = sc.nextInt();
		
		System.out.println(getFactorialValue(num));
	}
}
