import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(pow(a, b, c));
    }

    public static long pow(int a, int b, int c) {
        if (b == 0) {
            return 1;
        }

        long n = pow(a, b / 2, c);

        if (b % 2 == 0) {
            return n * n % c;
        } else {
            return (n * n % c) * a % c;
        }
    }
}