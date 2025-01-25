import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i / 100 == 0) {
                count++;
            } else if (i / 1000 == 0) {
                int hun = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}