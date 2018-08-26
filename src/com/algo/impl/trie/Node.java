package com.algo.impl.trie;

public class Node 
{
	private String character;
	private Node[] children;
	private boolean isLeaf;
	private boolean isVisited;
	private int value;

	public String getCharacter() 
	{
		return character;
	}

	public void setCharacter(String character)
	{
		this.character = character;
	}

	public Node[] getChildren()
	{
		return children;
	}

	public void setChildren(Node[] children)
	{
		this.children = children;
	}

	public boolean isLeaf() 
	{
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf)
	{
		this.isLeaf = isLeaf;
	}

	public boolean isVisited() 
	{
		return isVisited;
	}

	public void setVisited(boolean isVisited) 
	{
		this.isVisited = isVisited;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value) 
	{
		this.value = value;
	}

	public Node(String character)
	{
		this.character = character;
		children = new Node[Constant.SIZE];
	}

	public void setChild(int index, Node node) 
	{
		this.children[index] = node;
	}

	public void setChild(int index, Node node,int value) 
	{
		node.setValue(value);
		this.children[index] = node;
	}
	public Node getChild(int index) 
	{
		// TODO Auto-generated method stub
		return this.children[index];
	}

}
