class Solution {
    public String solution(int n) {
        String answer = "";
        String[] numsbers = {"4", "1", "2"};

        while (n > 0) {
            answer = numsbers[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }
}