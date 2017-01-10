package uebung03_Taschenrechner;

public class Taschenrechner {
	private double value;

	Taschenrechner() {
		this.value = 0;
	}

	void reset() {
		this.value = 0;
	}

	void set(double value) {
		this.value = value;
	}

	double getResult() {
		return this.value;
	}

	void add(double summand) {
		this.value += summand;
	}

	void substract(double subtrahend) {
		this.value -= subtrahend;
	}

	void fakultaet() {
		if (Math.round(this.value) == this.value) {
			this.value = fak((int) this.value);
		} else {
			this.value = -1;
		}
	}

	int fak(int n) {
		if (n >= 0) {
			if (n > 1) {
				return fak(n - 1) * n;
			} else
				return 1;
		} else {
			return -1;
		}

	}

	void sqrt() {
		this.value = Math.sqrt(this.value);
	}

	public static void main(String[] args) {
		Taschenrechner t = new Taschenrechner();
		t.add(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		System.out.println("Ergebnis: " + t.getResult());
		t.add(10);
		System.out.println("Ergebnis: " + t.getResult());
		t.substract(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.fakultaet();
		System.out.println("Ergebnis: " + t.getResult());
		t.set(16);
		t.sqrt();
		System.out.println("Ergebnis: " + t.getResult());
	}
}
