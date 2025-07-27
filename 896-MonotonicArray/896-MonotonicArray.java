// Last updated: 7/27/2025, 12:40:37 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int[] asc = nums.clone();  
        int[] des = new int[nums.length];
        Arrays.sort(asc);
        for(int i=nums.length-1,j=0;i>-1;i--,j++){
            des[j]=asc[i];
        }
        if(asc[0]==nums[0]){
            for(int i=1;i<nums.length;i++){
                if(asc[i]!=nums[i])
                    return false;
            }
            return true;
        }
        else if(des[0]==nums[0]){
            for(int i=1;i<nums.length;i++){
                if(des[i]!=nums[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}