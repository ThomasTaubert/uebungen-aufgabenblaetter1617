package gridworldDisposableBug;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Breeder extends DisposableBug {

	public Breeder() {
		super();
		this.setColor(Color.RED);
	}

	@Override
	public void move(){
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        if (Math.random() <= 0.15){
        	BabyBug babyBug = new BabyBug();
        	babyBug.putSelfInGrid(gr, loc);
        	babyBug.setDirection(this.getDirection());
        } else {
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
        }
	}
}
