import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int idx = 0;


        while (idx < arr.length) {
            int lastIndex = stk.size() - 1;

            if (!stk.isEmpty() && stk.get(lastIndex) < arr[idx]) {
                stk.add(arr[idx]);
                idx++;
            } else if (!stk.isEmpty() && stk.get(lastIndex) >= arr[idx]) {
                stk.remove(stk.get(lastIndex));
            } else if (stk.isEmpty()) {
                stk.add(arr[idx]);
                idx++;
            }

        }

        return stk.stream().mapToInt(i -> i).toArray();
    }
}