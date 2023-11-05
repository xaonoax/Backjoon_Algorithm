import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                count++;
            }
        }

        answer = new int[count];
        int index = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer[index] = Character.getNumericValue(my_string.charAt(i));
                index++;
            }
        }
        
        Arrays.sort(answer);

        return answer;
    }
}