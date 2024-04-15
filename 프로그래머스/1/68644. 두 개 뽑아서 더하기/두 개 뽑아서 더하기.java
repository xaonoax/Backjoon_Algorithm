import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(answer);

        return answer.stream().distinct().mapToInt(i -> i).toArray();
    }
}