package com.capgemini.assignment.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class MyNodeTest {

	@Test
	public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean check = firstNode.getNext()==secondNode && 
						secondNode.getNext()==thirdNode;
		Assert.assertTrue(check);
	}
}
