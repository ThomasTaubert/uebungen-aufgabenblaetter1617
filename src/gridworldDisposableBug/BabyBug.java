package gridworldDisposableBug;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends DisposableBug {

	int movements = 0;

	public BabyBug() {
		super();
		this.setColor(Color.YELLOW);
	}

	@Override
	public void act() {
		if (this.canMove())
			this.move();
		else
			this.turn();
	}

	@Override
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

		movements++;
		// System.out.println(life);

		if (movements >= 3) {
			int dir = this.getDirection();
			this.removeSelfFromGrid();

			if (Math.random() <= 0.5) {
				DisposableBug disBug = new DisposableBug();
				disBug.putSelfInGrid(gr, next);
				disBug.setDirection(dir);
				;
			} else {
				Breeder breedBug = new Breeder();
				breedBug.putSelfInGrid(gr, next);
				breedBug.setDirection(dir);
			}
		}
	}

	@Override
	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next))
			return false;
		Actor neighbor = gr.get(next);
		return (neighbor instanceof Flower);
		// ok to move onto flower
		// not ok to move onto any other actor or empty space
	}
}
