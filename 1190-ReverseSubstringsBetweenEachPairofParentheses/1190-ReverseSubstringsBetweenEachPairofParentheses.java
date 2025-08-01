// Last updated: 8/1/2025, 7:12:34 PM
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int left = 1, right = x;
        while (left<=right) {
            int mid = (left+right)/2;
            if(mid == x/mid)
                return mid;
            else if(mid<x/mid)
                left = mid+1;
            else
                right = mid-1;
        }
        return right;
    }
}