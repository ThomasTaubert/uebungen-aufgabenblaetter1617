package musterLoesungen.aufgabenblatt3;

class ImmutableRational {

	public static void main(String[] args) {
		ImmutableRational r = new ImmutableRational(6, 4);
		r.printRational();
		r.reduce().printRational();
		r.add(new ImmutableRational(3, 8)).printRational();
		r.invert().printRational();
		r.negate().printRational();
	}
	private int zaehler;

	private int nenner;

	public ImmutableRational() {
		zaehler = 0;
		nenner = 1;
	}

	public ImmutableRational(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	private ImmutableRational add(ImmutableRational r) {
		int zaehler = this.zaehler * r.nenner + (r.zaehler * this.nenner);
		int nenner = this.nenner * r.nenner;
		return new ImmutableRational(zaehler, nenner);
	}

	private int ggt(int a, int b) {
		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a > b) {
			return ggt(a - b, b);
		} else {
			return ggt(a, b - a);
		}
	}

	private ImmutableRational invert() {
		return new ImmutableRational(this.nenner, this.zaehler);
	}

	private ImmutableRational negate() {
		return new ImmutableRational(this.zaehler * -1, this.nenner);
	}

	private void printRational() {
		System.out.println(zaehler + "/" + nenner);
	}

	private ImmutableRational reduce() {
		int ggT = ggt(zaehler, nenner);
		return new ImmutableRational(zaehler / ggT, nenner / ggT);
	}

	private double toDouble() {
		return (double) zaehler / nenner;
	}
}
