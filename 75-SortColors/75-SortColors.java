// Last updated: 7/28/2025, 3:21:55 PM
class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        int i=0;
        while(i<j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;        
        }
    }
}