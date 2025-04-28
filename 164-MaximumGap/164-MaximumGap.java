// Last updated: 4/28/2025, 10:36:38 AM
class Solution {
    public int maximumGap(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int num: nums){
            al.add(num);
        }
        Collections.sort(al);
        int max=0;
        for(int i=1;i<al.size();i++){
            max = Math.max(max,Math.abs(al.get(i-1)-al.get(i)));
        }
        return max;
    }
}