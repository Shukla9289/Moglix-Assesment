import java.util.*;

public class main {

    public static int longestParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } 
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); 
                } 
                else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestParentheses("(()"));  
        System.out.println(longestParentheses(")()())")); 
        System.out.println(longestParentheses(""));       
    }
}
