package com.hashtable.generic.table;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        HashTable<String, Integer> ht=new HashTable<String, Integer>();
        ht.put("mukesh", 1);
        ht.put("singh", 2);
        ht.put("danshan", 3);
        ht.put("amit", 14);
        ht.put("dhaval", 15);
        ht.put("mukesh", 7);
        System.out.println(ht.get("mukesh"));
        System.out.println(ht.get("singh"));
        System.out.println(ht.get("danshan"));
        System.out.println(ht.size());
        ht.remove("danshan");
		
	}

}
