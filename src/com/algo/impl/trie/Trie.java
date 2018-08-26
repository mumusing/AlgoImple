package com.algo.impl.trie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trie
{
private Node root;
private int indexOfSingleChild;

public Trie()
{
	root=new Node("");
}

public void insert(String word)
{
	Node temp=root;
	
	for (int i = 0; i < word.length(); i++) 
	{
		char character=word.charAt(i);
		int index=character-'a';
		if (temp.getChild(index)==null)
		{
			Node node=new Node(String.valueOf(character));
			temp.setChild(index, node);
			temp=node;
		}
		else
		{
			temp=temp.getChild(index);
		}
		
	}
	temp.setVisited(true);
}
public void insert(String key,int value)
{
	Node tempNode=root;
	for (int i = 0; i < key.length(); i++)
	{
		char character=key.charAt(i);
		int index=character-'a';
		if (tempNode.getChild(index)==null)
		{
			Node node=new Node(String.valueOf(character));
			tempNode.setChild(index, node,value);
			tempNode=node;			
		}
		else
		{
			tempNode=tempNode.getChild(index);
		}		
	}
	tempNode.setLeaf(true);
	
	
}
public boolean search(String word)
{
	Node tempNode=root;
	for (int i = 0; i < word.length(); i++)
	{
		char character=word.charAt(i);
		
		int index=character-'a';
		if (tempNode.getChild(index)==null)
		{
			return false;
		}
		else
		{
			tempNode=tempNode.getChild(index);
		}	
	}
	if (!tempNode.isLeaf())
	{
		return false;
	}
	return true;
	
}

public Integer searchAsMap(String key)
{
	Node tempNode=root;
	for (int i = 0; i < key.length(); i++)
	{
		char character=key.charAt(i);
		int index=character-'a';
		if (tempNode.getChild(index)!=null)
		{
			tempNode=tempNode.getChild(index);
		}
		else
		{
			return null;
		}		
	}	
	return tempNode.getValue();	
}
public List<String> autoComplete(String prefix)
{
	Node prefixNode=root;
	List<String>autoCompleteWord=new ArrayList<String>();
	for (int i = 0; i < prefix.length(); i++)
	{
		char character=prefix.charAt(i);
		int index=character-'a';
		prefixNode=prefixNode.getChild(index);		
	}
	collectWords(prefixNode,prefix,autoCompleteWord);
	return autoCompleteWord;
}

private void collectWords(Node prefixNode, String prefix, List<String> autoCompleteWord) 
{
	// TODO Auto-generated method stub
	if (prefixNode==null)
	{
		return ;
	}
	if (prefixNode.isLeaf()) 
	{
		autoCompleteWord.add(prefix);
	}
	for (Node child : prefixNode.getChildren()) 
	{
		if (child==null) continue;
		String character=child.getCharacter();
		collectWords(child,prefix+character,autoCompleteWord);
	}
	
}
public String longestCommonPrefix()
{
	Node tempNode=root;
	String commPrefix="";
	while (countChildren(tempNode)==1 && !tempNode.isLeaf())
	{
		tempNode=tempNode.getChild(indexOfSingleChild);
		commPrefix=commPrefix+String.valueOf((char)(indexOfSingleChild+'a'));	
	}
	
	return commPrefix;
}

private int countChildren(Node tempNode)
{
	// TODO Auto-generated method stub
	int numOfChildren=0;
	for (int i = 0; i < tempNode.getChildren().length; i++) 
	{
		if (tempNode.getChild(i)!=null)
		{
			numOfChildren++;
			indexOfSingleChild=i;
		}
	}
	
	return numOfChildren;
}


}
