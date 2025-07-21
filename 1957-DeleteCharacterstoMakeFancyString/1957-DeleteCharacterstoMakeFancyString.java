// Last updated: 7/21/2025, 9:51:44 AM
class Solution {
    public String makeFancyString(String s) {
        if (s.length() <= 2) return s;
        ArrayList<Character> al = new ArrayList<>();
        int count = 0;
        al.add(s.charAt(0));
        al.add(s.charAt(1));
        count = s.charAt(0) == s.charAt(1) ? 1 : 0;
        
        for(int i=2;i<s.length();i++) {
            if(s.charAt(i)==al.get(al.size()-1)){
                count++;
            }   else{
                count=0;
            }
            if(count<2){
                al.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:al) {
            sb.append(c);
        }
        return sb.toString();
    }
}