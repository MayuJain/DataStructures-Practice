package com.datastructure.stack;

public class Stack {
	
	private int maxSize;
	private int top;
	int arr[];
	
	public Stack(int size) {
		this.maxSize=size;
		arr=new int[maxSize];
		top=0;
	}
	
	public void push(int newObject) {
		
		if(top<maxSize) {
			arr[top]=newObject;
			top=top+1;
		}else {
			System.out.println("Stack overflow!!");
		}
		
	}
	 
	public Object pop() {
		
		if(!this.isEmpty()){
			int temp=arr[top];
			top=top-1;
			return temp;
		}else {
			return null;
		}
		
	}
	
	public boolean isEmpty() {
		
		if(top==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public Object top() {
		
		if(!this.isEmpty()) {
			return arr[top-1];
		}else {
			return "Stack is empty";
		}
		
	}
	
	public void printStack() {
		
		for(int i=0;i<maxSize;i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
