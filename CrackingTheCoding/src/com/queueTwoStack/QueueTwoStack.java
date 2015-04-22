package com.queueTwoStack;

import java.util.Stack;

public class QueueTwoStack<E> {
	Object E = new Object();

	Stack<E> s1 = new Stack<E>();
	Stack<E> s2 = new Stack<E>();

	void enqueue(E obj) {
		s1.push(obj);
		System.out.println("Pushed object: " + obj);

	}
	public E dequeue() {
		if (s2.isEmpty()) {
			if (s1.isEmpty()) {
				return null;
			} else {
				while (!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			}
		}
		E popped = s2.pop();
		System.out.println("popped object:" + popped);
		return popped;
	}

}
