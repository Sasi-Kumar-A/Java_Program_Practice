package Arrays;
import java.util.*;

public class SecondLargest {
	static Scanner sc = new Scanner(System.in);
	public static void getSecondLargest(int arr[]) {
		int n = arr.length;
		int max = 0,max2 =0;
		for(int i=0;i<n;i++) {
			if(arr[i] > max) {
				max2 = max;
				max = arr[i];
				
			}
			
		}
//		System.out.println();
		System.out.println(max);
		System.out.println(max2);
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		getSecondLargest(arr);
	}

}
