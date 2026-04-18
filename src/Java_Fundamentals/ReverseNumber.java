package Java_Fundamentals;
import java.util.*;
public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int temp = n,reverse =0;
		while(n>0){
            int a =n%10;
            reverse = reverse*10+a;
            n/=10;
        }
		System.out.println(reverse);
	}

}
