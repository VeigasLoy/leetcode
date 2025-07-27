// Last updated: 7/27/2025, 3:01:47 PM
class CustomStack {
    ArrayList<Integer> al;
    int maxSize;
    public CustomStack(int maxSize) {
        al = new ArrayList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(al.size()<maxSize)
            al.add(x);
    }
    
    public int pop() {
        if(al.size()!=0)
            return al.remove(al.size()-1);
        return -1;
    }
    
    public void increment(int k, int val) {
        int i=0;
        while(i<k && i<al.size()){
            al.set(i,al.get(i)+val);
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */