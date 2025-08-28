import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = 999_999_999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] city = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                city[i][j] = (i == j) ? 0 : MAX;
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            city[a][b] = Math.min(city[a][b], c);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    city[i][j] = Math.min(city[i][j], city[i][k] + city[k][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = city[i][j] < MAX ? city[i][j] : 0;

                sb.append(x + " ");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}