package com.capgemini.assignment.stack;

import com.capgemini.assignment.linkedlist.INode;
import com.capgemini.assignment.linkedlist.MyLinkedList;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}

	public void enqueu(INode newNode) {
		myLinkedList.append(newNode);
	}
	public INode dequeue() {
		return myLinkedList.pop();
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}

}
