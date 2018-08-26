package com.algo.impl.lru.cache;

import java.util.HashMap;

public class LRUCache 
{
	private int actualSize;
    private HashMap<Integer, Node>map;
    private DoublyLinkedList doubleList;
    
    public LRUCache()
    {
    	this.map=new HashMap<Integer, Node>();
    	this.doubleList=new DoublyLinkedList();
    }
    
    public void put(int id,String data)
    {
    	if (map.containsKey(id))
    	{
    		Node node=this.map.get(id);
    		node.setData(data);
    		update(node);
    		return;
		}
    	Node node=new Node(id, data);
    	if (actualSize<Constants.CACHE_SIZE)
    	{
    		actualSize++;
			add(node);
		}
    	else
    	{
    		removeTail();
    		add(node);
    		
    	}   	
    }	
    public void add(Node node)
    {
    	node.setNext(this.doubleList.getHead());
    	//
    	node.setPrevious(null);
    	
    	if (this.doubleList.getHead()!=null) 
    	{
			this.doubleList.getHead().setPrevious(node);
		}
    	//Set head to new node
    	this.doubleList.setHead(node);
    	
    	//If only one node is there then set tail node
    	if (this.doubleList.getTail()==null)
    	{
			this.doubleList.setTail(node);
		}
    	
    	//put node into map
    	map.put(node.getId(), node);
    	
    }
    
    public void removeTail()
    {
    	Node lastNode=this.map.get(this.doubleList.getTail().getId());
    	
    	//previous node is tail node
    	this.doubleList.setTail(lastNode.getPrevious());
    	lastNode.setPrevious(null);
    	
    	//Remove tail node
    	if (this.doubleList.getTail()!=null)
    	{
    		this.doubleList.getTail().setNext(null);
		}
        //remove tails node
    	lastNode=null;    	
    }
    
    public Node get(int key)
    {
    	//if node does not exist
    	if (!this.map.containsKey(key))
    	{
			return null;
		}
    	Node node=this.map.get(key);
    	update(node);
    	return node;
    }
    
    public void update(Node node)
    {
    	//get next and previous node
    	Node nextNode=node.getNext();
    	Node previousNode=node.getPrevious();
    	
    	//if not head node
    	if (previousNode!=null)
    	{
    		previousNode.setNext(nextNode);
		}
    	else
    	{
    		//then it is next node
    		this.doubleList.setHead(nextNode);
    	}
    	
    	
    	//If next node 
    	if (nextNode!=null) 
    		nextNode.setPrevious(previousNode);
    	else
    		this.doubleList.setTail(previousNode);
    	
		add(node);	 	
    }
    
    public void show()
    {
    	Node actualNode=this.doubleList.getHead();
    	while (actualNode!=null)
    	{
			System.out.print(actualNode+"<->");
			actualNode=actualNode.getNext();
		}
    	
    }
    
}
