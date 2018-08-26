package com.algo.impl.sortings;

import java.util.concurrent.CountDownLatch;

public class SleepSort 
{
 
	public void sleepSort(int[] arr)
	{
		CountDownLatch countDownLatch=new CountDownLatch(arr.length);
		for (int item : arr)
		{
			new Thread(new Runnable() 
			{
				
				@Override
				public void run()
				{
					countDownLatch.countDown();
					// TODO Auto-generated method stub
					try 
					{
						Thread.sleep(item*100);
						System.out.print(item+" ");
					} 
					catch (InterruptedException e)
					
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}).start();
		}
		
	}
}
