class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int n = chicken;

        while (n >= 10) {
            answer += n / 10;
            n = n / 10 + n % 10;
        }

        return answer;
    }
}