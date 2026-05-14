//package Java_Fundamentals;
//import java.util.*;
//
//public class PrimeNumber {
//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		System.out.print("Enter the Number to check Prime or Not: ");
//		int num = sc.nextInt();
//		
//		for(int i =2;i<num ;i++) {
//			if(num % i == 0 )
//				System.out.println(num);
//			else 
//				System.out.println(i);
//		}
//	}
//
//}
package Java_Fundamentals;
import java.util.*;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);

    // Method 1: Basic Prime Check — O(n)
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;       // 0 and 1 are not prime

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;   // divisible by something → not prime
        }
        return true;
    }

    // Method 2: Optimized Prime Check — O(√n)
    public static boolean isPrimeOptimized(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;        // 2 is the only even prime
        if (num % 2 == 0)
            return false;       // eliminate all even numbers

        // check only up to square root
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrimeOptimized(num)) {
            System.out.println(num + " is a Prime Number ✅");
        } else {
            System.out.println(num + " is NOT a Prime Number ❌");
        }

        // Print all prime numbers from 1 to 50
        System.out.println("\nPrime Numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
            }
        }
    }
}