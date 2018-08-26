package com.balance.bstTree;

public interface Tree<T>
{
   public void traverse();
   public void insert(T data);
   public Node<T> delete(T data);
   public T getMinValue();
   public T getMaxValue();	
}
