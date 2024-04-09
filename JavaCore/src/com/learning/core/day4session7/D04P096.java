package com.learning.core.day4session7;

public class D04P096 {
	
	private int[] queue;
    private int front, rear, size;

    public D04P096(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = data;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        } else if (front == rear) {
            System.out.println("Removed element: " + queue[front]);
            front = rear = -1;
        } else {
            System.out.println("Removed element: " + queue[front]);
            front = (front + 1) % size;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        System.out.print("Elements in circular queue: ");
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D04P096 cq = new D04P096(5);
        cq.enqueue(14);
        cq.enqueue(13);
        cq.enqueue(22);
        cq.enqueue(-8);

        cq.display();

        cq.dequeue();

        cq.display();
	}

}
