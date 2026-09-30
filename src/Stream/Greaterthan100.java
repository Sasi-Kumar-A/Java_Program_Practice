package Stream;

import java.util.Arrays;
import java.util.List;

public class Greaterthan100 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(100,200,50,70,120);
		
		long c = li.stream()
				.filter(x -> x >= 100)
				.count();
		
		System.out.println(c);
	}
}
