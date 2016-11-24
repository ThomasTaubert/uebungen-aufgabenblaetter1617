package aufgabenblatt2;

public class Euler {
	
	//Gute Lösung für myExp :) Bei der Implementierung der schnelleren Variante scheint 
	//es Unklarheiten zu geben - ich werde zeitnah eine Musterlösung in das Repository stellen.

	public static void main(String[] args) {

		for (int ii = 0; ii < 20; ii++) {
			System.out.println(myExp(1, ii) + "; fast:" + myExpFast(1, ii));
		}

		// System.out.println(myExp(1,3) + "; " + myExpFast(1));
	}

	public static double myExp(int x, int n) {
		double result = 0;
		for (int ii = 0; ii <= n; ii++) {
			result += (Math.pow(x, ii) / fakultaet(ii));
		}
		return result;
	}

	static long fakultaet(int i) {
		long fakultaet = 1;
		for (int ii = 1; ii < i; ii++) {
			fakultaet *= (ii + 1);
		}
		;			//unnötig
		return fakultaet;
	}

	public static double myExpFast(int x, int n) {
		// TODO beschleunige myExp()
		double result = 1;
		return -1.;
//		for (int ii=0; ii<=n;ii++){
//			result+=
//		}
//		if (n > 1) {
//			return myExpFast(x, n - 1);
//		} else {
//			return 1.;
//		}
	}

}
