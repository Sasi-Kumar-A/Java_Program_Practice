package Java_Fundamentals;
import java.util.*;
public class CtoFandFtoC {
	static Scanner sc = new Scanner(System.in);
	public static void CtoF(int cel) {
		int res = (cel * 9/5)+32;
		System.out.println(res+"°F");
	}
	public static void FtoC(int fah) {
		int res = (fah -32)*5/9;
		System.out.println(res+"°C");
	}
	public static void main(String args[]) {
		System.out.println("Enter your choose: \n1. Celsius to Fahrenheit.\n2. fahernheit to Celsius.");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.print("Enter the Celsius: ");
			int celsius = sc.nextInt();
			CtoF(celsius);
		}
		System.out.print("Enter the Fahrenheit: ");
		int fahren = sc.nextInt();
		FtoC(fahren);
		
	}
}
