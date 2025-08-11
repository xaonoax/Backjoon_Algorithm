import java.io.*;
import java.util.*;

public class Main {
    static int[][] tomato;
    static int n, m;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        tomato = new int[n][m];
        count = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());

                if (tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                } else if (tomato[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println(bfs(queue));
    }

        static int bfs(Queue<int[]> queue) {
            if (count == 0) {
                return 0;
            }

            int days = 0;

            while (count > 0 && !queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    int[] cur = queue.poll();
                    int y = cur[0];
                    int x = cur[1];

                    for (int j = 0; j < 4; j++) {
                        int ny = y + dy[j];
                        int nx = x + dx[j];

                        if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                            continue;
                        }
                        if (tomato[ny][nx] != 0) {
                            continue;
                        }

                        tomato[ny][nx] = 1;
                        count--;

                        queue.add(new int[]{ny, nx});
                    }
                }

                days++;
            }

            if (count == 0) {
                return days;
            } else {
                return -1;
            }
        }
}