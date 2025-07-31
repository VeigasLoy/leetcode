// Last updated: 7/31/2025, 9:40:46 AM
class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        swap(nums, nums.length-k, nums.length-1);
        swap(nums, 0, nums.length-k-1);
        swap(nums, 0, nums.length-1);
    }

    public void swap(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}