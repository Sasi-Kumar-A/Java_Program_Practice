package Stream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GreaterThan50 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		IntStream it = Arrays.stream(arr);
		
		it.filter(x -> x > 50)
		.forEach(x -> System.out.println(x));
	}
}
