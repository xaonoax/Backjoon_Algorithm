import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(num_list);

        if (num_list.length > 5) {
            for (int i = 5; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else {
            for (int i = 0; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}