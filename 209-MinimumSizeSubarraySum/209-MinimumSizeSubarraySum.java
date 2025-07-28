// Last updated: 7/28/2025, 12:27:01 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int i=0, j=0;
        int sum = 0;
        boolean flag = false;
        while(j<nums.length){
            if(sum<target){
                sum += nums[j++];
            } 
            if(sum>=target){
                minSize = Math.min(minSize,j - i);
                flag = true;
                sum -= nums[i++];
            }
        }
        while(i < nums.length && sum>=target){
                minSize = Math.min(minSize,j - i);
                flag = true;
                sum -= nums[i++];
        }
        return (flag)?minSize:0;
    }
}