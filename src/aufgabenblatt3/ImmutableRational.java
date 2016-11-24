package aufgabenblatt3;

final class ImmutableRational extends Rational {
	
	//Nette Idee aber nicht ganz richtig ;)
	//Die vererbte Klasse besitzt immer noch die Setter, die eine Veränderung zulassen.
	//Außerdem sollen in dieser Klasse auch die Methoden negate und invert ein neues Rational Objekt
	//zurückgeben.

	ImmutableRational(int zaehler, int nenner) {
		super(zaehler, nenner);
	}

	Rational reduceReturn() {
		int ggt = ggt(this.getZaehler(), this.getNenner());
		return new Rational(this.getZaehler() / ggt, this.getNenner() / ggt);
	}

}
