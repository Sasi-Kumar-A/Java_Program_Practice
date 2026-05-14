package Java_Fundamentals;
import java.util.*;

public class PerfectNumber {
	static Scanner sc = new Scanner(System.in);
	public static void perfectCheck(int num) {
		int res = 0;
		for(int i=1;i<=num/2;i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		res += num%2;
		System.out.println(res);
	}
	public static void main(String args[]) {
		System.out.print("Enter the Number to check is perfect: ");
		int num = sc.nextInt();
		
		perfectCheck(num);
	}
}
