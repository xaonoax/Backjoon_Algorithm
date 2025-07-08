import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int m = Integer.parseInt(br.readLine());

            sb.append(m / 2 + 1 + "\n");

            int cnt = 0;

            for (int j = 0; j < m; j++) {
                if (j % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int x = Integer.parseInt(st.nextToken());

                if(maxHeap.size() == minHeap.size()) {
                    maxHeap.offer(x);
                } else {
                    minHeap.offer(x);
                }
                if (!minHeap.isEmpty()) {
                    if (maxHeap.peek() > minHeap.peek()) {
                        int t1 = maxHeap.poll();
                        int t2 = minHeap.poll();

                        maxHeap.offer(t2);
                        minHeap.offer(t1);
                    }
                }
                if (j % 2 == 0) {
                    if (cnt == 9 || j == m - 1) {
                        sb.append(maxHeap.peek() + "\n");
                        cnt = 0;
                    } else {
                        sb.append(maxHeap.peek() + " ");
                    }
                    cnt++;
                }
            }
        }

        System.out.println(sb);
    }
}