package Arrays;
import java.util.*;
public class sortevenRandoddL {
	static Scanner sc = new Scanner(System.in);
	public static void evenandOddRL(int a[]) {
		int n = a.length;
		int ec = 0, oc = 0;
		
		for(int i=0;i<n;i++) {
			if(a[i]% 2==0) {
				ec++;
			}
			else {
				oc++;
			}
		}
		int ea[] = new int[ec];
		int oa[] = new int[oc];
		int x = 0,y=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2 == 0) {
				ea[x++] = a[i];
			}
			else {
				oa[y++] = a[i];
			}
		}
		Arrays.sort(ea);
		Arrays.sort(oa);
		System.out.println(Arrays.toString(ea));
		System.out.println(Arrays.toString(oa));
		
		for(int i=0;i<n;i++) {
			if(i<ec) {
				a[i] = ea[i];
			}
			else {
				a[i] = oa[i-oc];
			}
		}
		
		//This is a Second Code...
		for(int i=0;i<n;i++) {
			for(int j=i+1;i<n;i++) {
				if(a[i]+a[j]%2 == 0) {
					if(a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
					else if(a[i]%2 != 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				
			}
		}
		
		//This is Third Code...
		
//		Arrays.sort(a, (a,b)->{if((a+b)%2==0)return a-b;else if(a%2 == 0)return a;};);
//		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		evenandOddRL(a);
	}
}
