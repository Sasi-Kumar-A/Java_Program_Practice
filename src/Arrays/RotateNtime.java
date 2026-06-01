package Arrays;

import java.util.*;
class RotateNtime {
    public void rotate(int a[],int target){
        int n = a.length;
        int temp [] = new int[n];

        for(int i=0;i<n;i++){
            temp[(i+target)%n] = a[i];
        }

        System.out.println("The rotated array is: " + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        RotateNtime obj = new RotateNtime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        obj.rotate(a, target);
    }
}
