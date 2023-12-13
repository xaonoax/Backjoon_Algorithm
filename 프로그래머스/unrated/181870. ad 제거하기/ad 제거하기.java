import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));

        list.removeIf(s -> s.contains("ad"));

        String[] answer = list.toArray(new String[0]);

        return answer;
    }
}