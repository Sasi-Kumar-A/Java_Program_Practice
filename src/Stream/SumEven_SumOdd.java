package Stream;

import java.util.Arrays;
import java.util.List;

public class SumEven_SumOdd {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(2,24,87,5,8,9,13);
		
		int even = li.stream()
		.filter(x -> x%2 == 0)
		.mapToInt(x -> x.intValue())
		.sum();
		
		int odd = li.stream()
				.filter(x -> x%2 != 0)
				.mapToInt(x -> x.intValue())
				.sum();
		
		System.out.println(even);
		System.out.println(odd);
	}
}
