package Arrays;
import java.util.*;

public class Frequency {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        boolean[] visited = new boolean[str.length()];

        for (int i=0;i<str.length();i++) {
            if (visited[i]) continue;

            int count = 1;
            visited[i] = true;

            for (int j=i+1;j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}