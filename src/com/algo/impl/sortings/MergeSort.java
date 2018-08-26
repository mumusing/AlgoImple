package com.algo.impl.sortings;

public class MergeSort
{
   private int[] arr;
   private int[] temp;
	public MergeSort(int[] arr)
	{
		this.arr=arr;
		this.temp=new int[arr.length];
	}
	public void sort()
	{
		mergeSort(0,arr.length-1);
		show();
	}
	
	private void mergeSort(int low, int high) 
	{
		// TODO Auto-generated method stub
		int middle=(low+high)/2;
		if (low>=high)
		{
			return;
		}
		mergeSort(low, middle);
		mergeSort(middle+1, high);
		mergeSort(low,middle ,high);
		
	}
	private void mergeSort(int low, int middle, int high)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) 		
		{
			this.temp[i]=this.arr[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle&&j<=high)
		{
			if (temp[i]<=temp[j]) 
			{
				arr[k]=temp[i];
				i++;
			}
			else
			{
				arr[k]=temp[j];
				j++;
			}
			k++;
		}
		while (i<=middle) 
		{
			arr[k]=temp[i];
			i++;
			k++;
		}
		while (j<=high) 
		{
			arr[k]=temp[j];
			j++;
			k++;
		}
	}
	private void swap( int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void show()
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
