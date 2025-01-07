import java.util.*;

public class Main {
    static int[] arr;
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        dfs(1,0);
    }

    public static void dfs(int x, int y) {
        if (y == m) {
            for (int a : arr) {
                System.out.print(a + " ");
            }

            System.out.println();

            return;
        }

        for (int i = x; i <= n; i++) {
            arr[y] = i;
            dfs(i + 1, y + 1);
        }
    }
}