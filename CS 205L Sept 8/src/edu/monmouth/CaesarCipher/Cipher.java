package edu.monmouth.CaesarCipher;

public class Cipher {

	private String message;
	private short offset;
	
	public Cipher (String message, short offset) {
		this.message = message;
		this.offset = offset;
	}
	
	public String encode() {
		StringBuilder encodedString = new StringBuilder();
		int messageLength = message.length();
		for (int i = 0; i < messageLength; i++) {
			char characterToEncode = message.charAt(i);
			char encodedCharacter = (char)(((int)characterToEncode + offset - 'a') %26 + 'a');
			encodedString.append(encodedCharacter);
		}
		return encodedString.toString();
	}
}
