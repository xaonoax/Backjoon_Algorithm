import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                if (query[i] != query.length) {
                    list.subList(query[i] + 1, list.size()).clear();
                }
            } else {
                if (query[i] != 0) {
                    list.subList(0, query[i]).clear();
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}