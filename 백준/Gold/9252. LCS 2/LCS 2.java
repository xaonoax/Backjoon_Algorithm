import java.io.*;

public class Main {
    private static int[][] dp;
    private static int n, m;
    private static String a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        a = br.readLine();
        b = br.readLine();
        n = a.length();
        m = b.length();
        dp = new int[n + 1][m + 1];

        int result = lcs();
        StringBuilder sb = new StringBuilder();

        while (n != 0 && m != 0) {
            if (a.charAt(n - 1) == b.charAt(m - 1)) {
                sb.insert(0, a.charAt(n - 1));

                n--;
                m--;
            } else if (dp[n][m] == dp[n - 1][m]) {
                n--;
            } else if (dp[n][m] == dp[n][m - 1]) {
                m--;
            }
        }

        System.out.println(result + "\n" + sb);
    }

    private static int lcs() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }
}