import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            num = 1;

            for (int j = 0; j < n; j++) {
                num = num * (m - j) / (j + 1);
            }
            System.out.println(num);
        }
    }
}