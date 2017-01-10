package uebung04_Farm;

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
		if (this.isHungry()) {
			this.setHungry(false);
		} else {
			this.setHungry(true);
		}
	}

	public Boolean isHungry() {
		return hungry;
	}

	public void setHungry(Boolean hungry) {
		this.hungry = hungry;
	}
	
	void hunger(){
		this.setHungry(true);
	}
	
	Calf giveBirth(String nameCalf){
		return new Calf(nameCalf ,this.name);
		
	}

}
