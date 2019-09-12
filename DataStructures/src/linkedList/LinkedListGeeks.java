package linkedList;

class LinkedListGeeks {
    Node head;
    /** Initialize your data structure here. */
    public LinkedListGeeks() {
        
    }
    
    class Node{
        int val;
        Node next;
        Node(int d){
            val = d;
            next = null;
        }
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        if( index == 0){
            return head.val;
        }
        
        if( head == null && index == 0){
            return -1;
        }
        
        int count = -1;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == index){
                return temp.val;
            }
            temp = temp.next; 
        }
        
        if(count < index){
            return -1;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node n = new Node(val);
        if(head == null) {
        	head = n;
        }else {
        	 n.next = head; 
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node n = new Node(val);
        Node temp = head;
        Node prev = null;
        while(temp != null){
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = n;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node n = new Node(val);
        
        if(index == 0){
            addAtHead(val);
        }
        
        Node temp = head.next;
        Node prev = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == index){
                n.next = prev.next;
                prev.next = n;
            }
            prev = temp;
            temp = temp.next;  
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        if( index == 0){
            head = head.next;
        }
        Node temp = head;
        Node prev = null;
        int count = -1 ;
        while(temp != null){
            count++;
            if( count == index){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            
        }
    }
    
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.val+" "); 
            tnode = tnode.next; 
        } 
    } 
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Your MyLinkedList object will be instantiated and called as such:
    	 LinkedListGeeks linkedList = new LinkedListGeeks();
    	 linkedList.addAtHead(1);
    	 linkedList.addAtTail(3);
    	 linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
    	 int res1 = linkedList.get(1);           
    	 System.out.println(res1);       // returns 2
    	 linkedList.deleteAtIndex(1);  // now the linked list is 1->3
    	 int res2 = linkedList.get(1);  
    	 System.out.println(res2);      // returns 3
    	 linkedList.printList();
}
}


