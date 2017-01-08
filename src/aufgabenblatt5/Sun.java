package aufgabenblatt5;

public final class Sun extends GalaxyElement {

	/**
	 * Konstruktoren
	 */
	public Sun(String name) {
		super(name);
	}

	public Sun(String name, Double size, Double locationX, Double locationY) {
		super(name, size, locationX, locationY);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
			return "Sun [name=" + this.getName() + ", size=" + this.getSize() + ", locX=" + this.getLocX() + ", locY="
				+ this.getLocY() + "]";
	}
}
