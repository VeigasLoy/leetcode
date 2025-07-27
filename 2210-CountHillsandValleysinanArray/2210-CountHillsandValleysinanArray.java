// Last updated: 7/27/2025, 11:50:36 AM
class Solution {
    public int countHillValley(int[] nums) {
        int hill = 0, valley = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int prev = 0;
        for(int num:nums){
            if(al.size()==0)
                al.add(num);
            else if(num!=prev){
                al.add(num);
            }
            prev = num;
        }
        boolean[] isValley = new boolean[al.size()];
        Arrays.fill(isValley,false);
        for(int i=1;i<al.size()-1;i++){
            if(al.get(i-1)<al.get(i) && al.get(i+1)<al.get(i)){
                hill++;
            }
            else if(al.get(i-1)>al.get(i) && al.get(i+1)>al.get(i)){
                valley++;
            }
        }
        return hill+valley;
    }
}