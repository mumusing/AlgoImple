package com.algo.impl.dataCompression;

public class HuffmanTree implements Comparable<HuffmanTree> {

	protected int frequency;

	public HuffmanTree(int frequency)
	{
		// TODO Auto-generated constructor stub
		this.frequency = frequency;
	}

	@Override
	public int compareTo(HuffmanTree o)
	{
		// TODO Auto-generated method stub
		return Integer.compare(this.frequency, o.frequency);
	}

	public int getFrequency()
	{
		return frequency;
	}

	public void setFrequency(int frequency) 
	{
		this.frequency = frequency;
	}

}
