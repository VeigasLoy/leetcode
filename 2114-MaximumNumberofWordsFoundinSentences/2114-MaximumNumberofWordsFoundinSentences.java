// Last updated: 8/1/2025, 8:27:36 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        boolean isword=false;
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] str=sentences[i].split(" ");
            int count=str.length;
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}