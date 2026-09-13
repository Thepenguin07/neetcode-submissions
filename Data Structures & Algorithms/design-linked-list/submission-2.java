class MyLinkedList {
    LinkedList<Integer> t;
    public MyLinkedList() {
        t=new LinkedList<>();
    }
    
    public int get(int index) {
        if(index>=t.size())return -1;
      return  t.get(index);
    }
    
    public void addAtHead(int val) {
        t.addFirst(val);
    }
    
    public void addAtTail(int val) {
        t.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
        t.add(index, val);
    }
    
    public void deleteAtIndex(int index) {
           if(index>=t.size())return;
        t.remove(index);
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