package com.lift;

public class Lift {
	String liftName;
	int position;
	boolean underMAintanance;
	int rstart;

	int rend;

	public Lift(String liftName, int position, int res1, int res2, boolean underMAintanance) {
		super();
		this.liftName = liftName;
		this.position = position;
		this.underMAintanance = underMAintanance;
	}

	public String getLiftName() {
		return liftName;
	}

	public void setLiftName(String liftName) {
		this.liftName = liftName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isUnderMAintanance() {
		return underMAintanance;
	}

	public void setUnderMAintanance(boolean underMAintanance) {
		this.underMAintanance = underMAintanance;
	}

	public int getRstart() {
		return rstart;
	}

	public void setRstart(int rstart) {
		this.rstart = rstart;
	}

	public int getRend() {
		return rend;
	}

	public void setRend(int rend) {
		this.rend = rend;
	}

}
