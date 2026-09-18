package Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamfilterbysize {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring", "api", "microservice", "db"); 
		words.stream()
		             .filter(word -> word.length() > 3)
		             .sorted()
		             .forEach(System.out::println);
	}
}
