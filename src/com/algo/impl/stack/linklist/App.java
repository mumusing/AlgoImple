package com.algo.impl.stack.linklist;

import java.util.Stack;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Stack<String> stack=new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
