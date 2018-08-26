package com.algo.string.impl;

public class StringReversin 
{

	public String reverseString(String text)
	{
		int length=text.length();
		StringBuilder sb=new StringBuilder();
		
		for (int index = length-1; index>=0 ; index--) 
		{
			sb.append(text.charAt(index));
		}
		return sb.toString();
	}
}
