import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int start;
        int end;
        int cost;

        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Edge[] edges = new Edge[m + 1];
        long[] D = new long[n + 1];
        
        Arrays.fill(D, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            edges[i] = new Edge(A, B, C);
        }

        D[1] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Edge edge = edges[j];

                if (D[edge.start] != Integer.MAX_VALUE && D[edge.start] + edge.cost < D[edge.end]) {
                    D[edge.end] = D[edge.start] + edge.cost;
                }
            }
        }

        boolean check = false;

        for (int i = 0; i < m; i++) {
            Edge edge = edges[i];
            
            if (D[edge.start] != Integer.MAX_VALUE && D[edge.start] + edge.cost < D[edge.end]) {
                check = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        if (check) {
            sb.append("-1");
        } else {
            for (int i = 2; i <= n; i++) {
                if (D[i] == Integer.MAX_VALUE) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(D[i]).append("\n");
                }
            }
        }
        
        System.out.println(sb);
    }
}