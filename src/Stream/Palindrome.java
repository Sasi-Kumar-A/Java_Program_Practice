package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("java","amma","toyoto","program");
		
		String s = "amma";
		
		Boolean b = IntStream.range(0, s.length() / 2)
				.allMatch(i -> s.charAt(i) == s.charAt(s.length() - 1 -i));
		
		System.out.println(b);
	}
}
