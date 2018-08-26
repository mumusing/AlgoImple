package com.algo.impl.sortings;

public class SelectionSort
{
    
	public void sort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int index=i;
			for (int j = i+1; j < arr.length-1; j++)
			{
				if (arr[j]<arr[index]) 
				{
					index=j;
				}
			}
			swap(arr,i,index);
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
