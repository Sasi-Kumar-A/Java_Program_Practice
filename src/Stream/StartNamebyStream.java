package Stream;

import java.util.*;
import java.util.Arrays;

public class StartNamebyStream {

	public static void main(String[] args) {
		List<String> al = Arrays.asList("Sudha","Ram","villa","Sathiya","Saihari","Usha");
		
		List<String> names = al.stream().filter(x -> x.startsWith("S")).map(x -> x.toUpperCase()).toList();
		
		System.out.println(names);
	}
}
