import java.io.*;
import java.util.*;

public class Main {
    static int t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] files = new int[k + 1];
            int[][] dp = new int[k + 1][k + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            files[1] = Integer.parseInt(st.nextToken());

            for (int j = 2; j <= k; j++) {
                files[j] = files[j - 1] + Integer.parseInt(st.nextToken());
            }


            for (int j = 1; j < k; j++) {
                for (int m = 1; m + j <= k; m++) {
                    int end = m + j;

                    dp[m][end] = Integer.MAX_VALUE;

                    for (int n = m; n < end; n++) {
                        dp[m][end] = Math.min(dp[m][end],
                                dp[m][n] + dp[n + 1][end] + files[end] - files[m - 1]);
                    }
                }
            }

            System.out.println(dp[1][k]);
        }
    }
}