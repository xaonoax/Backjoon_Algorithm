import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr1 = br.readLine().toCharArray();
        char[] chArr2 = br.readLine().toCharArray();
        int length1 = chArr1.length;
        int length2 = chArr2.length;
        int[][] dp = new int[length1 + 1][length2 + 1];
        
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (chArr1[i - 1] == chArr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        System.out.println(dp[length1][length2]);
    }
}