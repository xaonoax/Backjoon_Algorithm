import java.io.*;
import java.util.*;

public class Main {
    static int[] p;
    static StringBuilder answer;
    static boolean[][] relation;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        answer = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];

            p = new int[n + 1];
            relation = new boolean[n + 1][n + 1];

            arr[0] = 0;
            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());

                for (int j = 0; j < i; j++) {
                    p[arr[i]]++;
                    relation[arr[j]][arr[i]] = true;
                }
            }

            int m = Integer.parseInt(br.readLine());

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());

                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());

                swap(n1, n2);
            }

            sort(n, 0);
        }

        System.out.println(answer.toString());
    }

    public static void swap(int n1, int n2) {
        if (relation[n2][n1]) {
            int temp = n1;

            n1 = n2;
            n2 = temp;
        }

        relation[n1][n2] = false;

        p[n2]--;

        relation[n2][n1] = true;

        p[n1]++;
    }

    public static void sort(int n, int now) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int nextCnt = 0;

        while (cnt < n) {
            p[now] = -1;

            int temp = now;

            nextCnt = 0;

            for (int i = 0; i <= n; i++) {
                if (!relation[temp][i] || --p[i] != 0) {
                    continue;
                }

                now = i;

                nextCnt++;
            }

            if (nextCnt != 1) {
                answer.append("IMPOSSIBLE\n");

                return;
            }

            sb.append(now).append(" ");

            cnt++;
        }

        answer.append(sb.toString()).append("\n");
    }
}