import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(s.length() >= m) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        List<String> str_list = new ArrayList<>(map.keySet());

        str_list.sort((o1, o2) -> {
            if (Integer.compare(map.get(o1), map.get(o2)) > 0) {
                return -1;
            } else if(Integer.compare(map.get(o1), map.get(o2)) < 0) {
                return 1;
            }
            
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            }

            return o1.compareTo(o2);
        });

        StringBuilder sbd = new StringBuilder();
        
        for(String str : str_list) {
            sbd.append(str).append("\n");
        }

        System.out.println(sbd);
    }
}