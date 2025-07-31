import java.util.*;

public class MixedSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // Position in the series

            int term;
            if (N % 2 == 1) {
                // Odd position: power of 2
                int index = N / 2;
                term = (int)Math.pow(2, index);
            } else {
                // Even position: power of 3
                int index = (N / 2) - 1;
                term = (int)Math.pow(3, index);
            }

            System.out.println(term);
        }
        sc.close();
    }
}
