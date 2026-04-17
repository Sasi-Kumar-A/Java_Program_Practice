package Java_Fundamentals;
import java.util.*;
public class StrongNumber {
	static Scanner sc = new Scanner(System.in);
	public static void checkStrong(int num) {
		int temp = num;
		int sum = 0,fact =1;
		while(temp > 0) {
			int a = temp %10;
			fact =1;
			for(int i=1;i<=a;i++)
				fact *= i;
			
			sum += fact;
			temp /=10;
		}
//		sum+=1;
		System.out.println(sum+" "+num);
		if(num == sum)
			System.out.println("Strong");
		else 
			System.out.println("Not Strong");
	}
	public static void main(String args []) {
		System.out.print("Enter number to check strong: ");
		int num = sc.nextInt();
		
		checkStrong(num);
	}

}
