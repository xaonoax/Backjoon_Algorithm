import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;

        for (int s : stack) {
            sum += s;
        }

        System.out.println(sum);
    }
}