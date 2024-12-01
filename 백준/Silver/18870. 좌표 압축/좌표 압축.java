import java.util.*;

public class Main {
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] o = new int[n];
        int[] s = new int[n];
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            o[i] = sc.nextInt();
            s[i] = o[i];
        }

        Arrays.sort(s);

        int rank = 0;

        for (int x : s) {
            if (!hM.containsKey(x)) {
                hM.put(x, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key : o) {
            int ranking = hM.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}