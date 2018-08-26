package com.algo.impl.sortings;

public class BogoSort
{

	private int loopCounter=0;
	public void bogoSort(int[] arr)
	{
		while(!isSorted(arr))
		{
			++loopCounter;
		for (int i = 0; i < arr.length; i++)
		{
			int j=(int) (Math.random()*i);
			swap(arr, i, j);
		}
		}
		showAll(arr);
		System.err.println();
		System.out.println(loopCounter);
	}
	public boolean isSorted(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	 public void swap(int[] arr,int i,int j)
	 {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;		 
	 }
	
	public void showAll(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
