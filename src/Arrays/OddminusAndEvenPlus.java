package Arrays;
import java.util.*;
public class OddminusAndEvenPlus {

	public static void main(String[] args) {
		int a[] = {2,5,66,2,3,8,9,66,10,52,23,27};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[i]++;
			}
			else
				a[i]--;
		}
		System.out.println(Arrays.toString(a));
	}
}
