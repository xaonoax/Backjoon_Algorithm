class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum / 2; i++) {
            int r = i;
            int c = sum / r;

            if ((r - 2) * (c - 2) == yellow) {
                answer[0] = c;
                answer[1] = r;
                break;
            }
        }
        return answer;
    }
}