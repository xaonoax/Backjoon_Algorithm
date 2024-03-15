import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] num = Arrays.stream(arr).distinct().toArray();
        int[] answer = new int[k];

        for (int i = 0; i < answer.length; i++) {
            if (i < num.length) {
                answer[i] = num[i];
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}