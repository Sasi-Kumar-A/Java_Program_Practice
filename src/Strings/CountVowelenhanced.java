package Strings;

public class CountVowelenhanced {

	public static void main(String[] args) {
		String str = "SASI KUMAR A";
		
		long count = str.toLowerCase()
				.chars()
				.filter(ch-> "aeiou".indexOf(ch)!=-1)
				.count();
		
		System.out.println("Vowel Count "+count);
		
		
	}
}
