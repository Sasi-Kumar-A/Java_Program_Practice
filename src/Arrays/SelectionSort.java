package Arrays;
import java.util.*;
public class SelectionSort {
	static Scanner sc = new Scanner(System.in);
	public static void getSelection(int a[]) {
		// Selection Sort
		/*
		 * Selection Sort is a simple sorting algorithm that 
		 * repeatedly finds the smallest element from the unsorted 
		 * portion of the array and places it at its correct position 
		 * in the sorted portion.*/
		int n = a.length;
		for(int i=0;i<n;i++) {
			int min = i;//find the min element 
			for(int j=i+1;j<n;j++) {
				if(a[j] < a[min]) {
					min = j;// this process will tell the min element 
				}
			}
			//Swap the element after finding the minimum element
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
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
		
		getSelection(arr);
	}
}
