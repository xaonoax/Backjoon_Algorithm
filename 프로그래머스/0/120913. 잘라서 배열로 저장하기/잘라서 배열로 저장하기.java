import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            if (i + n <= my_str.length()) {
                list.add(my_str.substring(i, i + n));
            } else if (i + n > my_str.length()) {
                list.add(my_str.substring(i, my_str.length()));
            }
        }

        return list.stream().toArray(String[]::new);
    }
}