class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (d * i) + a;
        }

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += arr[i];
            }
        }

        return answer;
    }
}