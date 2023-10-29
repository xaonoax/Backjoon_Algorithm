class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");

        String[] words = letter.split(" ");

        for (String word : words) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) {
                    answer += letters[i];
                    break;
                }
            }
        }
        return answer;
    }
}