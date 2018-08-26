package com.algo.impl.avlTree;

public class AvlTree  implements Tree
{
    private Node root;
    /*
     * (non-Javadoc)
     * @see com.algo.impl.avlTree.Tree#insert(int)
     */
	@Override
	public void insert(int data)
	{
		// TODO Auto-generated method stub
		
		
		root=insert(root,data);
	}

	private Node insert(Node node, int data)
	{
		if (node==null)
		{
			return new Node(data);
		}
		if (data<node.getData())	
		{
			node.setLeft(insert(node.getLeft(), data));
		}
		else
		{
			node.setRight(insert(node.getRight(), data));
		}
		node.setHeight(Math.max(Height(node.getLeft()), Height(node.getRight()))+1);
		
		node=checkViolation(node,data);
		
		return node;
	}

	private Node checkViolation(Node node, int data)
	{
		// TODO Auto-generated method stub
		int balance=balance(node);
		//Right rotation
		if (balance>1&&data<node.getLeft().getData()) 
		{
			return rightRotation(node);
		}
		
		// Left rotation
		if (balance < -1 && data > node.getRight().getData()) 
		{
			return leftRotation(node);
		}
		
		//Left Right Rotation
		if (balance>1&&data>node.getLeft().getData())
		{
			node.setLeft(leftRotation(node.getLeft()));
			return rightRotation(node);
		}
		
		// Right Left Rotation
		if (balance <- 1 && data < node.getRight().getData()) 
		{
			node.setRight(rightRotation(node.getRight()));
			return leftRotation(node);
		}
		
		
		return node;
	}

	@Override
	public void remove()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverse()
	{
		// TODO Auto-generated method stub
		if (root==null)
		{
			return;
		}
		inOrderTraversal(root);
	}

	public int Height(Node node)
	{
		if (node==null)
		{
			return -1;
		}
		return node.getHeight();
	}
	public int balance(Node node)
	{
		if (node==null)
		{
			return 0;
		}
		return Height(node.getLeft())-Height(node.getRight());
	}
	/*
	 * This method do right rotation
	 */
	
	public Node rightRotation(Node node)
	{
		System.out.println("Rotating to right on Node.............."+node);
		Node tempLeft=node.getLeft();
		Node t=tempLeft.getRight();
		
		tempLeft.setRight(node);
		node.setLeft(t);
		
		node.setHeight(Height(node.getLeft())-Height(node.getRight())+1);
		tempLeft.setHeight(Height(tempLeft.getLeft())-Height(tempLeft.getRight())+1);
		
		return tempLeft;
	}
	/*
	 * Rotate Left 
	 */
	public Node leftRotation(Node node)
	{
		System.out.println("Rotatin to the left on Node..............."+node);
		Node tempRight=node.getRight();
		Node t=tempRight.getLeft();
		
		tempRight.setLeft(node);
		node.setRight(t);
		
		node.setHeight(Height(node.getLeft())-Height(node.getRight())+1);
		tempRight.setHeight(Height(tempRight.getLeft())-Height(tempRight.getRight())+1);
        return tempRight;
		
		
	}
	
	
	/*
	 * Traverse the inorder traversal
	 */
	private void inOrderTraversal(Node node) 
	{
		// TODO Auto-generated method stub
		 if (node.getLeft()!=null) 
		 {
			inOrderTraversal(node.getLeft());
		 }
		 System.out.println(node);
		 if (node.getRight()!=null)
		 {
			 inOrderTraversal(node.getRight());
		 }
	}
    
	
	
	
	
	
}
