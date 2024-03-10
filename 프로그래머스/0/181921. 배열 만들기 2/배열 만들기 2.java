import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<String> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            if (!str.contains("1") && !str.contains("2") && !str.contains("3")
                    && !str.contains("4") && !str.contains("6") && !str.contains("7")
                    && !str.contains("8") && !str.contains("9")) {
                list.add(str);
            }
        }

        if (list.isEmpty()) {
            list.add("-1");
        }

        return list.stream().mapToInt(Integer::parseInt).toArray();
    }
}