package edu.monmouth.CaesarCipher;

public class Lab1 {

	public static void main(String[] args) {
		String message = "welcome to data structures";
		final short OFFSET = 4;
		
		Cipher cipher = new Cipher(message, OFFSET);
		String encodedMessage = cipher.encode();
		
		System.out.println("Encoded message: " + encodedMessage);

	}

}
