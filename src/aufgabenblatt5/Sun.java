package aufgabenblatt5;

public final class Sun extends GalaxyElement {
	
	//Richtig (kleine Anmkerkung unten)

	/**
	 * Konstruktoren
	 */
	public Sun(String name) {
		super(name);
	}

	public Sun(String name, Double size, Double locationX, Double locationY) {
		super(name, size, locationX, locationY);
	}
	
	//hier sollte noch die toString-Methode der Oberklasse aufgerufen werden, 
	//dann haettest du ein wenig Code Dopplung gespart

	/**
	 * toString
	 */
	@Override
	public String toString() {
			return "Sun [name=" + this.getName() + ", size=" + this.getSize() + ", locX=" + this.getLocX() + ", locY="
				+ this.getLocY() + "]";
	}
}
