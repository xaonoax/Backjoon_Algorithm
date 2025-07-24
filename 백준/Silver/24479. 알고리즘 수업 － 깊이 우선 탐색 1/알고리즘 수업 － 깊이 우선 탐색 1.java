import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        check = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        
        count = 1;
        
        dfs(r);

        for (int i = 1; i < check.length; i++) {
            sb.append(check[i]).append("\n");
        }
        
        System.out.println(sb);
    }

    private static void dfs(int node) {
        check[node] = count;

        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            
            if (check[newNode] == 0) {
                count++;
                
                dfs(newNode);
            }
        }
    }
}