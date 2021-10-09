/**
 *
 * @author AnnaNardelli
 * Implements Animal
 */

package edu.monmouth.assignment1;
public class Dog implements Animal{
	
	protected String furColor;
	protected String move;
	protected String makeSound;
	
	public Dog (String furColor) {
		this.furColor = furColor;
	}
	
	public void setFurColor(String Parameter1) {
		furColor = Parameter1;
	}
	
	public String getFurColor() {
		return furColor;
	}

	@Override
	public void move() {
		move = "walk";
	}

	@Override
	public void makeSound() {
		makeSound = "woof";
	}
	
	@Override
	public String toString() {
		return "Fur Color: " + furColor + ", Movement: " + move + ", Sound: " + makeSound;
	}
}
