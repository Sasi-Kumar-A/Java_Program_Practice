package Stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate_Character_in_String {

	public static void main(String[] args) {
		String s = "hello";
		
		Map<Character, Long> map =  s.chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()));
		
		List<Character> li =  map.entrySet()
		.stream()
		.filter(x -> x.getValue() >1)
		.map(Map.Entry :: getKey)
		.toList();
		System.out.println(li);
	}
}
