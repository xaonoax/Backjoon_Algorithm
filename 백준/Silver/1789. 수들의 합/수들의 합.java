import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long n = 1;
        long sum = 0;

        while (true) {
            sum += n;

            if (sum > s) {
                break;
            }

            n++;
        }

        System.out.println(n - 1);
    }
}