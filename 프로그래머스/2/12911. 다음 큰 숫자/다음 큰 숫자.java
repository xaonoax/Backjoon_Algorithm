class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while (true) {
            n++;

            int count2 = Integer.bitCount(n);

            if (count == count2) {
                break;
            }
        }

        answer = n;

        return answer;
    }
}