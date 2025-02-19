import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int s = 64;
        int count = 0;

        while (x > 0) {
            if (s > x) {
                s /= 2;
            } else {
                x -= s;
                count++;
            }
        }

        System.out.println(count);
    }
}