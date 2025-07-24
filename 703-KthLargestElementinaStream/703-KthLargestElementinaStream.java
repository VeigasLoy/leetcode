// Last updated: 7/24/2025, 12:03:59 PM
class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    int[] large;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
        }
        this.k=k;
        for(int i=0;i<nums.length-k;i++){
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */