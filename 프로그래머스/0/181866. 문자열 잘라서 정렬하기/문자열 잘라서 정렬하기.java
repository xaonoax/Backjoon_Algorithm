import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");

        Arrays.sort(answer);

        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].isEmpty()) {
                answer[count++] = answer[i];
            }
        }

        return Arrays.copyOf(answer, count);
    }
}