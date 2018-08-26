package com.hashtable.generic.table;
@SuppressWarnings("unchecked")
public class HashTable<Key,Value>
{
  private Key[] keys;
  private Value[] values;
  private int noOfItems;
  private int capacity;
  
  public HashTable()
  {
	 this. keys=(Key[]) new Object[Constants.TABLE_SIZE];
	 this. values=(Value[]) new Object[Constants.TABLE_SIZE];
	 this. capacity=Constants.TABLE_SIZE;
	 this. noOfItems=0;
	  
  }
  public HashTable(int capacity)
  {
	 this. keys=(Key[]) new Object[capacity];
	 this. values=(Value[]) new Object[capacity];
	  this. capacity=capacity;
	 this. noOfItems=0;
	  
  }
  
  public int size()
  {
	  return this.noOfItems;
  }
  
  public boolean isEmpty()
  {
	  return noOfItems==0;
		
  }
  
  public void put(Key key,Value value)
  {
	  if (key==null) 
	  {
		return;
	  }
	  if (noOfItems>=capacity*0.75) 
	  {
			resize(2*capacity);
	  }
	  int index=hash(key);
	  
	  
	  while(keys[index]!=null)
	  {
		  if (keys[index]==key)
		  {
			values[index]=value;
			return;
		  }
		  index=(index+1)%Constants.TABLE_SIZE;
	  }
	   keys[index]=key;
	   values[index]=value;
	   noOfItems++;
	  
  }
  
  public void remove(Key key)
  {
	  if (key==null)
	  {
		return;
	  }
	  int index=hash(key);
	  while(!keys[index].equals(key))
	  {
		  index=(index+1)%Constants.TABLE_SIZE;
	  }
	  keys[index]=null;
	  values[index]=null;
	  index=(index+1)%Constants.TABLE_SIZE;
	  while(keys[index]!=null)
	  {
		  Key tempKey=keys[index];
		  Value tempValue=values[index];
		  keys[index]=null;
		  values[index]=null;
		  put(tempKey,tempValue);
		  index=(index+1)%Constants.TABLE_SIZE;
		  
	  }
	  if (noOfItems<capacity/3)
	  {
		resize(capacity/2);
	  }	  
  }
  private void resize(int newCapacity)
  {
	  HashTable<Key, Value> newTable=new HashTable<Key, Value>(newCapacity);
	  for (int i = 0; i < capacity; i++) 
	  {
		if (keys[i]!=null)
		{
			newTable.put(keys[i], values[i]);
		}
	  }
	  keys=newTable.getKeys();
	  values=newTable.getValues();
	  capacity=newTable.getCapacity();
  }
  
  
  public Value get(Key key)
  {
	  if (key==null)
	  {
		return null;
	  }
	  int generatedIndex=hash(key);
	  while(keys[generatedIndex]!=null)
	  {
		  if (keys[generatedIndex].equals(key)) 
		  {
			return values[generatedIndex];
		  }
		  generatedIndex=(generatedIndex+1)%Constants.TABLE_SIZE;
	  }
	  return null;
	  
  }
  
  private int hash(Key key)
  {
	  return Math.abs( (key.hashCode())%Constants.TABLE_SIZE);
  }
public Key[] getKeys() {
	return keys;
}
public Value[] getValues() {
	return values;
}
public int getCapacity() {
	return capacity;
}
  
  
  
}
