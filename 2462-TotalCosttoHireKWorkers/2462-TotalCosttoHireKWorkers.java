// Last updated: 7/24/2025, 3:54:47 PM
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> front = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>();
        int left = 0;
        int right = costs.length - 1;
        long total = 0;
        while(front.size()<candidates && left<=right){
            front.offer(costs[left++]);
        }
        while(back.size()<candidates && left<=right){
            back.offer(costs[right--]);
        }
        while(k-->0){
            if(back.isEmpty()||(!front.isEmpty() && front.peek()<=back.peek())){
                total+=front.poll();
                if(left <= right)
                    front.offer(costs[left++]);
            }   else{
                    total+=back.poll();
                    if(left <= right)
                        back.offer(costs[right--]);
            }
        }    
        return total; 
    }
}