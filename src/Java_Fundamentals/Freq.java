package Java_Fundamentals;
import java.util.*;

public class Freq {

	public static void getFreqency(int arr[]) {
		int n = arr.length;
		LinkedHashMap<Integer , Integer> lm = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			if(lm.containsKey(arr[i])) {
				lm.put(arr[i], lm.get(arr[i])+1);
			}
			else {
				lm.put(arr[i], 1);
			}
		}
		
		
		for(int i=0;i<lm.size();i++) {
			if(lm.get(arr[i]) > n/2) {
				System.out.println("Majority Element ");
				
			}
			else {
				System.out.println("Not a Majority Element");
			}
		}
		System.out.println(lm);
	}
	public static void main(String[] args) {
		int arr[] = {9,2,3,3,9,3,3};
		
		getFreqency(arr);
	}
}
