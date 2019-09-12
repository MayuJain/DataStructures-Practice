package com.datastructure.NodeChain;

public class NodeChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeChain nl=new NodeChain();
	
	/* creating first node */
	Node head=new Node(7);
	
	/* creating second node */
	Node second=new Node(10);
	
	/* creating third node */
	Node third=new Node(20);
	
	/* creating fourth node */
	Node fourth=new Node(30);
	
	System.out.println("printing head:"+ head.getData());
	
	/* Linking the two nodes */
	head.setNextNode(second);
	second.setNextNode(third);
	third.setNextNode(fourth);
	
	/* printing the list*/
	nl.printNode(head);
	
		
}

	public void printNode(Node n) {
		
		while (n!=null) {
			System.out.println("printing head:value:"+ n.getData()+";"+"nextnode:"+n.getNextNode());
		n=n.getNextNode();
	}

}
}