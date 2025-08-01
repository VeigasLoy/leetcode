// Last updated: 8/1/2025, 9:37:59 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if(idx==(-1))   return word;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb1.append(word.substring(0,idx+1)).reverse());
        sb2.append(word.substring(idx+1));
        return sb2.toString();
    }
}