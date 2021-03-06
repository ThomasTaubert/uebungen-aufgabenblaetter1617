package gridWorld2_Critter;


import java.awt.Color;

import gridworld.framework.actor.Bug;

public class DisposableBug extends Bug {
	
	private int lifeCycle = 0;
	
	public DisposableBug() {
		super(Color.BLUE);
	}
	
	@Override
	public void act() {
		if(Math.random() <= 0.4) {
			this.turn();
		}
		if(lifeCycle > 25 && Math.random() <= 0.8) {
			this.removeSelfFromGrid();
		} else {
			super.act();
			lifeCycle++;
		}
	}
}
