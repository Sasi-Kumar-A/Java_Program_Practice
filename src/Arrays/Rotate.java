package Arrays;
import java.util.*;

public class Rotate {
    static Scanner sc = new Scanner(System.in);

    public static void changeRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i=0;i<k;i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i=k;i<n;i++) {
            temp[i] = arr[i - k];
        }

        for (int i=0;i<n;i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        changeRotate(arr, target);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}