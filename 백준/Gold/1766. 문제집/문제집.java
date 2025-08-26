import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        List<List<Integer>> list = new ArrayList<>();
        int[] indegree = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.get(x).add(y);

            indegree[y]++;
        }

        topologicalSort(indegree, list);
    }

    static void topologicalSort(int[] indegree, List<List<Integer>> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0)
                pq.offer(i);
        }

        while (!pq.isEmpty()) {
            int node = pq.poll();

            for (Integer i : list.get(node)) {
                indegree[i]--;

                if (indegree[i] == 0)
                    pq.offer(i);
            }

            System.out.print(node + " ");
        }
    }
}