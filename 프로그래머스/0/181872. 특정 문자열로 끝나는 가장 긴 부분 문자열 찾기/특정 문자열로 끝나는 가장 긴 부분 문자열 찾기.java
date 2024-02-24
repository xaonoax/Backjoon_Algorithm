class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String str = "";

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            str += c;

            if (str.endsWith(pat)) {
                answer = str;
            }

        }

        return answer;
    }
}