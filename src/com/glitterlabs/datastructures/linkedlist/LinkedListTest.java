package com.glitterlabs.datastructures.linkedlist;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase 
{

	protected void setUp() throws Exception 
	{
		super.setUp();
	}

	public void testLinkedList() 
	{
		LinkedList singly = new LinkedList();

		assertTrue(singly.isEmpty()); // linked list should be empty
		assertEquals(0, singly.length()); // length of linked list should be
											// zero

		singly.append("ABC");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(1, singly.length()); // length of linked list should be 1
		System.out.println(singly.length());

	}

}
