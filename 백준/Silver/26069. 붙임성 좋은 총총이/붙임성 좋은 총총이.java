import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st;
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if (set.contains(name1) || set.contains(name2)) {
                set.add(name1);
                set.add(name2);
            }
        }

        System.out.println(set.size());
    }
}