package Arrays;
import java.util.*;
public class CountOddEven {
	static Scanner sc = new Scanner(System.in);
	public static void getCountOddEven(int arr[]) {
		int n = arr.length;
		int evencount = 0, oddcount =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
				evencount++;
			}
			else {
				System.out.println();
				System.out.print(arr[i]+" ");
				oddcount++;
			}
		}
		System.out.println("This is Odd Number Count: "+oddcount);
		System.out.println("This is Even Number Count: "+evencount);
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		getCountOddEven(arr);

	}

}
