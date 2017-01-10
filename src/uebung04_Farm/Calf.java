package uebung04_Farm;

class Calf extends Cow {
	private String mother;
	
	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	Calf(String name, String mother){
		super (name);
		this.setMother(mother);
	}
}
