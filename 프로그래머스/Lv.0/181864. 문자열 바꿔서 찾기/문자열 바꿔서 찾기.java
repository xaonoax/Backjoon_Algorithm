class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);

            if (c == 'A') {
                c = 'B';
                str += String.valueOf(c);
            } else if (c == 'B') {
                c = 'A';
                str += String.valueOf(c);
            }
        }

        if (str.contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}