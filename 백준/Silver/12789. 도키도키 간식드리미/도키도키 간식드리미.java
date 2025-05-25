import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        
        int start = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() == start) {
                queue.poll();
                start++;
            } else if (!stack.isEmpty() && stack.peek() == start) {
                stack.pop();
                start++;
            } else {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == start) {
                stack.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            } 
        }

        System.out.println("Nice");
    }
}