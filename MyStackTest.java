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
	@Test
	public void threeNumbersPeakedAndPoppedFromStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		INode popedNode = myStack.pop();
		Assert.assertEquals(peak, popedNode);
		myStack.printStack();
		INode peak1 = myStack.peak();
		INode popedNode1 = myStack.pop();
		Assert.assertEquals(peak1, popedNode1);
		myStack.printStack();
		INode peak3 = myStack.peak();
		INode popedNode2 = myStack.pop();
		Assert.assertEquals(peak3, popedNode2);
	}

}
