// Last updated: 7/24/2025, 3:02:20 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int ryt=0;
        int sum=0;
        int maxSum=0;
        while(ryt<nums.length){
            map.put(nums[ryt],map.getOrDefault(nums[ryt],0)+1);
            while(map.getOrDefault(nums[ryt],0)>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            maxSum = Math.max(maxSum,ryt-left+1);
            ryt++;
        }
        return maxSum;
    }
}