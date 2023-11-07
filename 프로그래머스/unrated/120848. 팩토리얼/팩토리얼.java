class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;

        while (factorial <= n) {
            answer++;
            factorial *= answer;
        }

        return answer - 1;
    }
}