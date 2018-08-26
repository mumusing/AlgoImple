package com.balance.bstTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>
{

	private Node<T> root;
	@Override
	public void insert(T data)
	{
		if (root==null) 
		{
			root=new Node<T>(data);
		}
		else
		{
			insertNode(data,root);
		}
	}
	
	private void insertNode(T newData,Node<T>node)
	{
		if (newData.compareTo(node.getData())<0)
		{
			if (node.getLeft()!=null)
			{
				insertNode(newData,node.getLeft());
			}
			else
			{
				Node<T>newNode=new Node<T>(newData);
				node.setLeft(newNode);
			}
		}
		else
		{
            if (node.getRight()!=null) 
            {
            	insertNode(newData,node.getRight());
			}
            else
            {
				Node<T>newNode=new Node<T>(newData);
				node.setRight(newNode);
			}
		}	
	}
	
	
	
	
	
	
	@Override
	public T getMinValue()
	{
		if (root==null) 
		{
			return null;
		}
		return getMin(root);
	}
	@Override
	public T getMaxValue()
	{
		if (root==null)
		{
			return null;
		}
		return getMax(root);
	}
	
	@Override
	public void traverse() 
	{
		// TODO Auto-generated method stub
		if (root!=null) 
		{
			traverse(root);
		}	
	}
	private void traverse(Node<T> root)
	{
		if (root.getLeft()!=null)
		{
			traverse(root.getLeft());
		}
		System.out.print(root.getData()+"-->");
		if (root.getRight()!=null)
		{
			traverse(root.getRight());
		}
		
	}
	private Node<T> delete(Node<T>node,T data)
	{
		if (node==null) 
		{
		 return node;	
		}
		
		if (data.compareTo(node.getData())<0) 
		{
			node.setLeft(delete(node.getLeft(),data));
		}
		else if(data.compareTo(node.getData())>0)
		{
			node.setRight(delete(node.getRight(),data));
		}
		else
		{
			if ((node.getLeft()==null)&&(node.getRight()==null))
			{
				System.out.println("Deleting Leaf Node........");
				return  null;
			}
			if(node.getLeft()==null)
			{
				System.out.println("Removing the right child........");
				Node<T> temp=node.getRight();
				node=null;
				return temp;
			}
			else if(node.getRight()==null)
			{
				System.out.println("Removing the left child........");
				Node<T> temp=node.getLeft();
				node=null;
				return temp;
			}
			
			//This is to remove node with two children
			System.out.println("Removing predecessor node:");
			
			Node<T>predecessor=getPredecessor(node.getLeft());
			System.out.println(predecessor);
			node.setData(predecessor.getData());
			node.setLeft(delete(node.getLeft(),predecessor.getData()));
		}
		return node;
	}
	private Node<T> getPredecessor(Node<T>node)
	{
		if (node.getRight()!=null) 
		{
			getPredecessor(node.getRight());
		}
		return node;
	}
	
	@Override
	public Node<T> delete(T data)
	{
		// TODO Auto-generated method stub
		if (root!=null)
		{
			return delete(root, data);
		}
		return null;
		
		
		
		
	}
	
	public T getMax(Node<T> node) 
	{

		if (node.getRight()!=null) 
		{
		return	getMax(node.getRight());
		}
	    return node.getData();
	}
	
	public T getMin(Node<T> node)
	{
		if (node.getLeft()!=null) 
		{
		return	getMin(node.getLeft());
		}
	    return node.getData();
	}	
}
