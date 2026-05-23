package Strings;
import java.util.*;
public class ValidPhNo {
	static Scanner sc = new Scanner(System.in);
	public static void isValidPhno(String phno) {
		int n = phno.length();
		if(n < 10 || n > 10) {
			System.out.println("Enter the Correct 10 Digit of Mobile Number");
		return;
		}
		
		for(int i=0;i<n;i++) {
			if(!Character.isDigit(phno.charAt(i))) {
				System.out.println("You have enter the invalid Mobile Number, That has contain String or the Special Character...");
				return;
			}
		}
		System.out.println("This is a Valid Mobile Number:"+phno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Phone Number: ");
		String phno = sc.nextLine();
		
		isValidPhno(phno);
	}

}
