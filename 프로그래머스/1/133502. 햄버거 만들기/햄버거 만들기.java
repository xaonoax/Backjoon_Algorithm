class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] arr = new int[ingredient.length];
        int num = 0;

        for (int i : ingredient) {
            arr[num++] = i;
            if (num >= 4 && arr[num - 1] == 1
                    && arr[num - 2] == 3
                    && arr[num - 3] == 2
                    && arr[num - 4] == 1) {
                num -= 4;
                answer++;
            }
        }

        return answer;
    }
}