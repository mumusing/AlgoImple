package com.algo.impl.sortings;

public class BubbleSort 
{

	public void sort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-i-1; j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					swap(arr,j,j+1);
				}
			}
		}
		show(arr);
	}
	
	public void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void show(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
