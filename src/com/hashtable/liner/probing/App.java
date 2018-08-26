package com.hashtable.liner.probing;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       HashTable table=new HashTable();
       table.put(2, 12);
       table.put(12, 120);	
       table.put(22, 150);
       table.put(23, 170);
       table.put(23, 180);
       
       System.out.println(table.get(2));
       System.out.println(table.get(3));
       System.out.println(table.get(22));
       System.err.println(table.get(23));
	}
	

}
