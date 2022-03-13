package it.unibo.radarSystem22.domain.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.unibo.radarSystem22.domain.DeviceFactory;
import it.unibo.radarSystem22.domain.interfaces.ILed;
import it.unibo.radarSystem22.domain.mock.LedMock;
import it.unibo.radarSystem22.domain.utils.BasicUtils;
import it.unibo.radarSystem22.domain.utils.DomainSystemConfig;

public class TestLed 
{
	@BeforeEach
	public void up(){ System.out.println("up"); }
	@AfterEach
	public void down(){ System.out.println("down"); }

	@Test
	public void testLedMock() {
		DomainSystemConfig.simulation = true;

		ILed led = DeviceFactory.createLed();
		assertTrue( ! led.getState() );

		led.turnOn();
		assertTrue(  led.getState() );
		BasicUtils.delay(1000);                //to see the ledgui

		led.turnOff();
		assertTrue(  ! led.getState() );
		BasicUtils.delay(1000);                //to see the ledgui
	}

	@Test
	public void testLedConcrete() {
		DomainSystemConfig.simulation = false;
		
		ILed led = DeviceFactory.createLed();
		assertTrue( ! led.getState() );
		
		led.turnOn();
		assertTrue(  led.getState() );
		BasicUtils.delay(1000);                //to see the ledgui

		led.turnOff();
		assertTrue(  ! led.getState() );
		BasicUtils.delay(1000);                //to see the ledgui
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