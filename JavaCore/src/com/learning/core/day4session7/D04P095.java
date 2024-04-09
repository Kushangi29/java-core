package com.learning.core.day4session7;

public class D04P095 {
	
	private Node1 front, rear;

    public D04P095() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node1 newNode = new Node1(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null)
            return;
        Node1 temp = front;
        front = front.next;
        if (front == null)
            rear = null;
        System.out.println("Removed element: " + temp.data);
    }

    public void display() {
        Node1 current = front;
        System.out.print("Elements in queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D04P095 queue = new D04P095();
		queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
	}

}
