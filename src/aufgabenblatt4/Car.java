package aufgabenblatt4;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	
	//Soweit eine gute, funktionierende Lösung. Das nutzen der Bewegungsmethode
	// der actor-Klasse würde einiges an Code sparen. Das Bremsen war eher
	//so gedacht, dass die speed variable auf einen Wert manipuliert wird,
	// der beim Bewegen genau auf das Feld davor endet. (siehe Musterlösung)
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//Super ist an der Stelle nicht unbedingt nötig (aber auch nicht falsch)
	//In der Actor Klasse wird im Konstruktor nichts weiter gesetzt
	Car() {
		super();
		this.setSpeed(1);
	}

	@Override
	public void act() {
		for (int ii = 0; ii < this.getSpeed(); ii++) {
			if (this.canMove()) {
				this.move();
			} else
				this.stop();
		}
		if (this.getSpeed() < 5) {
			this.acc(1);
		}
		if (Math.random() <= 0.2) {
			this.coast(1);
		}
	}

	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next)) {
			this.removeSelfFromGrid();
			return false;
		}
		Actor neighbor = gr.get(next);
		return (neighbor == null);
		// ok to move into empty location
		// not ok to move onto any actor
	}

	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
	}

	public void stop() {
		this.setSpeed(0);
	}

	public void acc(int step) {
		this.setSpeed(this.getSpeed() + step);
	}

	public void coast(int step) {
		if (this.getSpeed() - step <= 0) {
			this.setSpeed(0);
		} else {
			this.setSpeed(this.getSpeed() - step);
		}
	}
}
