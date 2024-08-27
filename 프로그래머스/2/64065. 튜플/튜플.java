import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();

        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2).replaceAll("},\\{", "-");

        String[] str = s.split("-");

        Arrays.sort(str, Comparator.comparingInt(String::length));

        for (String x : str) {
            String[] tmp = x.split(",");

            for (int i = 0; i < tmp.length; i++) {
                int n = Integer.parseInt(tmp[i]);

                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}