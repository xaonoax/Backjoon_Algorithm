import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] visit;
    static int[][] graph;
    static int m, n, count = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            
            int k = Integer.parseInt(st.nextToken());
            
            graph = new int[n][m];
            visit = new boolean[n][m];

            ArrayList<int[]> list = new ArrayList<>();

            count = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x][y] = 1;

                if (graph[x][y] == 1) {
                    list.add(new int[]{x, y});
                }
            }

            for (k = 0; k < list.size(); k++) {
                int[] tmp = list.get(k);
                int x = tmp[0];
                int y = tmp[1];

                if (!visit[x][y]) {
                    bfs(x, y);

                    count++;
                }
            }

            System.out.println(count);
        }
    }

    public static void bfs(int x, int y) {
        visit[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (graph[nx][ny] == 1) {
                        if (!visit[nx][ny]) {
                            visit[nx][ny] = true;

                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }
}