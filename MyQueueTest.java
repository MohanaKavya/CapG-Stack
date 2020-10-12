package com.capgemini.assignment.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.assignment.linkedlist.INode;
import com.capgemini.assignment.linkedlist.MyNode;

import junit.framework.Assert;

class MyQueueTest {

	@Test
	public void threeNumbersAddedToQueueTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		Assert.assertEquals((int) firstNode.getKey(), 56);
	}
	@Test
	public void threeNumbersDeletedFromStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		INode popedNode = myQueue.dequeue();
		Assert.assertEquals(firstNode, popedNode);
		myQueue.printQueue();
		INode popedNode1 = myQueue.dequeue();
		Assert.assertEquals(secondNode, popedNode1);
		myQueue.printQueue();
		INode popedNode2 = myQueue.dequeue();
		Assert.assertEquals(thirdNode, popedNode2);
	}
}
