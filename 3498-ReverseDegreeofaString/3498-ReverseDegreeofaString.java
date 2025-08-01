// Last updated: 8/1/2025, 10:31:32 AM
class Solution {
    public String reverseWords(String s) {
        int start =0, end = 0;
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(end<=ch.length){
            if(end==ch.length || ch[end]==' '){
                sb.append(new StringBuilder(s.substring(start,end)).reverse());
                if(end!=ch.length){
                    sb.append(" ");
                    start = end+1;
                }  
            }
            end++;
        }
        return sb.toString();
    }
}