package uebung4;

class Cow {

	static int cowCounter = 0;
	private String name;
	private Boolean hungry = false;

	Cow(String name) {
		this.name = name;
		cowCounter++;
	}

	String getName() {
		return this.name;
	}

	void toggle() {
		if (this.getHungry()) {
			this.setHungry(false);
		} else {
			this.setHungry(true);
		}
	}

	public Boolean getHungry() {
		return hungry;
	}

	public void setHungry(Boolean hungry) {
		this.hungry = hungry;
	}
	
	void hunger(){
		this.setHungry(true);
	}
	
	void giveBirth(String nameCalf){
		Calf calf1 = new Calf(nameCalf ,this.name);
		
	}

}
