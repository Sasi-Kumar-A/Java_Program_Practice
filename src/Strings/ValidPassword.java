package Strings;
import java.util.*;

public class ValidPassword {
	static Scanner sc = new Scanner(System.in);
	public static void verifyEmailAndPassword(String email, String pwd) {
		
		ValidData vld = new ValidData();
		boolean ress = vld.isValid(email);
		
		boolean res = isPwdValid(pwd);
		
		if(res == true && ress == true) {
			System.out.println("The Email And the Password is Valid One");
		}
		else
			System.out.println("This is Invalid One");
	}
	
	public static boolean isPwdValid(String pwd) {
		/*
		 * Condition: 
		 * P
		 * Password must contain minimum Character of 5 maximum 15 Character
		 * It must contain atleast 1 UpperCase. 
		 * It must contain atleast 1LowerCase. 
		 * It must contain atleast 1 Digit. 
		 * It must contain atlest 1 Special Character.
		 */
		
		int n = pwd.length();
		boolean uppercase = false;
		boolean lowercase = false;
		boolean digit = false;
		boolean specialchar = false;
		
		if(n < 5 && n > 15)
			return false;
		
		for(int i=0;i<n;i++) {
			char ch = pwd.charAt(i);
			String splchar = "@#&";
			
			if(Character.isUpperCase(ch))
				uppercase = true;
			else if(Character.isLowerCase(ch))
				lowercase = true;
			else if(Character.isDigit(ch))
				digit = true;
			else if(splchar.indexOf(ch) != -1)
				specialchar = true;
		}
		
		if(!uppercase)
			System.out.println("You have enter a  Password without a Upper case");
		if(!lowercase)
			System.out.println("You enter without Lowercase");
		if(!digit)
			System.out.println("You enter without the digit");
		if(!specialchar)
			System.out.println("You enter without the Special Character: Only @ # &");
		
	return uppercase && lowercase && digit && specialchar;	
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the Email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter the Password:");
		String pwd = sc.nextLine();
		
		verifyEmailAndPassword(email,pwd);
	}

}
