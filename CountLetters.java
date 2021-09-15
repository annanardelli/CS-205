package edu.monmouth.gettingStarted;

public class CountLetters {
	private String letters;
	private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	public CountLetters(String letters) {
		this.letters = letters;
	}
	
	public int numberOfVowels () {
		int count = 0;
		int length = letters.length();
		for(int i = 0; i < length; i++) {
			for (char vowel: vowels) {
				if (letters.charAt(i) == vowel) {
					count++;
				}
			}
		}
		return count;
	}
	
	public int numberOfConsonants () {
		int count = letters.length();
		int length = letters.length();
		for(int i = 0; i < length; i++) {
			for (char vowel: vowels) {
				if (letters.charAt(i) == vowel) {
					count--;
			}
		}
		
	}
		return count;
}
}