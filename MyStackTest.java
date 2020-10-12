package com.capgemini.assignment.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.assignment.linkedlist.INode;
import com.capgemini.assignment.linkedlist.MyNode;

import junit.framework.Assert;

class MyStackTest {

	@Test
	public void threeNumsPushedToStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(thirdNode, peak);
	}

}
