package Stream;

import java.util.Arrays;
import java.util.List;

public class Largestword {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("java","Sql","Programming","language","malarvizhilimohanapriya","program","oppllpspl");
		
		String s = li.stream()
				.max((a,b)-> Integer.compare(a.length(), b.length()))
				.orElse("");
		
		System.out.println(s);
	}
}
