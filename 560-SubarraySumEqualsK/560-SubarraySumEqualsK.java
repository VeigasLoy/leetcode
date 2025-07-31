// Last updated: 7/31/2025, 9:40:22 PM
class Solution {

    public boolean isLetter(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int start=0, end=ch.length-1;
        while(start<end){
            if(isLetter(ch[start]) && isLetter(ch[end])){
                char tmp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = tmp;
            }
            else if(!isLetter(ch[start]))
                start++;
            else end--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
        return sb.toString();
    }
}