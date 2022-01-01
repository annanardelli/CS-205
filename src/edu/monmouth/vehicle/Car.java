package edu.monmouth.vehicle;

public class Car implements Vehicle, Comparable<Car> {

	public final int MINIMUMENGINESIZE = 0;
	public int engineSize;
	private CarColors color;
	
	public Car() {
		
	}
	public Car(CarColors color, int engineSize) {
		this.color = color;
		this.engineSize = engineSize;
	}
	public CarColors getColor() {
		return color;
	}
	
	public void setCarColor(CarColors color) {
		this.color = color;
	}
	
	public int getEngineSize() {
		return engineSize;
	}
	
	
	public void setEngineSize(int engineSize) throws EngineSizeException {
		if (engineSize > MINIMUMENGINESIZE) {
			this.engineSize = engineSize;
		}
		else {
			throw new EngineSizeException("Invalid engine size: " + engineSize);
		}
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Turn wheels");
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if(otherObject == null) {
			return false;
		}
		if (!(otherObject instanceof Car)) {
			return false;
		}
		Car otherCar = (Car)otherObject;
		return otherCar.engineSize == this.engineSize &&
		otherCar.getColor().equals(this.getColor());
	}
	
	@Override
	public int compareTo(Car otherCar) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		System.out.println("In Car CompareTo ... ");
		if(this.engineSize == otherCar.engineSize && this.color == otherCar.color) {
			return EQUALS;
		}
		if(this.engineSize < otherCar.engineSize) {
			return LESSTHAN;
		}
		if(this.engineSize > otherCar.engineSize) {
			return GREATERTHAN;
		}
		if(this.engineSize == otherCar.engineSize) {
			return this.color.compareTo(otherCar.color);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return ("Engine Size: " + engineSize + ", Color: " + color);
	}
}
