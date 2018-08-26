package com.algo.impl.sortings;

public class App {

	public static void main(String[] args) 
	{
		// Bogo Sort Algorithum
//		int[] arr= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//        BogoSort bs=new BogoSort();
//        bs.bogoSort(arr);

        // Sleep Sort Algorithum
//        SleepSort sr=new SleepSort();
//        int[] arr1= {4,2,1,5,6,};
//        sr.sleepSort(arr1);
		
		//Bubble Sort
//		BubbleSort bsort=new BubbleSort();
//		int[] arr2= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//		bsort.sort(arr2);
		
		//SELECTION sORT
//		SelectionSort sort=new SelectionSort();
//		int[] arr3= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//		sort.sort(arr3);
		
		//Insertion Sort
//		InsertionSort is=new InsertionSort();
//		int[] arr4= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//		is.insertionSort(arr4);
		
		//Shell Sort
//		ShellSort sort=new ShellSort();
//		int[] arr5= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//		sort.shellSort(arr5);
		
		//Quick Sort
//		int[] arr5= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
//		QuickSort qs=new QuickSort(arr5);
//		qs.sort();
//		qs.show();
		
		//Merge Sort
		int[] arr5= {12,-4,26,0,3,8,2,1,100,-1,-5,-6,1000};
		MergeSort ms=new MergeSort(arr5);
		ms.sort();
		
		
		
	}

}
