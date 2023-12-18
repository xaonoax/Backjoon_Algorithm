import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];


        for (int i=my_string.length(); i>0; i--) {
            answer[my_string.length() - i] = my_string.substring(my_string.length() - i);
        }

        Arrays.sort(answer);

        return answer;
    }
}