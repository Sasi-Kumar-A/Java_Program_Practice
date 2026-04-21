package OOPS;
import java.util.*;

public class InstaUser {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		Instagram user1 = new Instagram("Sasi_Kumar",'M',"sasi@gmail.com",698547,9876543210L);
		System.out.println("**Get User Info**");
		System.out.println("The User Name is: "+user1.user_name);
		System.out.println("Gender of the user is: "+user1.gender);
		System.out.println("The User Email is: "+user1.getEmail());
		System.out.print("To update the Email .\n Enter the Email: ");
		String email = sc.nextLine();
		user1.setEmail(email);
		System.out.println("The Updated password is : "+user1.getEmail());
		System.out.print("The Existing Password is: "+user1.getPwd());
		System.out.print("To Update the Password \n Enter the Password: ");
		int pwd = sc.nextInt();
		user1.setPwd(pwd);
		System.out.println("The Updated Password is: "+user1.getPwd());
		System.out.print("User Contact Number: "+user1.contact);
		
		
		
	}
}
