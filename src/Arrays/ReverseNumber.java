package Arrays;
import java.util.*;

public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);
	public static int ReverseNumberfromArrays(int a[]) {
		int n = a.length;
		int res =0;
		for(int i=n-1;i>=0;i--) {
			res =res * 10 + a[i];
			
		}
		return res;
	}
	public static void main(String args[]) {
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		
		int data = ReverseNumberfromArrays(a);
		System.out.println(data);
	}
}
