package com.capgemini.assignment.linkedlist;

public class MyNode<T> implements INode<T> {

	private T key;
	private INode<T> next;

	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}
	
	@Override
	public void setNext(INode<T> next) {
		this.next = next;
	}
	@Override
	public INode<T> getNext() {
		return this.next;
	}
	@Override
	public T getKey() {
		return key;
	}
	@Override
	public void setKey(T key) {
		this.key = key;
	}

}
