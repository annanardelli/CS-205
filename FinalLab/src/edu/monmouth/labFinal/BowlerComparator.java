package edu.monmouth.labFinal;

import java.util.Comparator;

public class BowlerComparator implements Comparator<Competitor> {

	@Override
	public int compare(Competitor o1, Competitor o2) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if(o1.getScore() == o2.getScore()) {
			return EQUALS;
		}
		if(o1.getScore() > o2.getScore()) {
			return LESSTHAN;
		}
		if(o1.getScore() < o2.getScore()) {
			return GREATERTHAN;
		}
		return EQUALS;
	}

	
}
