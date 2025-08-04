import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        visit = new boolean[n][m];
        visit[0][0] = true;

        bfs(0, 0);

        System.out.println(map[n - 1][m - 1]);
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x,y});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                if (visit[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }

                queue.add(new int[]{nextX, nextY});

                map[nextX][nextY] = map[nowX][nowY] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }
}