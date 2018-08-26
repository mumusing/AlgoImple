package com.algo.impl.trie;

public class App
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Trie trie=new Trie();
 //     trie.insert("zeidan",17);
        trie.insert("admin",17);
        trie.insert("admbcde",17);
        trie.insert("adminfcs",17);
//        trie.insert("crotia",17);
//        trie.insert("mukesh",17);
//        trie.insert("singh",14);
//        trie.insert("mukhbir",01);
//		System.out.println(trie.searchAsMap("ing"));
//		System.out.println(trie.autoComplete("m"));
		//Sorted Trie
//		System.out.println(trie.autoComplete(""));
		//Longest Common Prefix
		System.out.println(trie.longestCommonPrefix());

	}

}
