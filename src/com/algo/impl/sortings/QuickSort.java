package com.algo.impl.sortings;

public class QuickSort
{
	 int[] arr;
     public QuickSort(int[] arr)
     {
    	 this.arr=arr;
     }
     public void sort()
     {
    	 quickSort(0,arr.length-1);
     }
	 public void quickSort(int low,int high)
	 {
		 if (low>=high)
		 {
			return;
		 }
		 int pivot=pivot(low,high);
		 quickSort(low,pivot-1);
		 quickSort( pivot+1, high);
		 
		 
	 }

	private int pivot(int low, int high)
	{
		int pivot=(low+high)/2;
		swap(pivot,high);
		
		int i=low;
		for (int j = low; j < high; j++) 
		{
			if (arr[j]<=arr[high])
			{
				swap(i, j);
				i++;
			}
		}
		swap( i, high);
		
		return i;
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
