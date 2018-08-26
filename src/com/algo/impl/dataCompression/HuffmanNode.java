package com.algo.impl.dataCompression;

public class HuffmanNode extends HuffmanTree
{
	HuffmanTree leftTree;
	HuffmanTree rightTree;
	public HuffmanNode(HuffmanTree rightTree,HuffmanTree leftTree) 
	{
		super(rightTree.getFrequency()+leftTree.getFrequency());
        this.leftTree=leftTree;
        this.rightTree=rightTree;
	
	}
	public HuffmanTree getLeftTree() {
		return leftTree;
	}
	public void setLeftTree(HuffmanTree leftTree) {
		this.leftTree = leftTree;
	}
	public HuffmanTree getRightTree() {
		return rightTree;
	}
	public void setRightTree(HuffmanTree rightTree) {
		this.rightTree = rightTree;
	}
	
	
}
