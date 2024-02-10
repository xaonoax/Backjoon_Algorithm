class Solution {
    public int solution(int num, int k) {
        String num2 = String.valueOf(num);
        String k2 = String.valueOf(k);
        String[] str = num2.split("");

        int answer = num2.indexOf(k2);

        if (answer == -1) {
            answer = -1;
        } else {
            answer += 1;
        }

        return answer;
    }
}