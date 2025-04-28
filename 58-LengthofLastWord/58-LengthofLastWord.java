// Last updated: 4/28/2025, 10:40:23 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String regex = "[,\\s\\.]";
        String[] arr = s.split(regex);
        String str = arr[arr.length-1];
        return str.length();
    }
}