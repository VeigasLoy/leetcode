// Last updated: 7/24/2025, 9:17:52 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        if(nums.length==1){
            return 1;
        }
        while(i<nums.length){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
            i++;
            if(i==nums.length-1){
                list.add(nums[i]);
                i++;
            }
                
        }
        for (i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}