package com.algo.impl.StringMatch;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String text="According to reports, Mayawati has also stated that in Uttar Pradesh and other states as well, Party workers of BSP should refrain from making any comments related to an alliance with other parties until it is officially announcedknow that Jai Prakash Singh has violated party principles and attacked another political leader on personal issues. She added that she has decided to remove Singh from the party with immediate effect.";
		String pattern="immediate";
		//Boyre Moore String Matching Algorithum
		
		BoyerMoorePatternMatch moore=new BoyerMoorePatternMatch(text, pattern);
		int index=moore.boyceMooreStringMatching();
		System.out.println(index);
		
		
		//Brute search algorithm
		StringMatching strMatch=new StringMatching();
		int indx=strMatch.bruteForceSearch(text, pattern);
		System.out.println(indx);
		
		
	}

}
