package Arrays;
import java.util.*;
public class CountingSort {
	static Scanner sc = new Scanner(System.in);
	public static void getcountsort(int arr[]) {
		int n = arr.length;
		int a =0;
		
		for(int i=0;i<n;i++)
			a = Math.max(a, arr[i]);
		
		int temp[] = new int[a +1];
		
		for(int i=0;i<n;i++)
			temp[arr[i]]++;
			
		int x = 0;
		for(int i=0;i<temp.length;i++) {
			
			while(temp[i] > 0) {
				arr[x++] = i;
				temp[i]--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		getcountsort(arr);
	}
}
