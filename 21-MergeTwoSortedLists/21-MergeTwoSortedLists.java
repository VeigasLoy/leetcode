// Last updated: 7/24/2025, 9:33:37 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>(nums.length/2))
                return num;
        }
        return 0;
    }
}