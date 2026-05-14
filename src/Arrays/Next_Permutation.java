package Arrays;
import java.util.*;

public class Next_Permutation {
	static Scanner sc = new Scanner(System.in);
	public static void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            for (int j = n - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    swap(nums, pivot, j);
                    break;
                }
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		nextPermutation(arr);
	}

}
