package Arrays;
import java.util.*;

public class FindMinMax {
	static Scanner sc = new Scanner(System.in);
	
	public static int getMinMax(int arr[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		System.out.println(max+" Maximun value is");
		System.out.println(min+" Minimun value is");
		return max;
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		getMinMax(arr);
	}

}
