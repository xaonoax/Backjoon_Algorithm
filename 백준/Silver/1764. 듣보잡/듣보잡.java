import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            map.put(sc.next(), 1);
        }

        for (int i = 0; i < m; i++) {
            String name = sc.next();
            map.put(name, map.getOrDefault(name, 0) + 1);

            if (map.get(name) == 2) {
                list.add(name);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}