package com.capgemini.assignment.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class MyLinkedListTest {

	@Test
	public void given3NumsShouldBeAddedFromTopOfLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		System.out.println("Adding from Top Linked List : ");
		myLinkedList.printMyNodes();
		boolean check = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(check);
		
	}
	@Test
	public void given3NumsShouldBeAppendedFromLastOfLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		System.out.println("Appending from Last Linked List");
		myLinkedList.printMyNodes();
		boolean check = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(check);
	}
	
	@Test
	public void given3NumsInsertingSecondNumInLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode,secondNode);
		System.out.println("Inserting Node in Linked List");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void deletingFirstElementInLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		INode popNode = myLinkedList.pop();
		System.out.println("Linked List After Deleting First Node");
		myLinkedList.printMyNodes();
		Assert.assertEquals(firstNode, popNode);
	}
	
	@Test
	public void deletingLastElementInLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		INode popNode = myLinkedList.popLast();
		System.out.println("Linked List After Deleting Last Node");
		myLinkedList.printMyNodes();
		Assert.assertEquals(thirdNode, popNode);
	}
	@Test
	public void searchElementinLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		INode<Integer> search =  myLinkedList.search(30);
		assertEquals(secondNode, search);
	}
	
	@Test
	public void searchAndInsertElementInLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		INode<Integer> search =  myLinkedList.search(30);
		myLinkedList.insert(search,fourthNode);
		System.out.println("Linked List after 4th Node Search and Insertion");
		myLinkedList.printMyNodes();
		boolean check = myLinkedList.search(30).equals(secondNode) &&
						secondNode.getNext().equals(fourthNode);
		assertTrue(check);
	}
	
	@Test
	public void searchAndDeleteElementInLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthNode);
		INode<Integer> search =  myLinkedList.search(40);
		INode delete = myLinkedList.deleteAtPosition(search);
		System.out.println("Linked List after 3rd Node Search and Delete");
		myLinkedList.printMyNodes();
		boolean check = secondNode.getNext().equals(fourthNode) && delete.equals(thirdNode) && 
						myLinkedList.size()==3;
		assertTrue(check);
	}

}
