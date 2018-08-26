package com.algo.impl.StringMatch;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoorePatternMatch {
	String text;
	String pattern;
	private Map<Character, Integer> missMatchShftTable;

	public BoyerMoorePatternMatch(String text, String pattern) {
		this.text = text;
		this.pattern = pattern;
		this.missMatchShftTable = new HashMap<Character, Integer>();
		precomputePrefix(this.pattern);
	}

	public int boyceMooreStringMatching() {
		int noOfSkipSteps = 0;
		int patternLength = pattern.length();
		int textLength = text.length();
		int count = 0;
		for (int i = 0; i <= textLength - patternLength; i += noOfSkipSteps) {
			noOfSkipSteps = 0;
			for (int j = patternLength - 1; j >= 0; j--) {
				count++;
				if (text.charAt(i + j) != pattern.charAt(j)) {
					if (missMatchShftTable.containsKey(text.charAt(i + j))) {
						noOfSkipSteps = missMatchShftTable.get(text.charAt(i + j));
						break;
					} else {
						noOfSkipSteps = patternLength;
						break;
					}
				}
			}
			if (noOfSkipSteps == 0) {
				System.out.println("No Of Count: " + count);

				return i;
			}

		}
		System.out.println("No Of Count: " + count);
		return -1;

	}

	public void precomputePrefix(String pattern) {
		int patternLength = pattern.length();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			int maxNoOfShift = Math.max(1, patternLength - i - 1);
			missMatchShftTable.put(ch, maxNoOfShift);

		}

	}

}
