package Framework;

import java.util.*;

public class MovesZeroLast {
	
	public static void movezeros(int arr[]) {
		int n = arr.length;
		
		int ans[] = new int[n];
		int x = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] > 0) {
				ans[x++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to Move Zeros to Right");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		movezeros(arr);
	}
}
