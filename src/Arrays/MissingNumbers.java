package Arrays;
import java.util.*;

public class MissingNumbers {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The Missing Numbers are:  ");
		for(int i=1;i<n;i++) {
			if(arr[i] != i)
				System.out.print(i);
		}
	}

}
