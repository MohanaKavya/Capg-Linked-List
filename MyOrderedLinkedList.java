package com.capgemini.assignment.linkedlist;

public class MyOrderedLinkedList {

	public MyLinkedList myLinkedList;
	

	public MyOrderedLinkedList() {
		myLinkedList = new MyLinkedList<>();
	}

	public <T extends Comparable<T>> void add(INode newNode) {
		if(myLinkedList.head==null)
			myLinkedList.add(newNode);
		else if(myLinkedList.head!=null && myLinkedList.tail!=null){
			int compareHead = myLinkedList.head.getKey().compareTo(newNode.getKey());
			int compareTail = myLinkedList.tail.getKey().compareTo(newNode.getKey());
			if(compareHead==1) 
				myLinkedList.add(newNode);
			if(compareTail==-1)
				myLinkedList.append(newNode);
			else
				compare(myLinkedList.head, newNode);			
		}
	}

	public void compare(INode tempCode, INode newNode) {
		while(tempCode.getNext()!=null) {
			int compare = tempCode.getNext().getKey().compareTo(newNode.getKey());
			if(compare==-1)
				compare(tempCode.getNext(), newNode);
			else if(compare==1)
				myLinkedList.insert(tempCode, newNode);				
		}
	}

	public void printMyNodes() {
		myLinkedList.printMyNodes();
	}

}
