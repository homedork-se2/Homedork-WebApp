package com.example.HomeDorkWebApp.model;

import java.util.UUID;

public class Fan extends Device {
	public double level;

	public Fan() {
		this.id = UUID.randomUUID();
		this.state = State.OFF;
	}

	public UUID getId() {
		return id;
	}

	public State getState() {
		return state;
	}


	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}
}