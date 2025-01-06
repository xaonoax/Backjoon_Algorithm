import java.util.*;

public class Main {
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
    }

    public static void dfs(int n, int m, int x) {
        if (x == m) {
            for (int a : arr) {
                System.out.print(a + " ");
            }

            System.out.println();
            
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[x] = i + 1;
                dfs(n, m, x + 1);
                visit[i] = false;
            }
        }
    }
}