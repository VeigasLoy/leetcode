// Last updated: 7/25/2025, 9:52:25 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)   return s.length();
        int start = 0, end = 1;
        int len = 0;
        ArrayList<Character> al = new ArrayList<>();
        al.add(s.charAt(0)); 
        while(end<s.length()){
            if(al.contains(s.charAt(end))){
                al.subList(0,al.indexOf(s.charAt(end))+1).clear();
            }
            if(!al.contains(s.charAt(end))){
                al.add(s.charAt(end));
            }
            len = Math.max(len,al.size());
            end++;
        }
        return len;
    }
}