package it.unibo.radarSystem22.domain.mock;

import java.util.Objects;

import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class DistanceMock implements IDistance {

	private int val;

	public DistanceMock(int v) {
		val = v;
	}
	
	@Override
	public int getVal() {
		return val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistanceMock other = (DistanceMock) obj;
		return val == other.val;
	}

}
