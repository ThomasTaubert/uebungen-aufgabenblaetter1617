package aufgabenblatt4;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {
	private double wahrscheinlichkeit;

	public CarSource() {
		super();
		this.setDirection(Location.EAST);
		this.setWahrscheinlichkeit(Math.random());
	}

	public double getWahrscheinlichkeit() {
		return wahrscheinlichkeit;
	}

	public void setWahrscheinlichkeit(double wahrscheinlichkeit) {
		this.wahrscheinlichkeit = wahrscheinlichkeit;
	}

	@Override
	public void act() {
		if (Math.random() <= this.getWahrscheinlichkeit()) {
			Grid<Actor> gr = getGrid();
			if (gr == null)
				return;
			Location loc = getLocation();
			Location next = loc.getAdjacentLocation(getDirection());
			if (gr.isValid(next) && gr.get(next) == null) {
				Car car = new Car();
				car.setDirection(this.getDirection());
				car.putSelfInGrid(gr, next);
			}
		}
	}
}
