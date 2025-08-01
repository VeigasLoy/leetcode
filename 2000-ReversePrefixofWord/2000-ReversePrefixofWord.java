// Last updated: 8/1/2025, 10:08:15 AM
class Solution {
    public int reverseDegree(String s) {
        int pos = 26;
        int prod = 1, sum = 0;
        for(int i=0;i<s.length();i++){
            prod = (pos-(s.charAt(i)-'a'))*(i+1);
            // System.out.println(prod);
            sum+=prod;
        }
        return sum;
    }
}