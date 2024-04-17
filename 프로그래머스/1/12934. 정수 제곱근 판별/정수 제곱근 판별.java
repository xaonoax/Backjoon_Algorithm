class Solution {
    public long solution(long n) {
        long answer = -1;

        if (Math.sqrt(n) % 1 == 0) {
            answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        }

        return answer;
    }
}