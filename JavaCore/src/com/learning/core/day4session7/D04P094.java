package com.learning.core.day4session7;

public class D04P094 {
	
	 private int maxSize;
	    private int[] queueArray;
	    private int front;
	    private int rear;
	    private int nItems;

	    public D04P094(int size) {
	        maxSize = size;
	        queueArray = new int[maxSize];
	        front = 0;
	        rear = -1;
	        nItems = 0;
	    }
	    
	    public boolean isEmpty() {
	        return (nItems == 0);
	    }

	    public boolean isFull() {
	        return (nItems == maxSize);
	    }

	    public void enqueue(int item) {
	        if (rear == maxSize - 1) {
	            rear = -1;
	        }
	        queueArray[++rear] = item;
	        nItems++;
	    }

	    public int dequeue() {
	        int temp = queueArray[front++];
	        if (front == maxSize) {
	            front = 0;
	        }
	        nItems--;
	        return temp;
	    }

	    

	    public void display() {
	        int current = front;
	        System.out.print("Elements in queue: ");
	        for (int i = 0; i < nItems; i++) {
	            System.out.print(queueArray[current++] + " ");
	            if (current == maxSize) {
	                current = 0;
	            }
	        }
	        System.out.println();
	    }  
	  public static void main(String[] args)   
	  {  
		  D04P094 queue = new D04P094(10);  
		  queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        
	        queue.display();
	        
	        System.out.println("Element Removed:"+ queue.dequeue());
	        
	        queue.display();
	  }  

}
