package com.algo.impl.sortings;

public class ShellSort 
{

	public void shellSort(int[] arr)
	{
		for (int gap = arr.length/2; gap > 0; gap/=2) 
		{
			for (int i = gap; i < arr.length; i++)
			{
				int j=i;
				while(j>=gap&&arr[j-gap]>arr[j])
				{
					swap(arr, j, j-gap);
					j=j-gap;
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
