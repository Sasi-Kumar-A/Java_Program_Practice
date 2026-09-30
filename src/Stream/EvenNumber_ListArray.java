package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenNumber_ListArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		IntStream it = Arrays.stream(arr);
		
		it.filter(x -> x%2 == 0)
		.forEach(x -> System.out.print(x));
	}
	
	
}
