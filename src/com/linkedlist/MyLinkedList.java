package com.linkedlist;

publpublic class MyLinkedList<K> {
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
}