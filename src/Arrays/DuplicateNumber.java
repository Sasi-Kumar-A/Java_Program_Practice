package Arrays;
import java.util.*;

public class DuplicateNumber {
	static Scanner sc = new Scanner(System.in);
	public static void duplicateNo(int a[]) {
		int n = a.length;
		int count = 0,x=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}e
			if(count >1) {
				System.out.println(a[i]);
			}
		}
		
		
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		duplicateNo(a);
	}

}
