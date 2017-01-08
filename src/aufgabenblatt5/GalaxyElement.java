package aufgabenblatt5;

public class GalaxyElement {
	/**
	 * Variablendeklaration mit Default-Werten
	 * 
	 * Was ist hier mit "für erbende Klassen veränderbar" gemeit sein?
	 * 
	 * Sollen (nur) diese Klassen direkt auf die Werte zugreifen können -dann
	 * default- oder sollen sie in erbenden Klassen veränderbar sein -also nicht
	 * final, aber private-?
	 */

	private Double locX = 1., locY = 1.;
	private Double size = 1.;
	private String name;

	// Getter & Setter
	public Double getLocX() {
		return locX;
	}

	public void setLocX(Double locX) {
		this.locX = locX;
	}

	public Double getLocY() {
		return locY;
	}

	public void setLocY(Double locY) {
		this.locY = locY;
	}

	public Double getSize() {
		return size;
	}

	public Double setSize(Double size) {
		if (size > 0) {
			this.size = size;
			return this.getSize();
		} else {
			return -1.;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Konstruktoren
	 */
	public GalaxyElement(String name) {
		this.setName(name);
	}

	public GalaxyElement(String name, Double size, Double locationX, Double locationY) {
		this.setName(name);
		this.setSize(size);
		this.setLocX(locationX);
		this.setLocY(locationY);
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "GalaxyElement [name=" + this.getName() + ", size=" + this.getSize() + ", locX=" + this.getLocX()
				+ ", locY=" + this.getLocY() + "]";
	}
}
