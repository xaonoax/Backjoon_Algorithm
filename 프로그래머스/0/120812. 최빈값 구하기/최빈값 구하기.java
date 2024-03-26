import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] count = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int num = count[0];

        for (int i = 1; i < count.length; i++) {
            if (num < count[i]) {
                num = count[i];
                answer = i;
            } else if (num == count[i]) {
                answer = -1;
            }
        }

        return answer;
    }
}