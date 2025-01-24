import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a * b * c;
        String s = String.valueOf(n);

        for (int i = 0; i < 10; i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(j) - '0') == i) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}