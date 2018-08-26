package com.algo.impl.ternary;

public class Ternary
{
    private Node rootNode;
    
	public void put(String key,int value)
	{
		rootNode=put(rootNode,key,value,0);
	}

	private Node put(Node node, String key, int value, int index)
	{
		// TODO Auto-generated method stub
		char character=key.charAt(index);
		if (node==null)
		{
			node=new Node(character);
		}
		
		if (character<node.getCharacter())
		{
			node.setLeftNode(put(node.getLeftNode(), key, value, index));
		}
		else if(character>node.getCharacter())
		{
			node.setRightNode(put(node.getRightNode(), key, value, index));
		}
		else if(index<key.length()-1)
		{
			node.setMiddleNode(put(node.getMiddleNode(), key, value, index+1));
		}
		else
		{
			node.setValue(value);
		}
		return node;
	}
	public Integer get(String key)
	{
		Node node=get(rootNode,key,0);
		if (node==null)
		{
			return null;
		}
		return node.getValue();
	}

	private Node get(Node node, String key, int index) 
	{
		// TODO Auto-generated method stub
		if (node==null) 
		{
			return null;
		}
		char character=key.charAt(index);
		
		if (character<node.getCharacter())
		{
			return get(node.getLeftNode(),key,index);
		}
		else if (character>node.getCharacter()) 
		{
			return get(node.getRightNode(),key , index);
		}
		else if(index<key.length()-1)
		{
			return get(node.getMiddleNode(), key, index+1);
		}
		else
		{
			return node;
		}
	}
	
}
