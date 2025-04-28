// Last updated: 4/28/2025, 10:37:11 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> al = new ArrayList<>();
        for(int num: nums){
            al.add(num);
        }
        Collections.sort(al);
        return al.get(al.size()-k);
    }
}