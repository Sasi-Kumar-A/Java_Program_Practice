package Stream;

import java.util.Arrays;
import java.util.List;

public class toAdd {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		
		int sum = li.stream()
				.mapToInt(x -> x.intValue())
				.sum();
		
		System.out.println(sum);
	}
}
