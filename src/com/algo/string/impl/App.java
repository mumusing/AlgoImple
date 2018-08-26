package com.algo.string.impl;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        SuffixString suffixTree=new SuffixString();
        System.out.println(suffixTree.suffix("hellohehehello"));
        System.out.println(suffixTree.prefix("hellohehehello"));
        System.out.println("");
        System.out.println(suffixTree.longestRepeatedSubString("hellohehehello"));
	}

}
