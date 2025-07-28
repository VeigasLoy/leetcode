// Last updated: 7/28/2025, 2:31:48 PM
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;i<j;j--){
                if(nums[i]==2 && nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
                else if(nums[i]==1 && nums[j]==0){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }    
            }
        }
    }
}