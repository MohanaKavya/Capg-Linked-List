package com.capgemini.assignment.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyOrderedLinkedListTest {

	@Test
	public void sortListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		MyOrderedLinkedList myOrderedLinkedList = new MyOrderedLinkedList();
		myOrderedLinkedList.add(firstNode);
		myOrderedLinkedList.add(secondNode);
		myOrderedLinkedList.add(thirdNode);
		myOrderedLinkedList.add(fourthNode);
		myOrderedLinkedList.printMyNodes();
		boolean check = secondNode.getNext().equals(thirdNode) && thirdNode.getNext().equals(firstNode) &&
						firstNode.getNext().equals(fourthNode);
		Assert.assertTrue(check);

	}

}
