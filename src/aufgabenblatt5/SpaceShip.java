package aufgabenblatt5;

public final class SpaceShip extends GalaxyElement implements Moveable, Destroyable {
	/**
	 * Variablendefinition
	 */
	private Double speedX = 1., speedY = 1.;
	private Double energy = 100.;

	/**
	 * Getter und Setter
	 */
	public Double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(Double speedX) {
		this.speedX = speedX;
	}

	public Double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(Double speedY) {
		this.speedY = speedY;
	}

	public Double getEnergy() {
		return energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	/**
	 * Konstruktoren
	 */
	public SpaceShip(String name) {
		super(name);
	}

	public SpaceShip(String name, Double size, Double locationX, Double locationY) {
		super(name, size, locationX, locationY);
	}

	public SpaceShip(String name, Double size, Double locationX, Double locationY, Double SpeedX, Double SpeedY) {
		super(name, size, locationX, locationY);
		this.setSpeedX(SpeedX);
		this.setSpeedY(SpeedY);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "SpaceShip [name=" + this.getName() + ", size=" + this.getSize() + ", locX=" + this.getLocX() + ", locY="
				+ this.getLocY() + ", speedX=" + this.getSpeedX() + ", speedY=" + this.getSpeedY() + ", energy="
				+ this.getEnergy() + "]";
	}

	/**
	 * Moveable
	 */
	@Override
	public void move() {
		this.setLocX(this.getLocX() + this.getSpeedX());
		this.setLocY(this.getLocY() + this.getSpeedY());
		System.out.println("move SpaceShip " + this.getName());
	}

	/**
	 * Destroyable
	 */
	@Override
	public void hit(double power) {
		this.setEnergy(this.getEnergy() - power);
	}

	@Override
	public boolean isDestroyed() {
		if (this.getEnergy() > 0) {
			return false;
		} else {
			return true;
		}
	}

}
