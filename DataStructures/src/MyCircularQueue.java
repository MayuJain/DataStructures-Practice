class MyCircularQueue {
    
    int head=0;
    int capacity;
    int size=0;
    int tail=0;
    int[] myArray;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
    	capacity=k;
       myArray = new int[k];
       tail=k-1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	
    	if(this.isFull()) {
    		return false;
    	}
        
    	this.tail=(this.tail+1)%this.capacity;
    	myArray[this.tail]=value;
    	size=size+1;
    	return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
		
    	if(this.isEmpty()) {
    		return false;
    	}
        
    	this.head = (this.head+1)%capacity;
    	size=size-1;
    	return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	if(this.isEmpty()) {
    		return Integer.MIN_VALUE;
    	}
        return myArray[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if(this.isEmpty()) {
    		return Integer.MIN_VALUE;
    	}
     return myArray[tail];   
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
       return size==0;
        
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
		return size==capacity;
        
    }


public static void main(String args[]) {
	
	  //Your MyCircularQueue object will be instantiated and called as such:
	  MyCircularQueue obj = new MyCircularQueue(3);
	 boolean param_1 = obj.enQueue(1);
	 boolean empty = obj.isEmpty();
	 boolean param_2 = obj.enQueue(2);
	 boolean param_3 = obj.enQueue(3);
	 boolean param_4 = obj.enQueue(4);
	 int param_5 = obj.Rear();
	 boolean param_6 = obj.deQueue();
	 boolean param_7 = obj.enQueue(4);
	 int param_8 = obj.Rear();
	 System.out.println(param_1);
	 System.out.println(empty);
	 System.out.println(param_2);
	 System.out.println(param_3);
	 System.out.println(param_4);
	 System.out.println(param_5);
	 System.out.println(param_6);
	 System.out.println(param_7);
	 System.out.println(param_8);	 
	
}
}