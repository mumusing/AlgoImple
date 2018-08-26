package com.hashtable.chaining.method;

public class HashTable
{
private HashItem[] hashTable;
public HashTable()
{
	hashTable=new HashItem[Constants.TABLE_SIZE];
}

public int get(int key)
{
	int arrayIndex=hashKey(key);
	if (hashTable[arrayIndex]==null) 
	{
		return -1;
	}
	else
	{
		HashItem nextItem=hashTable[arrayIndex];
		while (nextItem!=null&&nextItem.getKey()!=key)
		{
			nextItem=nextItem.getNextHashItem();
			System.out.println("There is collosion in hash table in get operation.............");
		}
		if (nextItem==null) 
		{
		return -1;	
		}
		return nextItem.getValue();
	}
	
	
	
}


public void put(int key, int value)
{
	int arrayIndex=hashKey(key);
	if (hashTable[arrayIndex]==null)
	{
		hashTable[arrayIndex]=new HashItem(key,value);
	}
	else
	{
		
		HashItem nestHashItem=hashTable[arrayIndex];
		while (nestHashItem.getNextHashItem()!=null)
		{
			System.out.println("There is collosion for insertion.............");
			if (nestHashItem.getKey()==key)
			{
				System.out.println("There is collosion for insertion and element alrady exists.............");
				nestHashItem.setValue(value);
				return;
			}
			nestHashItem=nestHashItem.getNextHashItem();			
		}
		nestHashItem.setNextHashItem(new HashItem(key,value));		
	}
	
}
public int hashKey(int key)
{
	return key%Constants.TABLE_SIZE;
}
}
