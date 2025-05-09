// Last updated: 4/28/2025, 10:37:50 AM
class MyLinkedList {
    List<Integer> al;
    public MyLinkedList() {
        al = new LinkedList<>();
    }
    
    public int get(int index) {
        if(index < 0 || index >= al.size()) return -1;
        return al.get(index);
    }
    
    public void addAtHead(int val) {
        al.add(0,val);
    }
    
    public void addAtTail(int val) {
        al.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>al.size())    return ;
        al.add(index,val);
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||al.isEmpty()||index>=al.size()) return;
        al.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */