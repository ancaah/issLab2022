package it.unibo.radarSystem22.domain.mock;

import it.unibo.radarSystem22.domain.interfaces.IDistance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;

public class SonarMock {
	
	private IDistance distance;
	private boolean is_active;
	
	public SonarMock() {
		distance = new DistanceMock();
		is_active = false;
	}
	
	
	public void activate() {
		is_active = true;
	}
	
	public void deactivate() {
		is_active = false;
	}
	
	public IDistance getDistance();
	public boolean isActive();
	
}
