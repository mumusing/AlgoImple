package com.algo.impl.StringMatch;

public class StringMatching {
	public int bruteForceSearch(String text, String pattern) {
		int count = 0;
		int textLength = text.length();
		int patternLength = pattern.length();
		for (int i = 0; i <= textLength - patternLength; i++) {
			int j;
			for (j = 0; j < patternLength; j++) {
				count++;
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				}
			}
			if (j == patternLength) {
				System.out.println("No Of Count: " + count);

				return i;
			}

		}
		System.out.println("No Of Count: " + count);
		return -1;

	}

}
