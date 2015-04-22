package com.queueTwoStack;

public class AppQueueTwoStack {

	public static void main(String[] args) {
		QueueTwoStack<Integer> qs  = new QueueTwoStack<Integer>();
		qs.enqueue(2);
		qs.enqueue(4);
		while(qs.dequeue() != null){
		qs.dequeue();
	}
	}
}
