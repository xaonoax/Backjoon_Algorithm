class Solution {
    public int solution(String word) {
        int answer = word.length();
        String vowels = "AEIOU";
        int[] increase = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            answer += (increase[i] * vowels.indexOf(word.charAt(i)));
        }

        return answer;
    }
}