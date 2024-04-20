import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int num = arr[0];

        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (num > arr[i]) {
                    num = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != num) {
                    answer.add(arr[i]);
                }
            }
        } else {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}