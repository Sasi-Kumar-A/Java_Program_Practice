package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("listen","ate","tea","silent","eat","hello");
		
		Map<String, List<String>> map =  li.stream().collect(Collectors.groupingBy(
				s -> {
					char ch[] = s.toCharArray();
					Arrays.sort(ch);
					return new String(ch);
				}));
		System.out.println(map.values());
	}
}
