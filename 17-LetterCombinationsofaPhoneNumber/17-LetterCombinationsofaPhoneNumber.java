// Last updated: 4/28/2025, 10:38:06 AM
class Solution {
    // public int pow(int num,int exp){
    //     int i=1;
    //     while(exp!=0){
    //         i *=num;
    //         exp--;
    //     }
    //     return i;
    // }
    public void back(String digits,int i,StringBuilder comb,List<String> ans, Map<Character, String> phone){
        if(i==digits.length()){
            ans.add(comb.toString());
            return;
        }
        String lett = phone.get(digits.charAt(i));
        for(char let: lett.toCharArray()){
            comb.append(let);
            back(digits,i+1,comb,ans,phone);
            comb.deleteCharAt(comb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)    return ans;
        HashMap<Character,String> phone = new HashMap<>();
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
        back(digits,0,new StringBuilder(),ans,phone);
        return ans;
    }
}