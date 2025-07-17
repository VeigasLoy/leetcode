// Last updated: 7/17/2025, 2:06:22 PM
class Solution {
    int minCost(int[] cost,int step,int[] mem){
        if(step>=cost.length)
            return 0;
        if(mem[step]!=-1)
               return mem[step];
        mem[step] = cost[step]+Math.min(minCost(cost,step+1,mem),minCost(cost,step+2,mem));
        return mem[step];
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] mem = new int[n+1];
        Arrays.fill(mem,-1);
        return Math.min(minCost(cost,0,mem),minCost(cost,1,mem));
    }
}