import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.valueOf(intStrs[i].substring(s, s + l));

            if (num > k) {
                arr.add(num);
            }
        }

        int[] answer = arr.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}