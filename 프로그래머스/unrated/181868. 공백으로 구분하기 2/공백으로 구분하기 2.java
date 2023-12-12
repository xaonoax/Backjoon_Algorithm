import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = Arrays.stream(my_string.trim().split("\\s+"))
                                .filter(item -> !item.equals(" "))
                                .toArray(String[]::new);

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}