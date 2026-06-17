package StringBuffer_Builder;
import java.util.*;
public class Productoftself {
	static Scanner sc = new Scanner(System.in);
	public static void productOfItself(int a[]) {
		int n = a.length;
		
		int x=0,sum =1;
		int temp[] = new int[n];
		while(x < n) {
			sum = 1;
			for(int i=0;i<n;i++) {
				if(i != x) {
					sum *= a[i];
				}
			}
			temp[x++] = sum;
			
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		productOfItself(a);
	}

}
