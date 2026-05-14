package Arrays;
import java.util.*;

public class Frequence_Num {
	static Scanner sc = new Scanner(System.in);
	public static void frequencyNumberCheck(int arr[]) {
		int count=0;
		boolean visit[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visit[i])continue;
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visit[j] = true;
					
				}
			}
			System.out.println(count + ": "+arr[i]);
		}
	}
	public static void main(String args[]) {
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		frequencyNumberCheck(arr);
	}
}
