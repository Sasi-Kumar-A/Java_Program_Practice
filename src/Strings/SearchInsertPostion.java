package Strings;
import java.util.*;
public class SearchInsertPostion {
	static Scanner sc = new Scanner(System.in);
	public static int searchInsertPos(int nums[],int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target)
				return i;
			else if(nums[i] > target)
				return i;
		}
		return nums.length;
	}
	public static void main(String args[]) {
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(searchInsertPos(a,target));
	}
}
