// Last updated: 7/25/2025, 8:34:13 PM
class Frequency{
    int val;
    int freq;

    Frequency(int val,int freq){
        this.val = val;
        this.freq = freq;
    }

}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Frequency> pq = new PriorityQueue<>((a,b)->(b.freq-a.freq));
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i: map.keySet()){
            pq.add(new Frequency(i,map.get(i)));
        }
        int[] freq = new int[k];
        for(int i=0;i<k;i++){
            freq[i] = pq.poll().val;
        }
        return freq;
    }
}