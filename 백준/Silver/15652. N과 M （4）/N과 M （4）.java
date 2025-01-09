import java.util.*;

public class Main {
    static int[] arr;
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        if (y == m) {
            for (int a : arr) {
                sb.append(a).append(' ');
            }

            sb.append('\n');
            return;
        }

        for (int i = x; i <= n; i++) {
            arr[y] = i;
            dfs(i, y + 1);
        }
    }
}