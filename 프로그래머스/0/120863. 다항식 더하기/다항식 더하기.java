class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int n = 0;
        String[] str = polynomial.split(" ");

        for (String s : str) {
            if (s.contains("x")) {
                if (s.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(s.replaceAll("x", ""));
                }
            } else if (!s.contains("+")) {
                n += Integer.parseInt(s);
            }
        }

        if (x == 1 && n == 0) {
            answer = "x";
        } else if (x == 1 && n != 0) {
            answer = "x + " + n;
        } else if (x != 0 && n == 0) {
            answer = x + "x";
        } else if (x != 0 && n != 0) {
            answer = x + "x + " + n;
        } else if (x == 0 && n != 0) {
            answer = Integer.toString(n);
        }

        return answer;
    }
}