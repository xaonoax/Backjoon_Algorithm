class Solution {
    public int solution(int[] arr) {
        int[] arr1 = new int[arr.length];
        int answer = -1;
        int count = 0;

        while (count != arr.length) {
            count = 0;
            arr1 = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
                if (arr[i] == arr1[i]) {
                    count++;
                }
            }
            answer++;
        }

        return answer;
    }
}