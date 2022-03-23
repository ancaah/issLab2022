package it.unibo.radarSystem22.domain.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.unibo.radarSystem22.domain.DeviceFactory;
import it.unibo.radarSystem22.domain.Distance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.utils.BasicUtils;
import it.unibo.radarSystem22.domain.utils.DomainSystemConfig;

public class TestSonar {


	@BeforeEach
	public void up(){ System.out.println("up"); }
	@AfterEach
	public void down(){ System.out.println("down"); }


	@Test
	public void testSonarMock() {
		DomainSystemConfig.simulation = true;

		ISonar sonar = DeviceFactory.createSonar();
		assertTrue( ! sonar.isActive() );

		sonar.activate();
		assertTrue(  sonar.isActive() );
		BasicUtils.delay(1000);

		for (int i = 30; i >= 0; i = i - 3) {
			assertTrue( sonar.getDistance().equals(new Distance(i)) );
		}

		sonar.deactivate();
		assertTrue(  ! sonar.isActive() );
		BasicUtils.delay(1000);
	}

}
