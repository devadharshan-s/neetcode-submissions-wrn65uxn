class LL{

    int val;
    LL next;

    public LL(int val){
        this.val = val;
        this.next = null;
    }
}

class MyHashSet {

    LL head;

    public MyHashSet() {
        head = new LL(0);
    }
    
    public void add(int key) {

        if(contains(key)) return;

        LL pointer = head;
        while(pointer.next != null) pointer = pointer.next;
        pointer.next = new LL(key);

        while(pointer != null){ 
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }
    
    public void remove(int key) {
        LL prev = head, next = null, pointer = head.next;

        while(pointer != null){
            next = pointer.next;
            if(pointer.val == key)
                break;
            prev = pointer;
            pointer = pointer.next;
        }

        if(prev != null) prev.next = next;

        // while(pointer != null){ 
        //     System.out.println(pointer.val);
        //     pointer = pointer.next;
        // }

    }
    
    public boolean contains(int key) {
        
        LL pointer = head.next;

        while(pointer != null){
            if(pointer.val == key) return true;
            pointer = pointer.next;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */