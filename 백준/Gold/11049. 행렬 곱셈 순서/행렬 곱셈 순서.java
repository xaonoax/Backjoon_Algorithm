import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];
        int[][] process = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            process[i][0] = Integer.parseInt(st.nextToken());
            process[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                dp[j][j + i] = Integer.MAX_VALUE;
                
                for (int k = j; k < j + i; k++)
                    dp[j][j + i] = Math.min(dp[j][j + i],
                            dp[j][k] + dp[k + 1][j + i] + process[j][0] * process[k][1] * process[j + i][1]);
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}