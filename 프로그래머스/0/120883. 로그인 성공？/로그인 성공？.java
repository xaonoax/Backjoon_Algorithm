class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (String[] login : db) {
            String id = login[0];
            String pw = login[1];

            if (id_pw[0].equals(id)) {
                if (id_pw[1].equals(pw)) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            }
        }

        return answer;
    }
}