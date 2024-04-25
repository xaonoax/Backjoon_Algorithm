import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[s.length()];
        int idx = 0;

        while (idx != str.length) {
            answer[idx] = -1;
            idx++;
        }

        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < i; j++) {
                if (str[i].equals(str[j])) {
                    answer[i] = i - j;
                }
            }
        }

        return answer;
    }
}