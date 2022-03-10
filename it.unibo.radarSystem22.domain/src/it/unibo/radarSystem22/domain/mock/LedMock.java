package it.unibo.radarSystem22.domain.mock;

import it.unibo.radarSystem22.domain.interfaces.ILed;

public class LedMock implements ILed {

	private boolean led_is_on;
	
	public LedMock() {
		this.led_is_on = false;
	}
	
	@Override
	public void turnOn() {
		this.led_is_on = true;
	}

	@Override
	public void turnOff() {
		this.led_is_on = false;
	}

	@Override
	public boolean getState() {
		return this.led_is_on;
	}

}
