// Last updated: 4/28/2025, 10:36:54 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele: hm.entrySet()){
            int val = ele.getValue();
            int key = ele.getKey();
            if(val>(nums.length/3)){
                al.add(key);
            }
        }
        return al;
    }
}