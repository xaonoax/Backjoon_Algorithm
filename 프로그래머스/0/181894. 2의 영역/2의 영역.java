import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idx.add(i);
            }
        }

        if (idx.isEmpty()) {
            list.add(-1);
        } else {
            for (int i = idx.get(0); i <= idx.get(idx.size() - 1); i++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}