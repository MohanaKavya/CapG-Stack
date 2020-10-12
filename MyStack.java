package com.capgemini.assignment.stack;

import com.capgemini.assignment.linkedlist.INode;
import com.capgemini.assignment.linkedlist.MyLinkedList;
import com.capgemini.assignment.linkedlist.MyNode;

public class MyStack<T> {
	private MyLinkedList<T> myLinkedList;
	public MyStack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode peak() {
		return myLinkedList.head;
	}
	public INode pop() {
		return myLinkedList.pop();
	}

}
