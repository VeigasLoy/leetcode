// Last updated: 7/30/2025, 12:35:19 PM
class Solution {
    public int twoEggDrop(int n) {
        int v=1;
        while((v*(v+1))/2<n){
            v++;
        }
        return v;
    }
}