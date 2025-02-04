import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (pow > Math.pow(((r2 + r1)), 2)) {
                System.out.println(0);
            } else if (pow < Math.pow(((r2 - r1)), 2)) {
                System.out.println(0);
            } else if (pow == Math.pow(((r2 + r1)), 2)) {
                System.out.println(1);
            } else if (pow == Math.pow(((r2 - r1)), 2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}