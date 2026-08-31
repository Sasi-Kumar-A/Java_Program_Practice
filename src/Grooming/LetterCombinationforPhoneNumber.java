package Grooming;

import java.util.*;

public class LetterCombinationforPhoneNumber {
	static String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static List<String> ans = new ArrayList<>();

    public static void solve(String digits,int index,String curr){
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        
        String letters = map[digits.charAt(index)-'0'];
        for(char c : letters.toCharArray()){
            solve(digits,index+1,curr+c);
        }
    }

    public static void main(String[] args) {
        String digits="5";
        solve(digits,0,"");
        System.out.println(ans);
    }
}
