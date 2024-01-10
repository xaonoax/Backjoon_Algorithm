class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int index = 0;

        for (int i = 0; i < num_list.length; i++) {
            index++;
            if (num_list[i] < 0) {
                answer = index - 1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}