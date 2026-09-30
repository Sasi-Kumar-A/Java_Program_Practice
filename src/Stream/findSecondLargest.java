package Stream;

import java.util.Arrays;
import java.util.List;

public class findSecondLargest {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(100,200,50,60,120);
		
		int l1 = li.stream()
				.sorted((a,b)-> b.compareTo(a))
				.findFirst()
				.get();
		
		int l2 = li.stream()
				.sorted((a,b)-> b.compareTo(a))
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(l1);
		System.out.println(l2);
	}
}
