package edu.monmouth.vehicle;

public class List {
	private Node head;
	
	public void insert(Car car) {
		Node newNode = new Node(car);
		newNode.setNext(head);
		head = newNode;
	}
	
	@Override
	public String toString() {
		StringBuilder returnValue = new StringBuilder();
		Node currentNode = head;
		while(currentNode != null) {
			returnValue.append(currentNode.toString());
			currentNode = currentNode.getNext();
		}
		return returnValue.toString();
	}
}
