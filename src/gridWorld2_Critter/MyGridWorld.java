package gridWorld2_Critter;

import gridworld.framework.actor.ActorWorld;

public class MyGridWorld {
	
	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld();
		world.add(new Predator());
		world.add(new Breeder());
		world.add(new DisposableBug());
		world.add(new DisposableBug());
		
		world.show();
		
	}

}
