package Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceofCharacter {

	public static void main(String[] args) {
		String s = "sasikumar";
		
		
		Map<Character, Long> map =  s.chars()
		.mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()));
		
		System.out.println(map);
	}
}
