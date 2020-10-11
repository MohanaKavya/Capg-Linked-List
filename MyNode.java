package com.capgemini.assignment.linkedlist;

public class MyNode<T> {

	private T key;
	private MyNode next;

	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}

	public void setNext(MyNode<T> myNode) {
		this.next = myNode;
	}

	public MyNode<T> getNext() {
		return this.next;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

}
