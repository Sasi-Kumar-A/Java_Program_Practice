package Stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(100,100,40,70,200);
		
		List<Integer> x = li.stream()
				.distinct()
				.toList();
		
		System.out.println(x);
	}
}
