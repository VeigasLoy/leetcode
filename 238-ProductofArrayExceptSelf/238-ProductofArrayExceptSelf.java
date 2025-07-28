// Last updated: 7/28/2025, 9:58:30 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1, right = 1;
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            res[i] *= left;
            left *= nums[i];
        }
        for(int i=n-1;i>-1;i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}