package uebung08_Person;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private Integer alter;

	public Person(String name) {
		this.setName(name);
		this.setAlter(1);
	}

	public Person(String name, Integer alter) {
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

	public void birthday() {
		this.setAlter(this.getAlter() + 1);
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Alter: " + this.getAlter();
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		Person Maier = new Person("Herr Maier");
		Person Schmidt = new Person("Frau Schmidt", 15);
		Person Taubert = new Person("Thomas Taubert", 22);
		Person Vivien = new Person("Vivien", 20);
		Person Anja = new Person("Anja");

		persons.add(Maier);
		persons.add(Schmidt);
		persons.add(Taubert);
		for (Person pers : persons) {
			System.out.println(pers);
		}

		persons.add(1, Vivien);
		persons.add(persons.size(), Anja);

		for (Person pers : persons) {
			System.out.println(pers);
		}

		// System.out.println(persons.isEmpty());
		// persons.clear();
		System.out.println(persons.isEmpty());

		System.out.println(persons.contains(Taubert));
		persons.remove(Taubert);
		System.out.println(persons.indexOf(Schmidt));
		persons.remove(persons.indexOf(Schmidt));

		for (Person pers : persons) {
			System.out.println(pers);
		}

	}

}
