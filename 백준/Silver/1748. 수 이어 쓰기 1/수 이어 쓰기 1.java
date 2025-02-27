import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int num = 0;
        int plus = 10;

        for (int i = 1; i <= n; i++) {
            if (i == plus) {
                count++;
                plus = plus * 10;
            }

            num += count;
        }

        System.out.println(num);
    }
}