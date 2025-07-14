// Last updated: 7/14/2025, 10:08:15 AM
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        int idx=0;
        while(al.size()>1){
            idx = (idx + k-1)%al.size();
            al.remove(idx);
        }
        return al.get(0);
    }
}