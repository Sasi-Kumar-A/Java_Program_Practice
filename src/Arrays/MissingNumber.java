package Arrays;
import java.util.*;
public class MissingNumber {
	static Scanner sc = new Scanner(System.in);
	public static int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            res = res-nums[i];
        }
        return res;
    }
	public static void main(String args[]) {
		int size = sc.nextInt();
		int num[] = new int[size];
		
		for(int i=0;i<size;i++)
			num[i] = sc.nextInt();
			
		System.out.println(missingNumber(num));
	}
}
