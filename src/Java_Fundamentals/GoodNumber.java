package Java_Fundamentals;
import java.util.*;
public class GoodNumber {

	public static int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
            	System.out.println(i);
                count++;
            }
        }
        return count;
    }

    private static boolean isGood(int num) {
        boolean changed = false;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }

            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                changed = true;
            }

            num /= 10;
        }

        return changed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = rotatedDigits(n);
        System.out.println("Count of Good Numbers: " + result);
	}

}
