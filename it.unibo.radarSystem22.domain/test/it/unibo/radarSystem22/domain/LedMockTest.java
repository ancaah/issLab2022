package it.unibo.radarSystem22.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.unibo.radarSystem22.domain.interfaces.ILed;
import it.unibo.radarSystem22.domain.mock.LedMock;

class LedMockTest {

	@BeforeEach
	public void up() {
		System.out.println("Led turned on");
	}
	
	@AfterEach
	public void down() {
		System.out.println("Led turned off");
	}
	
	@Test
	public void testLedMockOn() {
		System.out.println("testLedMock");
		//DomainSystemConfig.simulation = true;

		ILed led = new LedMock();
		assertTrue(! led.getState());

		led.turnOn();
		assertTrue(led.getState());
	}

	@Test
	public void testLedMockOff() {
		System.out.println("testLedMockOn");
		//DomainSystemConfig.simulation = true;

		ILed led = new LedMock();
		assertTrue(! led.getState());

		led.turnOff();
		assertTrue(! led.getState());
	}

}
