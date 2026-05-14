package Arrays;
import java.util.*;

public class MissingNumbers {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		
		System.out.print("The Missing Number is: ");
		for(int i=0;i<n-1;i++) {
			for(int j=arr[i]+1;j<arr[i+1];j++) {
				System.out.print(j+" ");
			}
		}
		
//		System.out.print("The Missing Numbers are:  ");
//		for(int i=0;i<n;i++) {
//			if(arr[i] != i+1)
//				System.out.print(i+1+" ");
//		}
	}

}
