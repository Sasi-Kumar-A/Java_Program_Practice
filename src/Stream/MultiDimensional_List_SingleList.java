package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiDimensional_List_SingleList {

	public static void main(String[] args) {
		List<List<Integer>> num = Arrays.asList(Arrays.asList(4,2,1),
				Arrays.asList(3,6,9),
				Arrays.asList(7,2,8,5));
		
		List<Integer> li = num.stream().flatMap(List :: stream).distinct().sorted().collect(Collectors.toList());
		
		System.out.println(li);
	}
}
