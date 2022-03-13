package it.unibo.radarSystem22.domain.concrete;

import java.io.IOException;

import it.unibo.radarSystem22.domain.interfaces.ILed;
import it.unibo.radarSystem22.domain.models.LedModel;

public class LedConcrete extends LedModel implements ILed {

	@Override
	protected void ledActivate(boolean val) {
		try {
			
			if (val)	Runtime.getRuntime().exec("bash led25GpioTurnOn.sh");	
			else		Runtime.getRuntime().exec("bash led25GpioTurnOff.sh");
			
		} catch (IOException e) {
			System.out.println("Couldn't change led status to: " + (val ? "on." : "off."));
			e.printStackTrace();
		}
	}
	
}
