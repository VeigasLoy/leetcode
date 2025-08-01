// Last updated: 8/1/2025, 6:56:46 PM
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num<20){
            return (num%2==0||num==11)?true:false;
        }
        for(int i=10;i<=50000;i++){
            StringBuilder no = new StringBuilder(String.valueOf(i));
            StringBuilder rev = new StringBuilder(String.valueOf(i)).reverse();
            // System.out.println(no+" "+rev);
            if(num==Integer.parseInt(no.toString(),10)+Integer.parseInt(rev.toString(),10))
                return true;
        }
        return false;
    }
}


