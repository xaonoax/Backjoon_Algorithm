import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }

        String[] answer = list.toArray(new String[list.size()]);

        return answer;
    }
}