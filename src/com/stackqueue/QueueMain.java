package com.stackqueue;

public class QueueMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem....!!!");
		
		Queue queue = new Queue();
	
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		

		queue.print();
	}
}
