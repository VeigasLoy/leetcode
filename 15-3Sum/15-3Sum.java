// Last updated: 7/26/2025, 12:25:30 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        int i=0;
        while(i<tokens.length){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int num2 = Integer.parseInt(s.pop());
                int num1 = Integer.parseInt(s.pop());
                StringBuilder sb = new StringBuilder();
                if(tokens[i].equals("+"))
                    s.push(sb.append(num1+num2).toString());
                if(tokens[i].equals("-"))
                    s.push(sb.append(num1-num2).toString());
                if(tokens[i].equals("*"))
                    s.push(sb.append(num1*num2).toString());
                if(tokens[i].equals("/"))
                    s.push(sb.append(num1/num2).toString());
            }
            else{
                s.push(tokens[i]);
            }
            i++;
        }
        return Integer.parseInt(s.pop());
    }
}