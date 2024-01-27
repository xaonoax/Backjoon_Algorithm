import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> arr = new ArrayList<Integer>();

        while (n > 0) {
            arr.add(n % 10);
            n /= 10;
        }

        for (int i = 0; i< arr.size(); i++) {
            answer += arr.get(i);
        }

        return answer;
    }
}