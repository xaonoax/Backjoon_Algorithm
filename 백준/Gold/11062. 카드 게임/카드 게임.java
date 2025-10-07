import java.io.*;
import java.util.*;

public class Main {
    static int[] card;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            card = new int[n];
            dp = new int[n + 1][n + 1];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());

                card[j] = num;
            }

            getMaxScore(0, n - 1, true);

            System.out.println(dp[0][n - 1]);
        }
    }


    static int getMaxScore(int left, int right, boolean flag) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] != 0) {
            return dp[left][right];
        }
        if(flag) {
            return dp[left][right] = Math.max(card[left] + getMaxScore(left+1, right, false),
                    card[right] + getMaxScore(left, right-1, false));
        } else {
            return dp[left][right] = Math.min(getMaxScore(left+1, right, true), getMaxScore(left, right-1, true));
        }
    }
}