// Last updated: 4/28/2025, 10:39:52 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) return i;
            else if(((i==nums.length-1)&&(nums[i]<target))||((nums[i]<target)&&(nums[i+1]>target))){
                return i+1;
            }
        }
        return 0;
    }
}