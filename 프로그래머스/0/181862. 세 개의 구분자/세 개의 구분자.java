import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>(Arrays.asList(myStr.trim().split("[a-c]")));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                list.removeIf(String::isEmpty);
            }
        }

        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        
        return list.stream().toArray(String[]::new);
    }
}