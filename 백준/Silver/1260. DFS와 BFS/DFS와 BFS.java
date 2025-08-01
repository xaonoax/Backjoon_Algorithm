import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        visit = new boolean[n + 1];

        dfs(v);

        System.out.println();

        visit = new boolean[n + 1];
        
        bfs(v);
    }

    public static void dfs(int v) {
        visit[v] = true;

        System.out.print(v + " ");

        if (v == graph.length) {
            return;
        }

        for (int i = 1; i < graph.length; i++) {
            if (graph[v][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();

        q.add(v);

        visit[v] = true;

        System.out.print(v + " ");

        while (!q.isEmpty()) {
            int tmp = q.poll();

            for (int i = 1; i < graph.length; i++) {
                if (graph[tmp][i] == 1 && visit[i] == false) {
                    q.add(i);
                    visit[i] = true;

                    System.out.print(i + " ");
                }
            }
        }
    }
}