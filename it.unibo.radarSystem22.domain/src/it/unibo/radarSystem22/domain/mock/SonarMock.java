package it.unibo.radarSystem22.domain.mock;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

import it.unibo.radarSystem22.domain.interfaces.IDistance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.models.SonarModel;

public class SonarMock extends SonarModel implements ISonar {

	private ArrayDeque<IDistance> vals;

	public SonarMock() {
		is_active = false;
		vals  = new ArrayDeque<IDistance>();
		for (int i = 30; i >= 0; i = i - 3) {
			vals.add(new DistanceMock(i));		// creating some mock values
		} 
	}

	@Override
	protected IDistance getValue() {
		try{
			return vals.remove();
		}catch(NoSuchElementException e) {}
		return null;
	}

}
