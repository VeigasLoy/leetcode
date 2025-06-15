// Last updated: 6/15/2025, 10:40:08 AM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)  return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int diff=0;
        k--;
        for(int i=0;i+k<nums.length;i++){
            diff=nums[k+i]-nums[i];
            min = (diff<min)?diff:min;
        }
        return min;
    }
}