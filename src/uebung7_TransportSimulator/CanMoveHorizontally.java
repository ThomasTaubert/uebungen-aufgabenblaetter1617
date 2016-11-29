package uebung7_TransportSimulator;

public interface CanMoveHorizontally extends Movable {
	public void increaseHorizontalSpeed(double by);

	public void turnBy(double radians);
}
