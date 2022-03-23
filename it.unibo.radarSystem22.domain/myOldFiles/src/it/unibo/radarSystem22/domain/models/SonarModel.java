package it.unibo.radarSystem22.domain.models;

import it.unibo.radarSystem22.domain.concrete.SonarConcrete;
import it.unibo.radarSystem22.domain.interfaces.IDistance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.mock.SonarMock;
import it.unibo.radarSystem22.domain.utils.DomainSystemConfig;

public abstract class SonarModel implements ISonar {

	protected boolean is_active;

	//Factory methods
	public static ISonar create() {
		ISonar sonar;
		if( DomainSystemConfig.simulation ) sonar = createSonarMock();
		else sonar = createSonarConcrete();
		return sonar;
	}

	public static ISonar createSonarMock(){return new SonarMock();  }
	public static ISonar createSonarConcrete(){return new SonarConcrete();}

	@Override
	public void activate() {
		is_active = true;
	}

	@Override
	public void deactivate() {
		is_active = false;
	}

	protected abstract IDistance getValue();

	@Override
	public IDistance getDistance() {
		if (is_active)	return getValue();
		else 			return null;
	}

	@Override
	public boolean isActive() {
		return is_active;
	}

}
