package com.learning.core.day4session7;

import java.util.Stack;

public class D04P091 {
	
	private int size;
	private String stack[];
	private int top;
	
	
	public D04P091(int size) {
		super();
		this.size = size;
		this.stack = new String[size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return(size-1==top);
	}
	
	public String peek() {
		if(isEmpty()) {
			System.out.println("Stac is Empty");
			return null;
			
		}
		else {
			return stack[top];
		}
	}
	//push element in stack
	public void push(String element) {
        if (isFull()) { 
            System.out.println("Stack Full");
            return;
        }
        stack[++top] = element; 
    }
	
	//pop element from stack
	public String pop() {
        if (isEmpty()) { 
            System.out.println("Stack Empty");
            return null; 
        }
        return stack[top--];
    }
	
	//display stack
	
	public void display() {
		
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println( " ");
    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D04P091 stack = new D04P091(5);
		System.out.println(stack.isEmpty());

       
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
        
        //push
        System.out.print("After Pushing 4 Elements: ");
        stack.display();
        
        //pop
        stack.pop();
        System.out.print("After a Pop: ") ;
        stack.display();
        
        System.out.println(stack.peek());
        
	}
	
	

}
