package Java_Fundamentals;

public class StringPalemdromeRSpl {

	public static void main(String[] args) {
		String str = "ma l2#ayal$a2m";

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }

        int start = 0;
        int end = sb.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("String: "+sb);

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
	}
}

