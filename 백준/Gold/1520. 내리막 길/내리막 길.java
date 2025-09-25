import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] arr, dp;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(dfs(0, 0));
    }

    static int dfs(int x, int y) {
        if (x == n - 1 && y == m - 1) {
            return 1;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        
        int pos = arr[x][y];
        
        dp[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1) {
                continue;
            }

            int nxt = arr[nx][ny];
            
            if (pos > nxt) {
                dp[x][y] += dfs(nx, ny);
            }
        }
        
        return dp[x][y];
    }
}