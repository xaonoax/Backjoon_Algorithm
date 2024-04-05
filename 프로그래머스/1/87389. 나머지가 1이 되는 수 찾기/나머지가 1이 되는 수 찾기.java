class Solution {
    public int solution(int n) {
        int num = 0;
        int i = 1;

        while (num != 1) {
            num = n % i;
            i++;
        }

        int answer = i - 1;

        return answer;
    }
}