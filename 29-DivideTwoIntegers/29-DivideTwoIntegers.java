// Last updated: 4/28/2025, 10:39:42 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        else if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;
        else if(divisor == 1)   return dividend;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
         long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long quotient = 0;
        while (dvd >= dvs) {
            dvd -= dvs;
            quotient++;
        }
        return (int)quotient*sign;
    }
}