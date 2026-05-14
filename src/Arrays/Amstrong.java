package Arrays;
import java.util.*;
public class Amstrong {
	static Scanner sc = new Scanner(System.in);
	public static String CheckAmstrongNumber(int num) {
		int count =0;
		int temp = num,org = num;
		int ans =0;

		while(num >0) {
			int a = num % 10;
			count++;
			num /= 10;
		}
		int sum =0;
		while(temp >0) {
			int a = temp%10;
			System.out.println(a);
			sum =sum + Math.powExact(a,count);
//			ans+=sum;
			System.out.println(sum);
			temp /=10;
			
		}
		System.out.println(ans);
		if(sum == org )
			return "Its Amstrong Number";
		
		return "Its Not a Amstrong";		
	}
	public static void main(String args[]) {
		System.out.print("Enter the number");
		int num = sc.nextInt();
		System.out.println(CheckAmstrongNumber(num));
	}
}
