package Arrays;
import java.util.*;

public class LeftRightSumDifference {
	static Scanner sc = new Scanner(System.in);
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int sum =0;
        

        for(int i=0;i<n;i++){
        	int rtsm =0,lfsm=0;
            for(int j=0;j<n;j++){
                if(i < j){
                    rtsm += nums[j];
                }
                else if(i > j){
                    lfsm += nums[j];
                }
            }
            System.out.print(rtsm+ " "+lfsm+" ");
            ans[i] =Math.abs(lfsm - rtsm);
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
	    
	    public static void main(String[] args) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			leftRightDifference(a);
		}
}
