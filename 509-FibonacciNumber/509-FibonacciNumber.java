// Last updated: 7/17/2025, 10:19:19 AM
class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}