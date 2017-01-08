package aufgabenblatt5;

public final class Planet extends GalaxyElement implements Moveable {
	/**
	 * Variablendefinition Erweiterung
	 */
	private Sun sun;
	private Double distanceSun = -1.;
	private final Double angleSpeed = Math.PI / 4;
	private Double angle = 0.;

	/**
	 * Getters/Setters
	 */
	public Sun getSun() {
		return sun;
	}

	public void setSun(Sun sun) {
		this.sun = sun;
	}

	public Double getDistanceSun() {
		return distanceSun;
	}

	public Double setDistanceSun(Double distanceSun) {
		if (distanceSun > 0) {
			this.distanceSun = distanceSun;
			return this.getDistanceSun();
		} else {
			return -1.;
		}
	}

	public Double getAngle() {
		return angle;
	}

	public void setAngle(Double angle) {
		// Winkel auf Wertebereich 0..2PI korrigieren
		while (angle > 2 * Math.PI) {
			angle = angle - 2 * Math.PI;
		}
		while (angle < 0) {
			angle = angle + 2 * Math.PI;
		}
		this.angle = angle;
	}

	public Double getAngleSpeed() {
		return angleSpeed;
	}

	/**
	 * Konstruktoren
	 */
	public Planet(String name, Sun sun) {
		super(name);
		this.setSun(sun);
	}

	public Planet(String name, Sun sun, Double size, Double distance) {
		// Position immer rechts von Sonne
		super(name, size, sun.getLocX() + distance, sun.getLocY());
		this.setSun(sun);
		this.setDistanceSun(distance);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Planet [name=" + this.getName() + ", size=" + this.getSize() + ", locX=" + this.getLocX() + ", locY="
				+ this.getLocY() + ", angle=" + this.getAngle() + ", distance=" + this.getDistanceSun() + ", Sonne="
				+ this.getSun() + "]";
	}

	/**
	 * Moveable
	 */
	public void move() {
		// prüfen, ob sich Planet an richtiger Position befindet
		// if (this.getLocX() == this.getSun().getLocX() + this.getDistanceSun()
		// * Math.sin(this.getAngle())
		// && this.getLocY() == this.getSun().getLocY() + this.getDistanceSun()
		// * Math.cos(this.getAngle())) {
		// //Winkel weitersetzen
		this.setAngle(this.getAngle() + this.getAngleSpeed());

		// neue Position setzen
		this.setLocX(this.getSun().getLocX() + this.getDistanceSun() * Math.sin(this.getAngle()));
		this.setLocY(this.getSun().getLocY() + this.getDistanceSun() * Math.cos(this.getAngle()));

		// Meldung ausgeben
		System.out.println("move Planet " + this.getName());
		// } else{
		// System.out.println("Fehler: Planet "+this.getName()+" befindet sich
		// nicht an Soll-Position.");
		// }
	}
}
