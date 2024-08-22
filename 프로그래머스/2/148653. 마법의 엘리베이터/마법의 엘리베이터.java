class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey != 0) {
            int x = storey % 10;
            int y = (storey / 10) % 10;

            if (x > 5) {
                answer += 10 - x;
                storey += 10;
            } else if (x == 5) {
                answer += x;
                storey += (y < 5 ? 0 : 10);
            } else {
                answer += x;
            }
            storey /= 10;
        }

        return answer;
    }
}