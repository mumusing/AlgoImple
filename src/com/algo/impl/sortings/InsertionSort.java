package com.algo.impl.sortings;

public class InsertionSort 
{
    public void insertionSort(int[] arr)
    {
    	for (int i = 0; i < arr.length; i++)
    	{
    		int j=i;
			while (j>0 )
			{
				if (arr[j-1]>arr[j])
				{
					swap(arr, j-1, j);
				}
				j--;
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
