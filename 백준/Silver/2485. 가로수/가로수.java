import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int gcd = 0;

        for (int i = 1; i < n; i++) {
            gcd = getGcd(arr[i] - arr[i - 1], gcd);
        }

        System.out.println((arr[n - 1] - arr[0]) / gcd + 1 - n);
    }

    private static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}