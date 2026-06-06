package Arrays;
import java.util.*;

public class ExceptItselfSum {
	static Scanner sc = new Scanner(System.in);
	public static void exceptItself(int arr[]) {
		int n = arr.length;
		int temp[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = 0;
			for(int j=0;j<n;j++) {
				if(j != i ) {
					sum += arr[j];
					System.out.println(sum);
				}
				
				
			}
			temp[i] = sum;
		}
		System.out.print(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]  =sc.nextInt();
		}
		
		exceptItself(arr);
	}

}
