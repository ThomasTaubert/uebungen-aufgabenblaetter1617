package disposableBug;

import java.awt.Color;

import gridworld.framework.actor.Bug;

public class DisposableBug extends Bug {
	int life = 0;

	public DisposableBug() {
		super();
		this.setColor(Color.BLUE);
	}

	@Override
	public void act() {
		super.act();
		life++;
		System.out.println(life);
		if (life >= 25 && Math.random() <= 0.8) {
			this.removeSelfFromGrid();
		}
		if (Math.random() <= 0.4) {
			this.turn();
		}

	}

}
