package edu.monmouth.vehicle;

public class Node {
	private Car car;
	private Node next;
	
	public Node(Car car) {
		this.car = car;
		next = null;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [car=" + car + "] ";
	}
}
