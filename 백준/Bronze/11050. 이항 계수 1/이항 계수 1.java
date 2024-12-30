import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(binomal(n) / (binomal(n - k) * binomal(k)));
    }

    public static int binomal(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * binomal(n - 1);
    }
}