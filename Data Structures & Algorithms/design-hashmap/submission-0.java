class LL {

    int key;
    int val;
    LL next;

    public LL(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
    }
}

class MyHashMap {

    LL[] set;

    int size = 0;

    public MyHashMap() {
        this.size = 1000000;
        this.set = new LL[size];    
    }
    
    public void put(int key, int value) {
        int idx = key % size;
        // If the idx isnt initalized...
        if(set[idx] == null){ 
            set[idx] = new LL(-1,-1);
        }

        LL head = set[idx];
        
        while(head.next != null){ 
            if(head.key == key){
                head.val = value;
                return;
            }
            head = head.next;
        }

        if(head.key == key){
            head.val = value;
            return;
        }

        head.next = new LL(key,value);
            
    }
    
    public int get(int key) {
        int idx = key % size;

        if(set[idx] == null) return -1;

        LL head = set[idx].next;

        while(head != null){
            if(head.key == key) return head.val;
            head = head.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        
        int idx = key % size;

        if(set[idx] == null) return;

        LL head = set[idx].next, prev = set[idx], next = null;

        while(head != null){
            next = head.next;
            if(head.key == key) break;
            prev = head;
            head = head.next;
        }

        prev.next = next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */