// Last updated: 7/28/2025, 2:51:18 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1;
        int i = 0;
        while(i <= high){
            if (nums[i] == 0) {
                swap(nums, i, low);
                low++;
                i++;
            } else if(nums[i] == 2){
                swap(nums, i, high);
                high--;
            } else{
                i++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}