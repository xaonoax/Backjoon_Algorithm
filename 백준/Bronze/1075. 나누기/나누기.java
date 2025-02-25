import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int div = (n / 100 * 100);

        while (true) {
            if (div % f == 0) {
                break;
            }

            div++;
        }

        System.out.printf("%02d", div % 100);
    }
}