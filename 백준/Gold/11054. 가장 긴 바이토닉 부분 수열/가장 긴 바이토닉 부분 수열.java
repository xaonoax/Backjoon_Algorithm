import java.io.*;
import java.util.*;

public class Main {
    public static Integer[] r_dp;
    public static Integer[] l_dp;
    public static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = java.lang.Integer.parseInt(br.readLine());
        r_dp = new Integer[n];
        l_dp = new Integer[n];
        seq = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = java.lang.Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            lis(i);
            lds(i);
        }

        int max = -1;
        
        for (int i = 0; i < n; i++) {
            max = Math.max(r_dp[i] + l_dp[i], max);
        }
        
        System.out.println(max - 1);
    }

    public static int lis(int n) {
        if (r_dp[n] == null) {
            r_dp[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (seq[i] < seq[n]) {
                    r_dp[n] = Math.max(r_dp[n], lis(i) + 1);
                }
            }
        }

        return r_dp[n];
    }

    public static int lds(int n) {
        if (l_dp[n] == null) {
            l_dp[n] = 1;
            
            for (int i = n + 1; i < l_dp.length; i++) {
                if (seq[i] < seq[n]) {
                    l_dp[n] = Math.max(l_dp[n], lds(i) + 1);
                }
            }
        }

        return l_dp[n];
    }
}