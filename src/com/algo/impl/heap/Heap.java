package com.algo.impl.heap;

public class Heap 
{
private Integer[] heap;
private int currentPosition=-1;
public Heap(int size)
{
	this.heap=new Integer[size];
}

public void insert(int data)
{
	if (isFull())
	{
		throw new RuntimeException("Heap is Full");
	}
	heap[++currentPosition]=data;	
	fix(currentPosition);	
}

public void fix(int index)
{
	int parent=(index-1)/2;
	while (parent>=0&&heap[parent]<heap[index]) 
	{
		int temp=heap[parent];
		heap[parent]=heap[index];
		heap[index]=temp;
		index=parent;
		parent=(index-1)/2;
	}
}

public int getMax()
{
	if (this.currentPosition==-1)	
	{
		return -1;
	}
	int maxData=this.heap[0];
	this.heap[0]=this.heap[currentPosition--];
	fix(0,-1);
	return maxData;	
}

private void fix(int index, int upto)
{
	// TODO Auto-generated method stub
	if (upto<0) 
	{
		upto=currentPosition;
	}
	while(index<=upto)
	{
	int leftChild=2*index+1;
	int rightChild=2*index+2;
	if (leftChild<=upto)
	{
		int childToSwap;
		if (rightChild>upto)
		{
			childToSwap=leftChild;
		}
		else
		{
			childToSwap=(heap[leftChild]>heap[rightChild])?leftChild:rightChild;
		}
		if (heap[index]<heap[childToSwap])
		{
			int temp=heap[index];
			heap[index]=heap[childToSwap];
			heap[childToSwap]=temp;			
		}
		else
		{
			break;
		}
		index=childToSwap;		
	}
	else
	{
		break;
	}
	}	
}

public void heapSort()
{
	for (int i = 0; i < currentPosition; i++)
	{
		int max=heap[0];
		System.out.print(max+" : ");
		heap[0]=heap[currentPosition-i];
		heap[currentPosition-i]=max;
		fix(0, currentPosition-i-1);		
	}
}

private boolean isFull() 
{
	// TODO Auto-generated method stub
	return this.currentPosition==this.heap.length;
}


}
