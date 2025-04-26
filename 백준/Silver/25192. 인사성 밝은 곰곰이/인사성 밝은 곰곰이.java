import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("ENTER")) {
                set.clear();
            } else {
                if (set.contains(s)) {
                    continue;
                }

                set.add(s);
                num++;
            }
        }

        System.out.println(num);
    }
}