package uebung7_TransportSimulator;

public class Ship implements CanMoveHorizontally {
	private String name;
	private double x, y;
	private double direction;
	private double speed;

	public Ship(String name, double x, double y) {
		this.setName(name);
		this.setX(x);
		this.setY(y);
		this.setDirection(0);
		this.setSpeed(0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		while (direction < 0) {
			direction += 2 * Math.PI;
		}
		while (direction > 2 * Math.PI) {
			direction -= 2 * Math.PI;
		}
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		this.setX(this.getX() + Math.cos(this.getDirection()));
		this.setY(this.getY() + Math.sin(this.getDirection()));
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		this.setSpeed(this.getSpeed() + by);
	}

	@Override
	public void turnBy(double radians) {
		this.setDirection(this.getDirection() + radians);

	}

	@Override
	public String toString() {
		return "Typ:Ship; Name:" + this.getName() + "; PositionX:" + this.getX() + "; PositionY:" + this.getY()
				+ "; Direction:" + this.getDirection() + "; Speed:" + this.getSpeed();
	}
}
