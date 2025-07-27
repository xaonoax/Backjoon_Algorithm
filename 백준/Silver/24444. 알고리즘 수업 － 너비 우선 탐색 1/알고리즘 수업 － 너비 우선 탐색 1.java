import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visit = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        bfs(r);
    }

    private static void bfs(int r) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int[] result = new int[n + 1];

        queue.add(r);
        visit[r] = true;
        result[r] = ++count;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < graph.get(now).size(); i++) {
                int next = graph.get(now).get(i);

                if (!visit[next]) {
                    queue.add(next);

                    visit[next] = true;
                    result[next] = ++count;
                }
            }

        }

        for (int i = 1; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}