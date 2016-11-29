package uebung7_TransportSimulator;

import java.util.ArrayList;
import java.util.List;

public class TransportSimulator {

	public static void increaseSpeedByRandom(Movable mov) {
		if (mov instanceof CanMoveHorizontally) {
			((CanMoveHorizontally) mov).increaseHorizontalSpeed(Math.random() * 100);
		}
		if (mov instanceof CanMoveVertically) {
			((CanMoveVertically) mov).increaseVerticalSpeed((Math.random() * 10) - 5);
		}
	}

	public static void main(String[] args) {
		List<Movable> passengerFleet = new ArrayList<>();

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

		for (int ii = 0; ii < 100; ii++) {
			for (Movable mov : passengerFleet) {
				System.out.println(mov.toString());
				increaseSpeedByRandom(mov);
			}
		}
	}

}
