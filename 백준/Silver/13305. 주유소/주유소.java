import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dist = new long[n - 1];
        long[] cost = new long[n];

        for (int i = 0; i < n - 1; i++) {
            dist[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        long sum = 0;
        long min = cost[0];

        for (int i = 0; i < n - 1; i++) {
            if (cost[i] < min) {
                min = cost[i];
            }

            sum += (min * dist[i]);
        }

        System.out.println(sum);
    }
}