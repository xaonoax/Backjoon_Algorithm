import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();

            if (map.get(card) == null) {
                map.put(card, 1);
            } else {
                map.put(card, map.get(card) + 1);
            }
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int card = sc.nextInt();

            if (map.get(card) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(card)).append(" ");
            }
        }

        System.out.println(sb);
    }
}