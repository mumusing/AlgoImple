package com.algo.impl.dataCompression;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Run Length Encoding
//		RunLengthEncoding runLength=new RunLengthEncoding();
////		System.out.println();
//		String encode=runLength.encode("aacddde");
//		runLength.decode(encode);
		
		
		
		//Huffman Encode
		String text="My name is Joiii";
		int[] charFrquency=new int[256];
		for (char cha : text.toCharArray())
		{
			++charFrquency[cha];
		}
		
		HuffmanCode code=new HuffmanCode();
		HuffmanTree tree=code.buildTree(charFrquency);
		code.printCodes(tree, new StringBuilder());
	}

}
