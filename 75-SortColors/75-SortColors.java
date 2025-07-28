// Last updated: 7/28/2025, 3:05:51 PM
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int j=height.length-1;
        int i=0;
        while(i<j){
            if(max<Math.min(height[i],height[j])*(j-i)){
                max = Math.min(height[i],height[j])*(j-i);
            }
            if(height[i]<height[j]){
                i++;
            }else j--;
        }
        return max;
    }
}