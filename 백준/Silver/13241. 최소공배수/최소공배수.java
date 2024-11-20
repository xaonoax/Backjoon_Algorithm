import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long gcd = getGCD(Math.max(n1, n2), Math.min(n1, n2));

        System.out.println((n1 * n2) / gcd);
    }

    public static long getGCD(long a, long b) {
        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}