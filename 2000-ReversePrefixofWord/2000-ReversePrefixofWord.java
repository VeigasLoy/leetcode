// Last updated: 8/1/2025, 9:50:37 AM
class Solution {
    public boolean isVowel(char c){
        if((c=='a')||(c=='A')) return true;
        if((c=='e')||(c=='E')) return true;
        if((c=='i')||(c=='I')) return true;
        if((c=='o')||(c=='O')) return true;
        if((c=='u')||(c=='U')) return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start=0, end = ch.length-1;
        while(start<end){
            if(isVowel(ch[start]) && isVowel(ch[end])){
                char tmp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = tmp;
            }
            else if(!isVowel(ch[start]))    start++;
            else    end--;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(ch));
        return sb.toString(); 
    }
}