import java.util.*;
public class Total_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            long start = Math.min(N, M);
            long end = Math.max(N, M);
            long sum = 0;
            for (long i = start; i <= end; i++) {
                if (i % 3 != 0 && i % 5 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}