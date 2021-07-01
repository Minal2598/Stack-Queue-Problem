package com.stackqueue;

public class Queue {
	Node front;
	Node rear;

	int length;

	class Node{
		int data;
		Node next;
		public Node(int data) {

			this.data = data;
			this.next = null;
		}

	}
    //add data into the Queue
	public void enQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		}
		else {
			rear.next = new Node(data);
			rear = rear.next;
		}

		length ++;

	}
		//Print Method
	public void print() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
	}
		//Delete Data From Queue
	public void deQueue() {
		if (front != null) {
			int temp = front.data;
			front = front.next;
			length--;
			return;
		}
		
}
}
