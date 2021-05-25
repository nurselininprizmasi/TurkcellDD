package com.training.turkcell.basic;

public abstract class Car {
	private int maxSpeed;
	private final int doorCount;

	public Car(int doorCount) {
		this.doorCount = doorCount;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getDoorCount() {
		return doorCount;
	}
}
