// Last updated: 7/31/2025, 9:20:30 PM
class Solution {
    static{
        for(int i=0;i<1000;i++){
            decToBin(i);
        }
    }
    public static String decToBin(int n){
        StringBuilder s = new StringBuilder();
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        while(s.length()<32){
            s.append(0);
        }
        System.out.println(s);
        // System.out.println(s.length());
        return s.toString();
    }
    public int reverseBits(int n) {
        String s = decToBin(n);
        return Integer.parseInt(s,2);
    }
}
