package Arrays;
import java.util.*;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);
	public static void sortBubble(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]) {
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		sortBubble(arr);
	}
}
