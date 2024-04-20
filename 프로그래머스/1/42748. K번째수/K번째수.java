import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] com : commands) {
            List<Integer> list = new ArrayList<>();

            for (int i = com[0] - 1; i < com[1]; i++) {
                list.add(array[i]);
            }

            Collections.sort(list);

            answer[idx] = (list.get(com[2] - 1));
            idx++;
        }

        return answer;
    }
}