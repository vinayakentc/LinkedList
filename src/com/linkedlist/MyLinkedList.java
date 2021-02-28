package com.linkedlist;

public class MyLinkedList<K> {
	public static INode head;
	public static INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// UC2
	public void add(INode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// UC3
	public void appendAfter(INode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// UC4
	public void insertInBetween(INode<K> myNode, INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// UC5
	public INode<K> delete() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	// UC6
	public INode<K> deleteFromLast() {
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	// UC7
	public INode<K> searchNode(INode<K> targetNode) {
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(targetNode)) {
			tempNode = tempNode.getNext();
		}
		return targetNode;
	}

	// UC8
	public void searchAndInsertValue(INode<K> targetNode, INode<K> newNode) {
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(targetNode)) {
			tempNode = tempNode.getNext();
		}
		INode<K> tempNode1 = targetNode.getNext();
		targetNode.setNext(newNode);
		newNode.setNext(tempNode1);
	}

	// UC9
	public INode<K> deleteNodeFromInBetweenTheList(INode<K> targetNode) {
		INode firstNode = this.head;
		INode tempNode = this.head;
		while (tempNode != targetNode) {
			tempNode = tempNode.getNext();
		}
		this.head = tempNode;
		delete();
		INode LastNode = this.head;
		this.head = firstNode;
		INode tempNode1 = this.head;
		while (tempNode1.getNext() != targetNode) {
			tempNode1 = tempNode1.getNext();
		}
		tempNode1.setNext(LastNode);
		return this.head;
	}

	// Calculate List Size
	public int listSize() {
		int size = 0;
		if (this.head == null)
			return size;
		else
			size = 1;
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}
}