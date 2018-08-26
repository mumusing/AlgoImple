package com.balance.bstTree;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Tree<Person>tree=new BinarySearchTree<Person>();
		
		tree.insert(new Person("mukesh", 26));
		tree.insert(new Person("singh", 27));
		tree.insert(new Person("alok", 27));
		tree.insert(new Person("abhi", 25));
		tree.insert(new Person("ravi", 2));
		tree.traverse();
		
//		tree.insert(10);
//		tree.insert(5);
//    	tree.insert(15);
//		tree.insert(3);
//		tree.insert(20);
//		tree.insert("abhmin");
//		tree.insert("human");
//		tree.insert("mukesh");
//		tree.insert("singh");
//		tree.insert("abcing");
//		tree.traverse();

		
//		
//		System.out.println(tree.getMinValue());
//		System.out.println(tree.getMaxValue());
//		tree.delete(10);
//		tree.traverse();
	}

}
