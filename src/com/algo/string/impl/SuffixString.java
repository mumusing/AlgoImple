package com.algo.string.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffixString 
{
    public List<String> suffix(String text)
    {
    	List<String>list=new ArrayList<>();
    	int length=text.length();
    	for (int index = 0; index < length; index++) 
    	{
    		list.add(text.substring(index, length));   		
		}
    	Collections.sort(list);
    	return list;	
    }	
    public List<String> prefix(String text)
    {
    	List<String>list=new ArrayList<>();
    	int length=text.length();
    	for (int index = 0; index < length; index++)
    	{
			list.add(text.substring(0, index+1));
		}
    	return list;
    }
    public String longestCommonPrefix(String text1,String text2)
    {
    	int commonLength=Math.min(text1.length(), text2.length());
    	for (int index = 0; index < commonLength; index++)
    	{
			if (text1.charAt(index)!=text2.charAt(index))
			{
				return text1.substring(0, index);
			}
		}
    	return text1.substring(0, commonLength);
    }
    
    public String longestRepeatedSubString(String text)
    {
    	int length=text.length();
    	List<String>list=suffix(text);
    	Collections.sort(list);
    	String longestSubString="";
    	for (int index = 0; index <length-1; index++)
    	{
			String temp=longestCommonPrefix(list.get(index), list.get(index+1));
			if (temp.length()>longestSubString.length())
			{
				longestSubString=temp;
			}
		}
    	return longestSubString;
    }
    
    
    
    
}
