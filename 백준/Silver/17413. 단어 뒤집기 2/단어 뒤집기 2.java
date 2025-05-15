import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        Stack<Character> stack = new Stack<>();

        while (idx < s.length()) {
            if (s.charAt(idx) == '<') {
                while (true) {
                    sb.append(s.charAt(idx++));
                    if (s.charAt(idx) == '>') {
                        sb.append(s.charAt(idx));
                        idx++;
                        break;
                    }
                }
            } else if (s.charAt(idx) == ' ') {
                sb.append(' ');
                idx++;
            } else {
                while (idx < s.length() && s.charAt(idx) != ' ' && s.charAt(idx) != '<') {
                    stack.push(s.charAt(idx++));
                }

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        System.out.println(sb.toString());
    }
}