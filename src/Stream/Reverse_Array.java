package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,4,3,5,6};
		
		List<String> li = Arrays.asList("java","python","programming","Language");
		
		Object[] s =  IntStream.range(0, arr.length).mapToObj(i -> arr[arr.length -i - 1]).toArray();
		
		String s1 =  IntStream.range(0, li.size()).mapToObj(i -> li.get(li.size() -1 -i)).collect(Collectors.joining(", "));
		
		System.out.println(s1);
		
		List<String> s3 = li.stream().map(x -> new StringBuilder(x).reverse().toString()).toList();
		
		System.out.println(s3);
	}
}
