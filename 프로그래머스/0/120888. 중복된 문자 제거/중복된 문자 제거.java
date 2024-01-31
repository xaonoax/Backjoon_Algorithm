import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");

        List<String> list = Arrays.asList(str);

        List<String> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        String answer = String.join("", distinctList);

        return answer;
    }
}