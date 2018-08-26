package com.algo.impl.lru.cache;

public class DoublyLinkedList 
{
	private Node head;
	private Node Tail;

	public Node getHead()
	{
		return head;
	}

	public void setHead(Node head)
	{
		this.head = head;
	}

	public Node getTail()
	{
		return Tail;
	}

	public void setTail(Node tail) 
	{
		Tail = tail;
	}
}
