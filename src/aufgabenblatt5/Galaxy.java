package aufgabenblatt5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Galaxy {

	public static void main(String[] args) {
		List<GalaxyElement> galaxyElements = new ArrayList<GalaxyElement>();

		galaxyElements.add(new SpaceShip("SpaceShip1", 15., 3., 7.6, 0.5, 0.75));
		galaxyElements.add(new Sun("Sonne1", 15., 3., 7.6));
		galaxyElements.add(new Planet("Planet1", (Sun) galaxyElements.get(1), 1.5, 7.6));
		galaxyElements.add(new Planet("Planet2", (Sun) galaxyElements.get(1), 1.5, 1.6));
		galaxyElements.add(new Planet("Planet3", (Sun) galaxyElements.get(1), 1.5, 2.6));
		galaxyElements.add(new Planet("Planet4", (Sun) galaxyElements.get(1), 1.5, 3.6));
		galaxyElements.add(new Planet("Planet5", (Sun) galaxyElements.get(1), 1.5, 4.6));

		System.out.println(galaxyElements);

		for (int ii = 0; ii < 100; ii++) {
			for (Iterator<GalaxyElement> it = galaxyElements.iterator(); it.hasNext();) {
				GalaxyElement galEl = it /*
											 * wie bekomme ich hier das aktuelle
											 * Obkejt, auf das der Iterator
											 * zeigt???
											 */;
				if (galEl instanceof Moveable) {
					((Moveable) galEl).move();
				}
				if (galEl instanceof Destroyable) {
					((Destroyable) galEl).hit(Math.random() * 25);
					if (((Destroyable) galEl).isDestroyed()) {
						System.out.println(galEl.getName() + " is destroyed.");
						it.remove();
					}
				}
				it.next();
			}
			System.out.println(galaxyElements);
		}
	}

}
