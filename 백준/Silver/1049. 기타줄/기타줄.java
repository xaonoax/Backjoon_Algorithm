import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] unit = new int[m];
        int[] pack = new int[m];

        for (int i = 0; i < m; i++) {
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }

        Arrays.sort(unit);
        Arrays.sort(pack);

        min = Math.min(((n / 6) + 1) * pack[0], n * unit[0]);
        min = Math.min(min, (n / 6) * pack[0] + (n %6) * unit[0]);

        System.out.println(min);
    }
}