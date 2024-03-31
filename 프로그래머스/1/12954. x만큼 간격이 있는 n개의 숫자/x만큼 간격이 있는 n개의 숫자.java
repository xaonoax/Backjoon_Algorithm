import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public long[] solution(long x, int n) {
        List<Long> answer = new ArrayList<>();

        if (x == 0) {
            for (long i = x; i < n; i++) {
                answer.add(0L);
            }
        } else if (x > 0) {
            for (long i = x; i <= x * n; i += x) {
                answer.add(i);
            }
        } else {
            for (long i = x; i >= x * n; i += x) {
                answer.add(i);
            }
        }

        return answer.stream().mapToLong(i -> i).toArray();
    }
}