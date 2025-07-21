// Last updated: 7/21/2025, 11:49:42 AM
class Solution {
    public int[] sortByBits(int[] nums) {
        Integer arr[] = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr,(Integer a, Integer b)->{
            int cntA = Integer.bitCount(a);
            int cntB = Integer.bitCount(b);
            if(cntA!=cntB){
                return cntA-cntB;
            }
            else{
                return a-b;
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
        return nums;
    }
}