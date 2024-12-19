import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "1" :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3" :
                    sb.append(deque.isEmpty() ? -1 : deque.poll()).append("\n");
                    break;
                case "4" :
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "5" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "6" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7" :
                    sb.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
                    break;
                case "8" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}