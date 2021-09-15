package edu.monmouth.gettingStarted;

public class VowelsConsonants {

	public static void main(String[] args) {
		String stringToExamine = "datastructures";
		
		CountLetters countLetters = new CountLetters(stringToExamine);
		
		int numberOfVowels = countLetters.numberOfVowels();
		System.out.println("Number of vowels: " + numberOfVowels);
		
		int numberOfConsonants = countLetters.numberOfConsonants();
		System.out.println("Number of consonants: " + numberOfConsonants);
	}

}
