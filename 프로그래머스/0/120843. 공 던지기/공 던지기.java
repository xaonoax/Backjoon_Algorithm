import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers, int k) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < numbers.length; j++) {
                list.add(numbers[j]);
            }
        }

        for (int i = 0; i < k * 2; i += 2) {
            answer = list.get(i);
        }

        return answer;
    }
}