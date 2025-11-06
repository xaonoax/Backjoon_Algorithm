import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static List<ArrayList<Node>> matrix;
    static int[] prevIdx;
    static int[] dist;
    static boolean[] isVisited;

    static class Node {
        int idx;
        int cost;

        Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        matrix = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            matrix.add(new ArrayList<>());
        }

        prevIdx = new int[n + 1];
        dist = new int[n + 1];
        isVisited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            matrix.get(s).add(new Node(e, dist));
        }

        st = new StringTokenizer(br.readLine());
        
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        prevIdx[start] = -1;
        
        dijkstra(start);
        printResult(end);
    }
    
    static void dijkstra(int start) {
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        
        pq.offer(new Node(start, 0));
        
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node cntNode = pq.poll();

            if (isVisited[cntNode.idx]) {
                continue;
            }
            
            isVisited[cntNode.idx] = true;

            for (Node nxtNode : matrix.get(cntNode.idx)) {
                if (dist[nxtNode.idx] > dist[cntNode.idx] + nxtNode.cost) {
                    dist[nxtNode.idx] = dist[cntNode.idx] + nxtNode.cost;
                    prevIdx[nxtNode.idx] = cntNode.idx;
                    
                    pq.offer(new Node(nxtNode.idx, dist[nxtNode.idx]));
                }
            }
        }
    }

    static void printResult(int end) {
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        sb.append(dist[end]).append("\n");

        int idx = end;

        while (idx != -1) {
            deque.offer(idx);
            
            idx = prevIdx[idx];
        }

        sb.append(deque.size()).append("\n");

        while (!deque.isEmpty()) {
            idx = deque.pollLast();
            
            sb.append(idx).append(" ");
        }

        System.out.print(sb);
    }
}