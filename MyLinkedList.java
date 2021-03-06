package com.capgemini.assignment.linkedlist;

public class MyLinkedList<T> {

	public INode head;
	public INode tail;
	public int size;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if(this.tail == null)
			this.tail = newNode;
		if(this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}	
	}
	public void append(INode newNode) {
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			tail.setNext(newNode);
			this.tail = newNode;
		}	
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("All Nodes : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) 
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	public INode popLast() {
		INode tempNode =head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		tail.setNext(null);
		return tempNode;
	}

	public INode search(T key) {
		INode tempNode=head;
		while(tempNode!=null && tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			else {
				tempNode=tempNode.getNext();
			}
		}
		return null;
	}

	public INode deleteAtPosition(INode search) {
		INode tempNode =head;
		while(tempNode!=null && !tempNode.getNext().equals(search)) {
			tempNode=tempNode.getNext();
		}
		tempNode.setNext(search.getNext());
		return search;
	}
	
	public int size() {
		INode n = head;
		while (n != null) {
			size++;
			n = n.getNext();
		}
		return size;
	}

}
