// Last updated: 7/21/2025, 12:19:45 PM
class Solution {
    static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Character, Integer> hm = sortByValue(map);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> en : hm.entrySet()) {
            char key = en.getKey();
            int value = en.getValue();
            while(value-->0){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}