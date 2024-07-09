class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        // 제거할 0의 개수
        int remove = s.length() - s.replace("0", "").length();;
        // 0 제거 후 길이
        int length = s.replaceAll("0", "").length();
        // 0 제거 후 length의 이진 변환
        String binary = Integer.toBinaryString(length);
        // 제거 횟수
        int count = 1;

        while (length != 1) {
            remove += binary.length() - binary.replace("0", "").length();
            length = binary.replaceAll("0", "").length();
            binary = Integer.toBinaryString(length);
            count++;
        }

        answer[0] = count;
        answer[1] = remove;

        return answer;
    }
}