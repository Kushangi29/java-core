package com.learning.core.day4session7;

public class D04P092 {
	
	Node head;
	


	public D04P092() {
		
		head = null;
	}

	public boolean isEmpty() {
		return(head==null);
	}
	
	public void push(double data) {
		Node extraNode = head;
		head= new Node();
		head.value=data;
		head.next = extraNode;
		
	}
	
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			double topValue = head.value;
			head = head.next;
			return topValue;
		}
	}
	
	public double peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			return head.value;
		}
	}
	
	public void display() {
        Node current = head;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D04P092 stack = new D04P092();
		System.out.println(stack.isEmpty());
		stack.push(10.0);
		stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);
        
        stack.display();
		
        double poppedItem1 = stack.pop();
        double poppedItem2 = stack.pop();
        System.out.print("After popping twice: ");
        System.out.println(poppedItem2 + " " + poppedItem1 + " null");

	}

}
