package it.unibo.radarSystem22.domain;

import java.util.Objects;

import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class Distance implements IDistance {

	private int v;
	
	public Distance(int d) { v=d; }
	
	@Override
	public int getVal() { return v; }
	
	@Override
	public String toString(){ return ""+v; }

	@Override
	public int hashCode() {
		return Objects.hash(v);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distance other = (Distance) obj;
		return v == other.v;
	}
}
