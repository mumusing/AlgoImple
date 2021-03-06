package com.hashtable.liner.probing;

public class HashTable
{
	HashItem[] hashTable;
  public HashTable()
  {
	 this. hashTable=new HashItem[Constants.TABLE_SIZE];
  }
  public int get(int key)
  {
	  int generatedIndex=hashFunction(key);
	  while(hashTable[generatedIndex]!=null&&hashTable[generatedIndex].getKey()!=key) 
	  {
		  generatedIndex=(generatedIndex+1)%Constants.TABLE_SIZE;
	  }
	  if(hashTable[generatedIndex]==null)
	  {
		  return -1;
      }
	  else
	  {
		  return hashTable[generatedIndex].getValue();
	  }
	  
  }
  
  public void put(int key,int value)
  {
	  int generatedIndex=hashFunction(key);
	  while(hashTable[generatedIndex]!=null)
	  {
		  generatedIndex=(generatedIndex+1)%Constants.TABLE_SIZE;
		  System.out.println("Collision occure.........in put for index:  "+generatedIndex);
	  }
	  
	  hashTable[generatedIndex]=new HashItem(key, value);
  }
  
  public int hashFunction(int key)
  {
	  return key%Constants.TABLE_SIZE;
  }
}
