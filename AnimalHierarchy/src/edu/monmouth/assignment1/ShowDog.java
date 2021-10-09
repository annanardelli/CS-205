/**
 * Subclass of Dog
 * extends breed attribute
 */
package edu.monmouth.assignment1;

public class ShowDog extends Dog{
	private String breed;
	
	public ShowDog (String furColor, String breed) {
		super(furColor);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String Parameter1) {
		breed = Parameter1;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Breed: " + breed;
	}
}
