// Last updated: 7/18/2025, 10:14:07 AM
class Solution {
    static int[] countBits(int num){
        return countBitsDP(num);
    }
    
    static int[] countBitsDP(int n){
        int[] count = new int[n+1];
        count[0] = 0;
        if(n==0)    return count;
        count[1] = 1;
        if(n==1)    return count;
        count[2] = 1;
        if(n==2)    return count;
        for(int i=3;i<=n;i++){
            count[i] = count[i/2]+i%2;
        }
        return count;
    }
}