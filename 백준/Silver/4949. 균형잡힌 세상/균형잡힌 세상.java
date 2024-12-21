import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack<>();
        char tmp;

        while (true) {
            st.clear();
            String s = sc.nextLine();

            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                tmp = s.charAt(i);

                if (tmp == '(' || tmp == '[') {
                    st.push(tmp);
                } else if (tmp == ')' || tmp == ']') {
                    if (st.isEmpty() || (st.peek().equals('(') && tmp == ']') || (st.peek().equals('[') && tmp == ')')) {
                        st.push(tmp);
                        break;

                    }

                    st.pop();
                }
            }

            if (!st.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}