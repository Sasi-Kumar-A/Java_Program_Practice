package StringBuffer_Builder;
import java.util.*;
public class LinearSearch {
	static	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a[] = {4,3,6,1,0,5,44,78,34,20,21};
		int element = sc.nextInt();
		System.out.println("\t\t a="+ Arrays.toString(a));
		System.out.println("Result:"+linearSearch(a,element));
	}
	
	public static boolean linearSearch(int a[], int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i] == element) {
				System.out.print(a[i]);
				return true;
			}
		}
		return false;
	}
}
