package Java_Fundamentals;
import java.util.*;
public class SimpleInterest {
	static Scanner sc = new Scanner(System.in);
	public static void CompoundInterest(double amt,double intrst,int com,int time) {
		double princ = amt * Math.pow(1+(intrst / com), com*time);
		double amount = princ - amt;
		
		System.out.println(princ);
		System.out.println(amount);
	}
	public static void main(String args[]) {
		System.out.print("Enter the Amount that you brought: ");
		int amount = sc.nextInt();
		
		System.out.print("Enter the Rate of Interest :");
		double rate = sc.nextDouble();
		
		System.out.print("Enter the Time Period: ");
		int time = sc.nextInt();
		
		double SI =(amount * rate * time)/100;
		
		System.out.println(SI);
		
		System.out.println("Do you need to Calculate the Compound Interest \n Yes. \n no.");
		sc.nextLine();
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("yes")) {
			System.out.print("Enter the Principle amount: ");
			double princ = sc.nextDouble();
			System.out.print("Enter the Rate of Interest: ");
			double rates = sc.nextDouble();
			System.out.print("Enter the how much month of compounded: ");
			int comp = sc.nextInt();
			System.out.print("Enter the Time Duration: ");
			int times = sc.nextInt();
			
			CompoundInterest(princ,rates/100,comp,times);
		}
		return;
	}
}
