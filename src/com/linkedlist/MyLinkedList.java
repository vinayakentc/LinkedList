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
}