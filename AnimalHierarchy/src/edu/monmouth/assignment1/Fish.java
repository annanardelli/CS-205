/**
 * Implements Animal
 */
package edu.monmouth.assignment1;

public class Fish implements Animal {
	private String color;
	private String move;
	private String makeSound;
	
	public Fish (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String Parameter1) {
		color = Parameter1;
	}

	@Override
	public void move() {
		move = "swim";
	}

	@Override
	public void makeSound() {
		makeSound = "blub blub blub";
	}
	
	@Override
	public String toString() {
		return "Color: " + color + ", Movement: " + move + ", Sound: " + makeSound;
	}
}
