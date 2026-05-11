package Arrays;
import java.util.*;
public class MinDistancetoTargetElement {
	static Scanner sc = new Scanner(System.in);
	public static int getMinDistanceTarget(int nums[],int start,int target) {
		int minDis = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target)
				minDis = Math.min(minDis,Math.abs(i - start));
		}
		return minDis;
	}
	public static void main(String args[]) {
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i] = sc.nextInt();
		
		System.out.print("Enter the start Number: ");
		int start = sc.nextInt();
		System.out.print("Enter the Target Value: ");
		int target = sc.nextInt();
		System.out.println(getMinDistanceTarget(a,start,target));
	}
}
