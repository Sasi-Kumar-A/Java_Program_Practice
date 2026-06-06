package Arrays;

import java.util.Scanner;
import java.util.*;
public class InsertionSort {
	static Scanner sc = new Scanner(System.in);
	public static void getInsertion(int a[]) {
		int n = a.length;
		
		for(int i=1;i<n;i++) {
			int key = a[i];
			int j = i - 1;
			
			while(j >= 0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		getInsertion(arr);
	}
}
