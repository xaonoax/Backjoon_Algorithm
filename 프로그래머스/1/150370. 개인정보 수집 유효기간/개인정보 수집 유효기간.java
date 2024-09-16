import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }

        int y = Integer.parseInt(today.split("\\.")[0]);
        int m = Integer.parseInt(today.split("\\.")[1]);
        int d = Integer.parseInt(today.split("\\.")[2]);

        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28;
            int n = (y - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
                    + (m - Integer.parseInt(date.split("\\.")[1])) * 28
                    + (d - Integer.parseInt(date.split("\\.")[2]));

            if (n >= type) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}