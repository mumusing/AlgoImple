package com.hashtable.chaining.method;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashTable ht=new HashTable();
		ht.put(1, 20);
		System.out.println(ht.get(1));
		ht.put(111, 200);
		ht.put(10, 3000);
		ht.put(1, 201);
		System.out.println(ht.get(0));
		System.out.println(ht.get(10));

		System.out.println(ht.get(1));

	}

}
