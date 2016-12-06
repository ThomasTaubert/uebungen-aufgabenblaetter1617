package uebung7_TransportSimulator;

import java.util.ArrayList;
import java.util.List;

public class TransportSimulator {

	static List<Movable> passengerFleet = new ArrayList<>();

	public static void increaseSpeedByRandom(Movable mov) {
		if (mov instanceof CanMoveHorizontally) {
			((CanMoveHorizontally) mov).increaseHorizontalSpeed(Math.random() * 10);
		}
		if (mov instanceof CanMoveVertically) {
			((CanMoveVertically) mov).increaseVerticalSpeed((Math.random() * 10) - 5);
		}
	}

	public static void turn(Movable mov) {
		if (mov instanceof CanMoveHorizontally && Math.random() <= 0.25) {
			((CanMoveHorizontally) mov).turnBy(Math.PI / 2);
		}
	}

	public static void simulate(int steps) {
		// Für jeden Schritt
		for (int ii = 0; ii < steps; ii++) {
			// jedes 10. Mal und letztes Mal Schrittnummer ausgeben
			if (ii % 10 == 0 || ii + 1 == steps) {
				System.out.println("Schritt: " + (ii + 1));
			}

			// Für jedes Objekt der Liste
			for (Movable mov : passengerFleet) {
				increaseSpeedByRandom(mov);
				turn(mov);
				mov.move();
				// jedes 10. Mal und letztes Mal Daten schreiben
				if (ii % 10 == 0 || ii + 1 == steps) {
					System.out.println(mov.toString());
				}
			}
		}
	}

	public static void main(String[] args) {

		passengerFleet.add(new Elevator("Fahrstuhl1", 0));
		passengerFleet.add(new Elevator("Fahrstuhl2", 0));
		passengerFleet.add(new Elevator("Fahrstuhl3", 0));
		passengerFleet.add(new Ship("Schiff1", 0, 13));
		passengerFleet.add(new Helicopter("Heli1", 5, 4, 13));
		passengerFleet.add(new Elevator("Fahrstuhl4", 0));
		passengerFleet.add(new Elevator("Fahrstuhl5", 0));
		passengerFleet.add(new Ship("Schiff2", 100, 13));
		passengerFleet.add(new Helicopter("Heli2", 3, 9, 2));
		passengerFleet.add(new Elevator("Fahrstuhl6", 0));

		simulate(1000);
	}

}
