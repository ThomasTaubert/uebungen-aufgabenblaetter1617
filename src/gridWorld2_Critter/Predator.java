package gridWorld2_Critter;

import java.util.ArrayList;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;

class Predator extends Critter {

	public Predator() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processActors(ArrayList<Actor> actors){
		for (Actor actor : actors){
			if (actor instanceof BabyBug){
				actor.removeSelfFromGrid();
				break;
			}
		}
	}

}
