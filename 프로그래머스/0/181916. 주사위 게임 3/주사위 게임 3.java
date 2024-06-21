import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dices = {a, b, c, d};

        Arrays.sort(dices);

        if (dices[0] == dices[3]) {
            answer = 1111 * dices[0];
            System.out.println(1);
        } else if (dices[0] == dices[2]) {
            answer = (int) Math.pow(10 * dices[0] + dices[3], 2);
        } else if (dices[1] == dices[3]) {
            answer = (int) Math.pow(10 * dices[1] + dices[0], 2);
        } else if ((dices[0] == dices[1]) && (dices[2] == dices[3])) {
            answer = (int) Math.abs((dices[2] + dices[0]) * ((int) Math.abs(dices[0]) - (int) Math.abs(dices[2])));
        } else if (dices[0] == dices[1]) {
            answer = dices[2] * dices[3];
        } else if (dices[1] == dices[2]) {
            answer = dices[0] * dices[3];
        } else if (dices[2] == dices[3]) {
            answer = dices[0] * dices[1];
        } else {
            answer = dices[0];
        }

        return answer;
    }
}