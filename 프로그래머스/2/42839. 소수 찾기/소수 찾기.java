import java.util.*;

class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    static boolean[] check = new boolean[7];

    public int solution(String numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            if (prime(list.get(i))) {
                answer++;
            }
        }

        return answer;
    }

    static void dfs(String str, String tmp, int m) {
        if (tmp.length() == m) {
            int n = Integer.parseInt(tmp);

            if (!list.contains(n)) {
                list.add(n);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (!check[i]) {
                check[i] = true;
                tmp += str.charAt(i);
                dfs(str, tmp, m);
                check[i] = false;
                tmp = tmp.substring(0, tmp.length() - 1);
            }
        }
    }

    static boolean prime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}