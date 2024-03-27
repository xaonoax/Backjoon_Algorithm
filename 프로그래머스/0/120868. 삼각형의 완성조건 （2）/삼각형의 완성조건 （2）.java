import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        for (int i = sides[1]; i > sides[1] - sides[0]; i--) {
            answer++;
        }

        for (int i = 1; i < sides[0]; i++) {
            answer++;
        }

        return answer;
    }
}