import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] b = new boolean[1000001];

        b[0] = true;
        b[1] = true;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (b[i]) {
                continue;
            }

            for (int j = i * i; j < 1000001; j += i) {
                b[j] = true;
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            int t = sc.nextInt();

            for (int j = 2; j <= t / 2; j++) {
                if (!b[j] && !b[t - j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}