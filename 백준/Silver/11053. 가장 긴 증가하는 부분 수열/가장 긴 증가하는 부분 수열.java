import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            
            for(int j = 0; j < i; j++) {
                if(sequence[j] < sequence[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        
        for(int i = 0; i < n; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        
        System.out.println(max);
    }
}