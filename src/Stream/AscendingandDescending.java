package Stream;

import java.util.Arrays;
import java.util.List;

public class AscendingandDescending {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(100,150,40,70,200);
				
				List<Integer> x = li.stream()
						.sorted()
						.toList();
				
				List<Integer> y = li.stream()
						.sorted((a,b) -> b.compareTo(a))
						.toList();
				
				System.out.println(x);
				System.out.println(y);
	}
}
