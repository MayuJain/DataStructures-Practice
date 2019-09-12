package linkedList;

public class LinkedList {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next = null;
		}

	}
	
	void printMe(Node head){
		
		while(head != null) {
			System.out.println(head.data + "");
			head=head.next;
		}
		
	}
	
	void printReverse(Node head) {
		
		if(head == null)return;
		
		printReverse(head.next);
		
		System.out.println(head.data);
	}
	
	Node reverseList(Node head) {
		
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		current = prev;
		return current;
	}
	
	void findMiddle(LinkedList l){
		
		Node fastNode = head;
		Node slowNode = head;
		
		while(fastNode != null && fastNode.next != null) {
			
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		System.out.println(slowNode.data + "middle number");
		
		
		
	}

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		Node head = new Node(7);
		Node second = new Node(8);
		Node third = new Node(9);
		
		ll.head=head;
		head.next = second;
		second.next = third;
		
		ll.printMe(head);
		
		ll.findMiddle(ll);
		
		ll.printReverse(head);
		
		head = ll.reverseList(head);
		ll.printMe(head);
		
		
	}


}


