package com.interview.uuid.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

public class Parameters {
	@Positive
	private int x;
	
	@Min(0)
	private int y;
	
	@Min(0)
	private int z;
	
	public Parameters() {
		
	}
	
	public Parameters(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
}
