import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            answer.add(Character.getNumericValue(c));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}