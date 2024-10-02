class Solution {
    public int solution(String s) {
        int answer = s.length();

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            String str = "";
            int count = 1;

            for (int j = 0; j <= s.length() - i; j += i) {
                String st = s.substring(j, j + i);

                if (str.equals(st)) {
                    count++;
                    continue;
                } else if (count > 1) {
                    stringBuffer.append(count + str);
                    count = 1;
                } else {
                    stringBuffer.append(str);
                }

                str = st;
            }

            stringBuffer.append(count > 1 ? count + str : str);

            if (s.length() % i != 0) {
                stringBuffer.append(s.substring(s.length() - s.length() % i, s.length()));
            }

            answer = Math.min(answer, stringBuffer.length());
            stringBuffer = new StringBuffer();

        }

        return answer;
    }
}