import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");

        str = Arrays.stream(str)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        for(int i=0; i<str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }

        return answer;
    }
}
