import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;

        while (b != a) {
            if (b < a) {
                System.out.println(-1);

                return;
            }

            String s = String.valueOf(b);

            if (b % 2 == 0) {
                b /= 2;
            } else if (s.charAt(s.length() - 1) == '1') {
                s = s.substring(0, s.length() - 1);
                b = Integer.parseInt(s);
            } else {
                System.out.println(-1);

                return;
            }

            count++;
        }

        System.out.println(count);
    }
}