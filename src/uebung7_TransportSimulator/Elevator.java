package uebung7_TransportSimulator;

public class Elevator implements CanMoveVertically {
	private double verticalSpeed;
	private double z;
	private String name;

	public Elevator(String name, double z) {
		this.setName(name);
		this.setZ(z);
		this.setVerticalSpeed(0);
	}
	public double getVerticalSpeed() {
		return verticalSpeed;
	}

	public void setVerticalSpeed(double verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public void increaseVerticalSpeed(double by) {
		this.setVerticalSpeed(this.getVerticalSpeed() + by);

	}

	@Override
	public void move() {
		this.setZ(this.getZ() + this.getVerticalSpeed());

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Typ:Elevator; Name:" + this.getName() + "; Höhe:" + this.getZ();
	}
}
