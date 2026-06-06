package Java_Fundamentals;
import java.util.*;
public class LeapYear {
	static Scanner sc = new Scanner(System.in);
	public static void getleapYear(int a) {
		if(a % 400 == 0 || (a % 100 !=0 && a % 4 == 0)) {
			System.out.println("This Year is Leap Year: "+a);
		}
		else
			System.out.println("This is not a Leap Year"+a);
	}
	public static void main(String args[]) {
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		getleapYear(year);
	}
}
