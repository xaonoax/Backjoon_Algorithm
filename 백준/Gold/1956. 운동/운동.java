import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int[][] dist = new int[v][v];
        
        for(int i = 0; i<v; i++) {
            for(int j = 0; j<v; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dist[a - 1][b - 1] = c;
        }

        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                if (i == k) {
                    continue;
                }

                for (int j = 0; j < v; j++) {
                    if (i == j || k == j) {
                        continue;
                    }

                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int answer = INF;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (dist[i][j] != INF && dist[j][i] != INF) {
                        int tmp = dist[i][j] + dist[j][i];
                        
                        answer = Math.min(answer, tmp);
                    }
                }
            }
        }

        System.out.println(answer == INF ? -1 : answer);
    }
}