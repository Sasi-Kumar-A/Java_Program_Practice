package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByletter_Length {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("apple","apple","banana","giwi","tea","butterfruit");
		
		Map<Character, List<String>> map1 = li.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		Map<Integer, List<String>> map2 = li.stream()
				.collect(Collectors.groupingBy(s -> s.length()));
		
		Map<String, Long> map3 = li.stream()
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()));
		
		List l = map3.entrySet().stream()
				.filter(x -> x.getValue() == 1)
				.toList();
		
		
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		System.out.println(l);
		
	}
}
