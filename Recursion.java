import java.util.*;

public class Recursion {
    // Calculate x^n using recursion with memoization
    public static long fib(long x, long n, ArrayList<Long> dp) {
        if (n == 0) return 1;
        if (x == 0) return 0;
        if (dp.get((int)n) != -1) return dp.get((int)n);

        long halfPower = fib(x, n / 2, dp);
        long result;

        if (n % 2 == 0) {
            result = halfPower * halfPower;
        } else {
            result = halfPower * halfPower * x;
        }

        dp.set((int)n, result);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long x = sc.nextLong();

        ArrayList<Long> dp = new ArrayList<>(Collections.nCopies((int)n + 1, -1L));
        System.out.println(fib(x, n, dp));
    }
}
