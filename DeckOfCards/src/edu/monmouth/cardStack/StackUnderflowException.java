package edu.monmouth.cardStack;

public class StackUnderflowException extends Exception {
	private static final long serialVersionUID = 1L;
	public StackUnderflowException() {
		super();
	}
	public StackUnderflowException(String msg) {
		super(msg);
	}
}