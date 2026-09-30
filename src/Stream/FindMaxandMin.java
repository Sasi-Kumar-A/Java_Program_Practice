package Stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxandMin {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		
		int max = li.stream().mapToInt(x -> x.intValue())
				.max()
				.getAsInt();
		
		int max2 = li.stream()
				.max((a,b) -> a.compareTo(b))
				.get();
		
		int min = li.stream()
				.mapToInt(x -> x.intValue())
				.min()
				.getAsInt();
		
		
		System.out.println(max2);
		System.out.println(max);
		System.out.println(min);
		
	}
}
