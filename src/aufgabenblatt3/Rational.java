package aufgabenblatt3;

class Rational {
	
	//Sehr gut. Nur wenige klitzekleine Anmerkungen (keine Fehler :) Generell als Anmerkungen, dass
	//du die setter nur bei "Zugriff von außen", z.B. innerhalb deiner main benötigst. Innerhalb der 
	//eigenen Methoden kannst du immer this.xyz=abc; verwenden, ganz ohne setter.

	public static void main(String[] args) {
		Rational rat1 = new Rational();
		rat1.printRational();
		rat1.setZaehler(4);
		rat1.printRational();
		rat1.setNenner(-3);
		rat1.printRational();
		rat1.invert();
		rat1.printRational();

		Rational rat2 = new Rational(10, 4);
		rat2.printRational();

		rat2.add(rat1);
		rat2.printRational();
		
//		Rational rat3 = new Rational();
		rat2.reduce();
		rat2.printRational();
	}

	private int zaehler;
	private int nenner;

	Rational() {
		this.setZaehler(0);	//Du kannst beim Konstruktor und innerhalb der eigenen Methoden immer
		this.setNenner(1);	// this.Nenner = ... benutzen. die setMethode ist wirklich nur für den Zugriff von außen.
	}

	Rational(int zaehler, int nenner) {
		this.setZaehler(zaehler);
		this.setNenner(nenner);
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		if (nenner >= 0) {
			this.nenner = nenner;
		} else {
			this.setNenner(-nenner);
			this.negate();
		}
	}

	void printRational() {
		System.out.println(this.getZaehler() + "/" + this.getNenner());
	}

	void negate() {
		this.setZaehler(-this.getZaehler());
	}

	void invert() {
		int xx = this.getZaehler();
		this.setZaehler(this.getNenner());
		this.setNenner(xx);
	}

	double toDouble() {
		return this.getZaehler() / this.getNenner();
	}

	void reduce() {
		int ggt= ggt(this.getZaehler(),this.getNenner());
		this.setZaehler(this.getZaehler()/ggt);
		this.setNenner(this.getNenner()/ggt);			
	}

	int ggt(int aa, int bb) {
		int rest;

		//aa und bb tauschen, sodass aa >= bb
		if (aa < bb) {
			int cc = aa;
			aa = bb;
			bb = cc;
		}

		do {
			rest = aa % bb;
			aa = bb;
			bb = rest;
		} while (rest != 0);
		return aa;
	}

	//Wenn du den Zähler zuerst setzt sparst du dir die temp Variable altNenner ;)
	void add(Rational summand) {
		int altNenner = this.getNenner();
		this.setNenner(this.getNenner() * summand.getNenner());
		this.setZaehler(this.getZaehler() * summand.getNenner() + summand.getZaehler() * altNenner);
	}
}
