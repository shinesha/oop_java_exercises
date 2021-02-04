package com.techreturners.cats;


public abstract class Cats implements Cat {
	

	//goToSleep();
	boolean isAsleep;
	//void wakeUp();
	String setting;
	int averageHeight;
	String soundAfterEating;
	final String sleepStyle = "onFront";
	
	public Cats(boolean isAsleep, String setting, int averageHeight, String soundAfterEating) {
		super();
		this.isAsleep = isAsleep;
		this.setting = setting;
		this.averageHeight = averageHeight;
		this.soundAfterEating = soundAfterEating;
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public void goToSleep() {
		this.isAsleep = true;
	}
	
	public void wakeUp() {
		this.isAsleep = false;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public String getSoundAfterEating() {
		return soundAfterEating;
	}

	public void setSoundAfterEating(String soundAfterEating) {
		this.soundAfterEating = soundAfterEating;
	}

	public String getSleepStyle() {
		return sleepStyle;
	}
	
	
	
	
}



