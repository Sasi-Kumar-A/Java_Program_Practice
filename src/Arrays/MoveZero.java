package Arrays;

import java.util.*;

class MoveZero {
    static Scanner sc = new Scanner(System.in);
    public void moveZeroes(int a[]) {
        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j] == 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After moving zeros to the end:");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        MoveZero obj = new MoveZero();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        obj.moveZeroes(a);
    }
}
