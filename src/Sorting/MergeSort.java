package Sorting;
import java.util.*;
public class MergeSort {
	static Scanner sc = new Scanner(System.in);
	
	public static void merge(int arr[], int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			
			merge(arr,left, mid);
			merge(arr, mid+1, right);
			mergeorder(arr, left, right, mid);
			 
		}
	}
	
	public static void mergeorder(int arr[],int left, int right,int mid) {
		int temp[] = new int[right-left+1];
		int i = left , j = mid+1, x=0; 
		while(i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				temp[x++] = arr[i++];
			}
			else {
				temp[x++] = arr[j++];
			}
		}
		
		while(i<= mid) {
			temp[x++] = arr[i++];
		}
		
		while(j<=right) {
			temp[x++] = arr[j++];
		}
		
		for(i= left, x =0;i<=right;i++,x++) {
			arr[i] = temp[x];
		}
		
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of the array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int left = 0,right = size-1;
		
		merge(arr,left,right);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
