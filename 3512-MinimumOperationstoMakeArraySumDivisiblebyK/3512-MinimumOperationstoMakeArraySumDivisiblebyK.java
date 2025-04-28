// Last updated: 4/28/2025, 11:12:57 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0, j = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%k==0)    return j;
        else{
            while(sum%k!=0){
                sum--;
                j++;
            }
        }
        return j;
    }
}