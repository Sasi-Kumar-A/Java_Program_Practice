package StringBuffer_Builder;

public class Comparefunc {
	public static void main(String[] args) {
		/*
		 * How will you compare the String and get to know who is greate in 
		 * Dictionary Arrangement.
		 * currString == Passed String --->0
		 * currString > Passed String ---> +ve
		 * currString < Passed String --->-ve
		 * 
		 * */
		String s1 = "banana";
		String s2 = "kiwi";
		String s3 = "banana";
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s1));
	}
}
