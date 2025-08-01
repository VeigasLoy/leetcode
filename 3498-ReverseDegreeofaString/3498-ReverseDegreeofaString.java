// Last updated: 8/1/2025, 11:50:24 AM
class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        int start = 0, end = start+2;
        while(start+1<s.length()){
            System.out.println(sb.substring(start,end));
            if(sb1.indexOf((sb.substring(start,end)))!=(-1))
                return true;
            else{
                start++;
                end++;
            }
        }
        return false;
    }
}