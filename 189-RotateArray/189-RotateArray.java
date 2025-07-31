// Last updated: 7/31/2025, 9:30:54 AM
class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        for(int num:nums){
            d.add(num);
        }
        int n=nums.length-1;
        for(int i=0;i<k;i++){
            d.addFirst(d.pollLast());
        }
        int i=0;
        for(int ds: d){
            nums[i]=ds;
            i++;
        }
    }
}