import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] a;
    static boolean visit[];
    static int n, m, v;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        v = 1;
        a = new ArrayList[n + 1];
        visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            a[u].add(v);
            a[v].add(u);
        }

        System.out.println(dfs(v));
    }

    public static int dfs(int i) {
        visit[i] = true;

        for (int k : a[i]) {
            if (visit[k] == false) {
                count++;
                dfs(k);
            }
        }

        return count;
    }
}