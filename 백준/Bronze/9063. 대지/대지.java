import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xmax = -10000;
        int xmin = 10000;
        int ymax = -10000;
        int ymin = 10000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            xmax = Math.max(xmax, x);
            xmin = Math.min(xmin, x);
            ymax = Math.max(ymax, y);
            ymin = Math.min(ymin, y);
        }

        System.out.println((xmax - xmin) * (ymax - ymin));
    }
}