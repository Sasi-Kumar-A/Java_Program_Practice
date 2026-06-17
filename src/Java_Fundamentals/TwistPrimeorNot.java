package Java_Fundamentals;

import java.util.*;

public class TwistPrimeorNot {

    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i=2;i<=n/2;i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void twistPrimeOrNot(int a) {
        int org = a;
        int rev = 0;
        while(a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }

        if(isPrime(org) && isPrime(rev)) {
            System.out.println(org+" and "+rev+" are twisted Prime Number");
        }
        else {
            System.out.println(org+" and "+rev+"are not a twisted Prime Number");
        }
        
        if(org != rev) {
        	System.out.println("This also a Emirp Number: "+org+"  "+rev );
        }
        else {
        	System.out.println("This is not a Emirp Number: "+ org+ " "+rev);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check wheather the given Number is Twisted prime or Not: ");
        int n = sc.nextInt();

        twistPrimeOrNot(n);
    }
}
