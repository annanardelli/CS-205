package edu.monmouth.vehicle;

import java.util.Comparator;

public class CarReverseSize implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		if(car1.getEngineSize() == car2.getEngineSize() && car1.getColor() == car2.getColor()) {
			return EQUALS;
		}
		if(car1.getEngineSize() > car2.getEngineSize()) {
			return LESSTHAN;
		}
		if(car1.getEngineSize() < car2.getEngineSize()) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
	
	
}
