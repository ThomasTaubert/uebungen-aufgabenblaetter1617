package uebung04_Farm;

class Farmer {

	static int farmerCounter = 0;
	private String name;

	Farmer(String name) {
		this.name = name;
		farmerCounter++;
	}

	String getName() {
		return this.name;
	}

	void feedCow(Cow cowName) {
		cowName.toggle();
	}



}
