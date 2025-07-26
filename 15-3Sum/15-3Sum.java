// Last updated: 7/26/2025, 12:27:33 PM
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch(token){
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                }
            } else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}