package Arrays;
import java.util.*;
public class MaxPopulationYear {
	static Scanner sc = new Scanner(System.in);
	    public static int maximumPopulation(int[][] logs) {
	        int ans = 0, yr = 1950;

	        for(int year=1950;year<=2050;year++){
	            int count = 0;

	            for(int i[]: logs){
	                if(year >= i[0] && year < i[1]){
	                    count++;
	                }
	            }
	            if(count > ans){
	                ans = count;;
	                yr =year;
	            }
	        }
	        return yr;
	    }
	    public static void main(String[] args) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(maximumPopulation(a));
		}
}
