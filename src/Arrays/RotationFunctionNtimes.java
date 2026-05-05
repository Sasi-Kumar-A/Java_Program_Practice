package Arrays;
import java.util.*;

public class RotationFunctionNtimes {
	static Scanner sc = new Scanner(System.in);
	public static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        
        int a =0,b = 0;
        for(int i=0;i<n;i++){
            b += nums[i];
            a += i * nums[i];
        }
       int max = a;

       for(int i=1;i<n;i++){
        a = a + b - n * nums[n-i];
        max = Math.max(max, a); 
       }
        return max;
    }
//    public static int maxRotateFunction(int[] nums) {
//        int n = nums.length;
//        int max = Integer.MIN_VALUE;
//        int count =0;
//        int a =0;
//        for(int i=0;i<n;i++){
//            a =a + (i * nums[i]);
//        }
//        if(max < a)
//            max = a;
//        count++;
//        if(count <= n){
//            int temp = nums[0];
//            nums[0] = nums[n-1];
//            nums[n-1] = temp;
////            maxRotateFunction(nums);
//        }
//        return max;
//    }
    
    public static void main(String args[]) {
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	
    	for(int i=0;i<size;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int data = maxRotateFunction(arr);
    	System.out.println(data);
    }
}
