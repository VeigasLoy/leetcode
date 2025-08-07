// Last updated: 8/7/2025, 8:24:48 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start=0,end=0, c=0,b=0;
        int min = Integer.MAX_VALUE;
        while(end<blocks.length()){
            if(blocks.charAt(end)=='W')  c++;
            if(end-start+1==k){
                min = Math.min(min,c);
                if(blocks.charAt(start)=='W')    c--;
                start++;
            }
            
            end++; 
        }
        return min;
    }
}
// 0,3,4
// 3,4,7
// 3,4,7
// 3,4,7,9