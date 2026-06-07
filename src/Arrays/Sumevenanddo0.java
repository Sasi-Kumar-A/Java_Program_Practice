package Arrays;
import java.util.*;
public class Sumevenanddo0 {
	static Scanner sc = new Scanner(System.in);
	public static int sumAndZero(int a[]) {
		int n = a.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			if(a[i]%2 ==0) {
				sum += a[i];
				a[i] = 0;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	}
}
