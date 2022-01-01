package edu.monmouth.labFinal;

public class Competitor implements Comparable<Competitor> {

	private String name;
	private int score;
	
	public Competitor(String name, int score) {
		setName(name);
		setScore(score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;}
		if (!(o instanceof Competitor)) {
			return false;}
		Competitor other = (Competitor) o;
		if(this.score == other.score) {
			return true;}
		return false;
	}
	
	@Override
	public String toString() {
		return name + ", Score: " + score;
	}

	@Override
	public int compareTo(Competitor o) {
		final int EQUALS = 0;
		final int LESSTHAN = -1;
		final int GREATERTHAN = 1;
		
		if(this.equals(o)) {
			return EQUALS;
		}
		if(this.score < o.score) {
			return LESSTHAN;
		}
		if(this.score > o.score) {
			return GREATERTHAN;
		}
		return EQUALS;
	}
	
	
}
