package OOPS;
import java.util.*;

public class Instagram {
	static Scanner sc = new Scanner(System.in);
	public String user_name;
	char gender;
	private String email;
	private int pwd;
	public long contact;
	
	public Instagram(String user_name,char gender,String email,int pwd,long contact) {
		//L.I
		this.user_name = user_name;
		this.gender = gender;
		this.email = email;
		this.pwd = pwd;
		this.contact = contact;
		
	}
	public String getEmail() {
		return email;
	}
	public long getContact() {
		return contact;
	}
	
	public int getPwd() {
		return pwd;
	}
	
	public void setEmail(String email) {
		if(doVerification()) {
			this.email = email;
			System.out.println("\t\tEmail Update...");
			return;
		}
		System.out.println("\t\t\t Updation of Email is Failed due to the Verification is Invalid....");
		
	}
	public void setPwd(int pwd) {
		if(doVerification()) {
			this.pwd = pwd;
			System.out.println("\t\t Update Password is Successfully...");
			return;
		}
		System.out.println("\t\t Updation Failed...");
	}
	
	public boolean doVerification() {
		System.out.print("Enter the Contact Number: ");
		long user_contact = sc.nextLong();
		
		if(contact == user_contact) {
			//Gen OTP
			System.out.print("Enter the Otp: ");
			int sys_otp =(int) (Math.random()*9999+9999);
			System.out.println(sys_otp);
			System.out.print("Enter the Otp Here: ");
			int otp_ver = sc.nextInt();
			return sys_otp == otp_ver;
		}
	return false;
	}
}
