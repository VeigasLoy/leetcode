// Last updated: 8/7/2025, 9:12:38 PM
import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = digits.length - 1;
        int carry = 1;
        
        while (n >= 0) {
            int sum = digits[n] + carry;
            al.add(0, sum % 10);  
            carry = sum / 10; 
            n--;
        }
        if(carry>0){
            al.add(0, carry);
        }
        int[] result = new int[al.size()];
        for(int i=0;i<al.size();i++){
            result[i] = al.get(i);
        }
        return result;
    }
}