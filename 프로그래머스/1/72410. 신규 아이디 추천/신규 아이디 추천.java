class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^\\.|\\.$", "");
        
        if (answer.isEmpty()) {
            answer = "a";
        }
        
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);

            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        if (answer.length() <= 2) {
            char c = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += c;
            }
        }

        return answer;
    }
}