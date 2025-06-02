import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(Min);

    }

    public static void dfs(int idx, int depth) {
        if (depth == n / 2) {
            int startTeam = 0;
            int linkTeam = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (visit[i] && visit[j]) {
                        startTeam += map[i][j];
                        startTeam += map[j][i];
                    } else if (!visit[i] && !visit[j]) {
                        linkTeam += map[i][j];
                        linkTeam += map[j][i];
                    }
                }
            }

            int val = Math.abs(startTeam - linkTeam);

            if (val == 0) {
                System.out.println(val);
                System.exit(0);
            }
            
            Min = Math.min(val, Min);
            
            return;
        }
        
        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                
                dfs(i + 1, depth + 1);
                
                visit[i] = false;
            }
        }
    }
}