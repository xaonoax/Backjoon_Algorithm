import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = 0;

        Arrays.sort(numbers);

        Set<Integer> set = new HashSet<>();
        for (int n : numbers) {
            set.add(n);
        }

        for (int n : num) {
            if (!set.contains(n)) {
                answer += n;
            }
        }

        return answer;
    }
}