package Strings;
import java.util.*;
public class ValidParentheses {
	public static boolean validParentheses(String str) {
		Stack<Character> stack = new Stack<>();
        Map<Character, Character> matching = new HashMap<>();
        
        matching.put(')', '(');
        matching.put('}', '{');
        matching.put(']', '[');
        
        for (char c : str.toCharArray()) {
            if (!matching.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != matching.get(c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
	}
	public static void main(String args[]) {
		String str = "({})";
		
		boolean data = validParentheses(str);
		System.out.println("Input: "+str+" Valid: "+data);
	}
}
