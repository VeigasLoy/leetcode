// Last updated: 7/31/2025, 3:00:58 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans; 
   }
}