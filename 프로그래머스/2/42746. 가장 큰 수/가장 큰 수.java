import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (int i = 0; i < numbers.length; i++) {
            answer += str[i];
        }

        if (answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;
    }
}