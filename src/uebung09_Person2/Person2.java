package uebung09_Person2;

import java.util.HashMap;
import java.util.Map;

class Person2 implements Comparable<Person2>{
	private String name;
	private Integer alter;
	private boolean hungry = true;
	
	@Override
	public int compareTo(Person2 pers2){
		if( this.getAlter()< pers2.getAlter()){
			return -1;
			}
		else if (this.getAlter()== pers2.getAlter()){
				return 0;
			} 
			else {return 1;
		}
	}

	public Person2(String name) {
		this.setName(name);
		this.setAlter(1);
	}

	public Person2(String name, Integer alter) {
		this.setName(name);
		this.setAlter(alter);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		this.alter = alter;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public void birthday() {
		this.setAlter(this.getAlter() + 1);
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Alter: " + this.getAlter() + ", Hunger: " + this.isHungry();
	}

	public static void main(String[] args) {

		Person2 Maier = new Person2("Herr Maier");
		Person2 Schmidt = new Person2("Frau Schmidt", 15);
		Person2 Taubert = new Person2("Thomas Taubert", 22);
		Person2 Vivien = new Person2("Vivien", 20);
		Person2 Anja = new Person2("Anja");

		Map<String, Person2> persons = new HashMap();

		persons.put(Maier.getName(), Maier);
		persons.put(Schmidt.getName(), Schmidt);
		persons.put(Taubert.getName(), Taubert);
		persons.put(Vivien.getName(), Vivien);
		persons.put(Anja.getName(), Anja);

		System.out.println(persons.size());

		persons.get("Vivien").setHungry(false);
		System.out.println(persons.get("Vivien").isHungry());

		for (Person2 pers : persons.values()) {
			System.out.println(pers.toString());
		}

		System.out.println(persons.get("Frau Schmidt"));
		persons.remove("Frau Schmidt");
		System.out.println("\n" + persons.get("Frau Schmidt"));
		for (Person2 pers : persons.values()) {
			System.out.println(pers.toString());
		}

	}

}
