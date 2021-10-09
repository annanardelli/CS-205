/**
 * Subclass of Dog
 * extends meanness attribute
 */
package edu.monmouth.assignment1;

public class GuardDog extends Dog {
	private short meanness;
	
	public GuardDog(String furColor, Short meanness) {
		super(furColor);
		this.meanness = meanness;
	}
	
	public void setMeanness(short Parameter1) {
		meanness = Parameter1;
	}
	
	public short getMeanness() {
		return meanness;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Meanness: " + meanness;
	}
}
