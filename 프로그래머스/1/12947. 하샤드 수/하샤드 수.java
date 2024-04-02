class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sum += Character.getNumericValue(c);
        }

        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}