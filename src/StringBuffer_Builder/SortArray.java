package StringBuffer_Builder;
import java.util.*;
public class SortArray {
	public static void main(String[] args) {
		String[] s= {"18","1123","24","21","32644","334"};
		int n = s.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(s[j].compareTo(s[j+1]) > 0) {
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
