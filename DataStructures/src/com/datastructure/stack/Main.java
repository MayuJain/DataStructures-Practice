package com.datastructure.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack myStack=new Stack(5);
		System.out.println(myStack.isEmpty());
		myStack.push(1);
		System.out.println(myStack.isEmpty());
		myStack.push(2);
		myStack.printStack();
		System.out.println("top element"+myStack.top());
		myStack.push(3);
		System.out.println(myStack.pop());
		myStack.push(4);
		System.out.println(myStack.top());
		myStack.push(5);
		System.out.println(myStack.top());
		myStack.push(6);
		System.out.println(myStack.top());
		myStack.printStack();
	}

}
