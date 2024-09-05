import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");

            if (str[0].equals("Leave")) {
                continue;
            } else if (str[0].equals("Enter")) {
                map.put(str[1], str[2]);
            } else {
                map.put(str[1], str[2]);
                cnt++;
            }
        }

        String[] answer = new String[record.length - cnt];
        int idx = 0;

        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            String name = map.get(str[1]);

            if (str[0].equals("Enter")) {
                answer[idx++] = name + "님이 들어왔습니다.";
            } else if (str[0].equals("Leave")) {
                answer[idx++] = name + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}