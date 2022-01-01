package edu.monmouth.cardStack;

import edu.monmouth.card.Card;

public class ArrayStack {
	
	private static final int PUSHERROR = -1;
	private Card[] array;
	int stackSize;
	private int top;
	
	public ArrayStack() {
		
	}
	
	public ArrayStack(int stackSize) {
		this.stackSize = stackSize;
		array = new Card[stackSize];
		top = 0;
	}
	
	public Card top() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		return array[top];
	}
	
	public Card pop() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		Card returnValue = array[top-1];
		array[top] = null;
		top --;
		return returnValue;
	}
	
	public void push(Card card) {
		if (top == array.length) {
			System.err.println("Array not large enough to push card");
			System.exit(PUSHERROR);
		}
		array[top] = card;
		top++;
		}
	
	public boolean isEmpty() {
		if (array[top] == null) {
			return true;
		}
		return false;
	}
}
