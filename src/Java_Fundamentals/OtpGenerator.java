package Java_Fundamentals;
import java.util.*;
public class OtpGenerator {
	public static void main(String args[]) {
		Random rd = new Random();
		int otp = 100000 + rd.nextInt(900000);
		System.out.println(otp);
	}
}
