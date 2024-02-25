import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else if (!flag[i]){
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}