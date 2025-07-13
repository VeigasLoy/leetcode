// Last updated: 7/13/2025, 3:09:23 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0,i=0,j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                i++;
            } 
            j++;
        }
        return count;
    }
}