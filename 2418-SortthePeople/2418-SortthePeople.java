// Last updated: 7/21/2025, 11:07:27 AM
class Person{
        int height;
        String name;
        Person(int h, String n){
            height=h;
            name=n;
        }
    }
class Solution {
 
    public String[] sortPeople(String[] names, int[] heights) {
            Person[] persons = new Person[names.length];
            for(int i=0;i<names.length;i++)
                persons[i] = new Person(heights[i],names[i]);
            Arrays.sort(persons,(p1,p2)->p2.height-p1.height);
            String[] res = new String[names.length];
            int i=0;
            for(Person p: persons){
                res[i++]=p.name;
            }
            return res;
        }
    }
