package com.linkedlist;


import org.junit.Assert;
import org.junit.Test;
import com.linkedlist.MyLinkedList;
import com.linkedlist.MyNode;

public class LinkedListTest {

	// UC1 TestCase
	@Test
	public void added_3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean res = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(res);
	}

	// UC2 TestCase
	@Test
	public void added_3NumbersAtTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.add(mySecondNode);
		lst.add(myThirdNode);
		boolean res = MyLinkedList.head.equals(myThirdNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(res);
	}

	// UC3 TestCase
	@Test
	public void added_3NumbersAtLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList lst = new MyLinkedList();
		lst.appendAfter(myFirstNode);
		lst.appendAfter(mySecondNode);
		lst.appendAfter(myThirdNode);
		boolean res = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(res);
	}

	// UC4 TestCase
	@Test
	public void added_3NumberInBetweenTheList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList lst = new MyLinkedList();
		lst.add(myFirstNode);
		lst.appendAfter(myThirdNode);
		lst.insertInBetween(myFirstNode, mySecondNode);
		boolean res = MyLinkedList.head.equals(myFirstNode) && MyLinkedList.head.getNext().equals(mySecondNode)
				&& MyLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(res);
	}

	// UC5 TestCase
	@Test
	public void deleted_FirstElemntFromLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList lst = new MyLinkedList();
		lst.appendAfter(myFirstNode);
		lst.appendAfter(mySecondNode);
		lst.appendAfter(myThirdNode);
		lst.delete();
		boolean res = MyLinkedList.head.equals(mySecondNode);
		Assert.assertTrue(res);
	}
}