import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb.append("1 ");

        int m = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= n; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while (!deque.isEmpty()) {
            if (m > 0) {
                for (int i = 1; i < m; i++) {
                    deque.add(deque.pollFirst());
                }

                int[] next = deque.removeFirst();

                m = next[1];
                sb.append(next[0]).append(" ");
            } else {
                for (int i = m; i < -1; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] next = deque.removeLast();

                m = next[1];
                sb.append(next[0]).append(" ");
            }
        }

        System.out.println(sb);
    }
}