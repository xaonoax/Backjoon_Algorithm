import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        int count = 0;

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;

            if (sum == n) {
                break;
            }
        }

        System.out.println(count);
    }
}