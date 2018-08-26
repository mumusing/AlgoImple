package com.algo.impl.heap;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Heap heap=new Heap(10);
		heap.insert(10);
		heap.insert(-5);
		heap.insert(20);
		heap.insert(30);
		heap.insert(-10);
		heap.insert(100);
		//System.out.println(heap.getMax());	
		heap.heapSort();
		
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		System.out.println(heap.getMax());
		heap.heapSort();

	}

}
