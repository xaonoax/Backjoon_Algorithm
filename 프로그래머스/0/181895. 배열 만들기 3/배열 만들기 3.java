import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int[] idx : intervals) {
            int i = idx[0];
            int j = idx[1];

            for (int k = i; k <= j; k++) {
                list.add(arr[k]);
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}