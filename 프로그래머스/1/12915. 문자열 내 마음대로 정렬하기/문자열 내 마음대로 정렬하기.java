import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();

        Arrays.sort(answer);
        Arrays.sort(answer, (s1, s2) -> s1.charAt(n) - s2.charAt(n));

        return answer;
    }
}