package com.algo.impl.avlTree;

public class App {

	public static void main(String[] args) 
	{
      Tree avlTree=new AvlTree();
      //Rotating left
//      avlTree.insert(1);
//      avlTree.insert(2);
//      avlTree.insert(3);
//      avlTree.insert(4);
//      avlTree.insert(5);
      	
      //Rotating right
//      avlTree.insert(3);
//      avlTree.insert(2);
//      avlTree.insert(1);
      
      //Rotating Left Right
//      avlTree.insert(3);
//      avlTree.insert(1);
//      avlTree.insert(2);
      
        //Rotating Right Left
        avlTree.insert(1);
        avlTree.insert(3);
        avlTree.insert(2);
      
        avlTree.traverse(); 
	}

}
