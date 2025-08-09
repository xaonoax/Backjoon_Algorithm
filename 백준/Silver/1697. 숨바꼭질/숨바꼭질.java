import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int[] visit = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] str = st.split(" ");

        n = Integer.valueOf(str[0]);
        k = Integer.valueOf(str[1]);

        int seconds = bfs(n);

        System.out.println(seconds);
    }

    private static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(node);

        int index = node;
        int num = 0;

        visit[index] = 1;

        while (queue.isEmpty() == false) {
            num = queue.remove();

            if (num == k) {
                return visit[num] - 1;
            }
            if (num - 1 >= 0 && visit[num - 1] == 0) {
                visit[num - 1] = visit[num] + 1;

                queue.add(num - 1);
            }
            if (num + 1 <= 100000 && visit[num + 1] == 0) {
                visit[num + 1] = visit[num] + 1;

                queue.add(num + 1);
            }
            if (2 * num <= 100000 && visit[2 * num] == 0) {
                visit[2 * num] = visit[num] + 1;

                queue.add(2 * num);
            }
        }

        return -1;
    }
}