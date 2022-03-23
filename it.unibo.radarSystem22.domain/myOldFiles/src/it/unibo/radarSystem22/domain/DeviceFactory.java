package it.unibo.radarSystem22.domain;

import it.unibo.radarSystem22.domain.concrete.LedConcrete;
import it.unibo.radarSystem22.domain.concrete.SonarConcrete;
import it.unibo.radarSystem22.domain.interfaces.*;
import it.unibo.radarSystem22.domain.mock.LedMock;
import it.unibo.radarSystem22.domain.mock.LedMockWithGui;
import it.unibo.radarSystem22.domain.mock.SonarMock;
import it.unibo.radarSystem22.domain.utils.DomainSystemConfig;

public class DeviceFactory {
	public static ILed createLed() {
		DomainSystemConfig.setTheConfiguration();

		if ( DomainSystemConfig.simulation == true ) 
			if (DomainSystemConfig.ledGui == true )
				return LedMockWithGui.createLed();
			else
				return new LedMock();
		else
			return new LedConcrete();
	}

	public static ISonar createSonar() {   
		DomainSystemConfig.setTheConfiguration();

		if ( DomainSystemConfig.simulation == true ) 
			return new SonarMock();
		else 
			return new SonarConcrete();
	}

	//	  public static IRadarGui createRadarGui() { ... }
}