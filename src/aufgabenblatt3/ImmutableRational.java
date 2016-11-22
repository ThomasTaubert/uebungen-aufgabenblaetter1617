package aufgabenblatt3;

final class ImmutableRational extends Rational {

	ImmutableRational(int zaehler, int nenner) {
		super(zaehler, nenner);
	}

	Rational reduceReturn() {
		int ggt = ggt(this.getZaehler(), this.getNenner());
		return new Rational(this.getZaehler() / ggt, this.getNenner() / ggt);
	}

}
