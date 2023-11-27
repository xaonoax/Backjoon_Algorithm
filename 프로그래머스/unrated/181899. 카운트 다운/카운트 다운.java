class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        for (int i = 0, j = start; i < answer.length; i++, j--) {
            answer[i] = j;
        }
        return answer;
    }
}