package Strings;
import java.util.*;

public class LargestNumber {
	static Scanner sc = new Scanner(System.in);
	
	public static void getLargestNumber(int arr[]) {
		int n = arr.length;
		int max = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("The Maximum Number is: "+max);
	}
	public static void main(String[] args) {
		System.out.println("Enter the Size of the Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		getLargestNumber(arr);
		
	}
}
