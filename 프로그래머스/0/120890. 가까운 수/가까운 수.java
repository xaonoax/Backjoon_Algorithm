class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(answer - n)) {
                answer = array[i];
            } else if (Math.abs(array[i] - n) == Math.abs(answer - n) && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }
}