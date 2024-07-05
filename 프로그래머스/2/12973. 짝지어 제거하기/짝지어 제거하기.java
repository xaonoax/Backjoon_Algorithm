import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        String[] str = s.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (stack.isEmpty()) {
                stack.push(str[i]);
            } else if (stack.peek().equals(str[i])) {
                stack.pop();
            } else {
                stack.push(str[i]);
            }
        }

        answer = stack.isEmpty() ? 1 : 0;

        return answer;
    }
}