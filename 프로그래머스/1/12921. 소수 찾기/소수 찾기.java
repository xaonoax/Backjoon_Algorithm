class Solution {
    public int solution(int n) {
        boolean[] prime = new boolean[n + 1];
        int answer = 0;

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == false) {
                answer++;
            }
        }

        return answer;
    }
}