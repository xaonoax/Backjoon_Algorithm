import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());

            switch (m) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        str.append(-1).append("\n");
                    } else {
                        str.append(stack.pop()).append("\n");
                    }
                    break;
                case 3:
                    str.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        str.append(1).append("\n");
                    } else {
                        str.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        str.append(-1).append("\n");
                    } else {
                        str.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(str);
        br.close();
    }
}