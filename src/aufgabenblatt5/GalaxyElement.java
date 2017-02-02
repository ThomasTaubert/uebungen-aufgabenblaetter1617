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
	
	//Damit ist gemeint, dass nur erbende Klassen vollen Zugriff auf die Variablen haben sollen.
	//Alle anderen sollen nur Lesezugriff über Getter bereitgestellt bekommen.
	//Der richtige access modifier dafuer ist protected (default ist package only, wuerde
	//in diesem Spezialfall, in dem alles im selben package ist, dasselbe tun - von der Theorie her aber restriktiver)

	private Double locX = 1., locY = 1.;
	private Double size = 1.;
	private String name;

	// Getter & Setter
	public Double getLocX() {
		return locX;
	}

	//Es sollten nur Getter als Zugriffsrecht implementiert werden
	//Willst du trotzdem Setter in dieser Klasse verwenden,
	//dann besser private
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
