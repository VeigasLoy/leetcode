// Last updated: 7/24/2025, 12:23:36 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
            pq.add(stone);
        while(pq.size()>1){
            int y= pq.poll();
            int x= pq.poll();
            if(x<y){
                pq.offer(y-x);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}