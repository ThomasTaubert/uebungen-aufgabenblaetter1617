package aufgabenblatt4;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class RunCarGridWorld {

	public static void main(String[] args) {
		// create the world
		ActorWorld world = new ActorWorld();
		// define the size of the grid
		int hoehe = 30;
		int breite = 50;
		world.setGrid(new BoundedGrid<Actor>(hoehe, breite));

		// add a car at the leftmost position
		// for (int ii = 0; ii < hoehe; ii++) {
		// if (Math.random() <= 0.5+(ii + 1) / hoehe) {
		// world.add(new Location(ii, 0), new Car());
		// }
		// }

		// here you may add other things to the grid
		// CarSources
		for (int ii = 0; ii < hoehe; ii++) {
			world.add(new Location(ii, 0), new CarSource());
		}

		// Hindernisse
		world.add(new Location(9, 34), new Rock());

		// visualize the world
		world.show();
	}

}
