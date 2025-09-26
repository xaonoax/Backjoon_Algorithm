import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static boolean[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new boolean[31][15001];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp(0, 0);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (x > 15000) {
                sb.append("N ");
            } else {
                sb.append((dp[n][x]) ? "Y " : "N ");
            }
        }

        System.out.println(sb);
    }

    public static void dp(int idx, int weight) {
        if (dp[idx][weight]) {
            return;
        }

        dp[idx][weight] = true;

        if (idx == n) {
            return;
        }

        dp(idx + 1, weight);
        dp(idx + 1, weight + arr[idx + 1]);
        dp(idx + 1, Math.abs(weight - arr[idx + 1]));
    }
}