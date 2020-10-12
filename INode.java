package com.capgemini.assignment.linkedlist;

public interface INode<T extends Comparable<T>> {

	void setNext(INode<T> myNode);
	
	INode<T> getNext();
		
	T getKey();
	
	void setKey(T key);

}
