import java.util.*;

public class Main {
    public static long[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (arr[n] == -1) {
            arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return arr[n];
    }
}