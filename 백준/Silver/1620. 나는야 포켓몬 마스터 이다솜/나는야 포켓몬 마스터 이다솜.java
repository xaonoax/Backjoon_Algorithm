import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        for (int i = 1; i <= n; i++) {
            String name = sc.next();

            map1.put(i, name);
            map2.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String name = sc.next();

            if (49 <= name.charAt(0) && name.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(name))).append("\n");
            } else {
                sb.append(map2.get(name)).append("\n");
            } 
        }
        
        System.out.println(sb);
    }
}