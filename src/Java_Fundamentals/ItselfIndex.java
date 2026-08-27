package Java_Fundamentals;

import java.util.*;

public class ItselfIndex {

	static Scanner sc = new Scanner(System.in);
	public static void itself(int arr[]) {
		int n = arr.length;
		int sum = 1;
		int ans[] = new int[n];
		
		for(int i=0;i<n;i++) {
			sum = 1;
			for(int j=0;j<n;j++) {
				if(i!= j) {
					sum *= arr[j];
				}
			}
			ans[i] = sum;
		}
		System.out.println(Arrays.toString(ans));
	}
	public static void main(String[] args) {
		System.out.println("Enter the N value");
		int n = sc.nextInt();
	
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		itself(arr);
	}
}
