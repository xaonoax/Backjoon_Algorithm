import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }

        int num = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i) * num;
            num *= 3;
        }

        return answer;
    }
}