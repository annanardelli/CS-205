package edu.monmouth.palindrome;

import java.util.Stack;

public class Palindrome {

	String word;
	
	public Palindrome(String word) {
		this.word = word;
		}
	
	public boolean isPalindrome() {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		StringBuilder builder = new StringBuilder();
		
		while(stack.empty() != true) {
			builder.append(stack.pop());
		}
		if(builder.toString().equals(word)){
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return(word);
	}
}
