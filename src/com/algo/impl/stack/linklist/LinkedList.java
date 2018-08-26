package com.algo.impl.stack.linklist;

public class LinkedList<T extends Comparable<T>>
{
private Node<T> root;
private int itemCount;

public void push(T data)
{
	itemCount++;
	Node<T> node=new Node<>(data);
	if (root==null)
	{		
		root=node;
	}
	else
	{
		node.setNext(root);
		root=node;	
	}
}
public T pop()
{
	if (root==null)
	{
		return null;
	}
	else
	{
		itemCount--;
		T data=root.getData();
		root=root.getNext();
		return data;
	}
}
public boolean isEmpty()
{
	return root==null;
}
public int size()
{
	return itemCount;
}
}
