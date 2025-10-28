import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];

        dp[0] = 1;

        int maxSize = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (seq[j] < seq[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxSize = Math.max(maxSize, dp[i]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(maxSize + "\n");

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == maxSize) {
                stack.add(seq[i]);

                maxSize--;
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }

        System.out.println(sb);
    }
}