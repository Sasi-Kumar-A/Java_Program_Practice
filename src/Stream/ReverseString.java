package Stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		String s = "hello";
		
		String rev = IntStream.range(0, s.length())
				.mapToObj(i -> s.charAt(s.length()-1 - i))
				.map(x -> String.valueOf(x))
				.collect(Collectors.joining());
		
		System.out.println(rev);
	}
}
