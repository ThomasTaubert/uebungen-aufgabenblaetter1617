package uebung7_TransportSimulator;

public class Helicopter implements CanMoveVertically, CanMoveHorizontally {
	private double x, y, z;
	private double speedHorizontal, speedVertical;
	private double direction;
	private String name;

	public Helicopter(String name, double x, double y, double z) {
		this.setName(name);
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setSpeedHorizontal(0);
		this.setSpeedVertical(0);
		this.setDirection(0);
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getSpeedHorizontal() {
		return speedHorizontal;
	}

	public void setSpeedHorizontal(double speedHorizontal) {
		this.speedHorizontal = speedHorizontal;
	}

	public double getSpeedVertical() {
		return speedVertical;
	}

	public void setSpeedVertical(double speedVertical) {
		this.speedVertical = speedVertical;
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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		this.setZ(this.getZ() + this.getSpeedVertical());
		this.setX(this.getX() + Math.cos(this.getDirection()));
		this.setY(this.getY() + Math.sin(this.getDirection()));
		if (this.getZ()<0){
			this.setZ(0);
			this.setSpeedHorizontal(0);
			this.setSpeedVertical(0);
			System.err.println("Helicopter made securitylanding.");
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		this.setSpeedHorizontal(this.getSpeedHorizontal() + by);

	}

	@Override
	public void turnBy(double radians) {
		this.setDirection(this.getDirection() + radians);
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		this.setSpeedVertical(this.getSpeedVertical() + by);
	}

	@Override
	public String toString() {
		return "Typ:Helicopter; Name:" + this.getName() + "; PositionX:" + this.getX() + "; PositionY:" + this.getY()
				+ "; PositionZ:" + this.getZ() + "; Direction:" + this.getDirection() + "; SpeedHorizontal:"
				+ this.getSpeedHorizontal() + "; SpeedVertical:" + this.getSpeedVertical();
	}

}
