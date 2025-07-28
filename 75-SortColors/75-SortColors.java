// Last updated: 7/28/2025, 4:00:35 PM
class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        for (int st=0;st<n;st+=2*k){
            int i=st;
            int j;
            if(st+k-1<n)
                j=st+k-1;
            else
                j=n-1;
   
            while(i<j){
                char t=ch[i];
                ch[i++]=ch[j];
                ch[j--]=t;
            }
        }
        return String.valueOf(ch);
    }
}