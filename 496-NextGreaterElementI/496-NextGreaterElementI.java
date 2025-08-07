// Last updated: 8/7/2025, 8:36:14 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int num:nums1){
            al.add(num);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num:nums2){
            arr.add(num);
        }
        int[] nGE = new int[nums1.length];
        for(int i=0;i<nGE.length;i++){
            int idx = arr.indexOf(al.get(i));
            while(idx<arr.size()){
                if(al.get(i)<arr.get(idx)){
                    nGE[i] = arr.get(idx);
                    break;
                }   else{
                    idx++;
                }
                if(idx==arr.size()) nGE[i]=-1;
            }
        }
        return nGE;
    }
}