package javase;

import static java.lang.Math.*; // Nos ahorramos tener que poner Math. antes de utilizar sus métodos.

public class Recursividad {

	public static void main(String[] args) {
		// System.out.println("5! = " + factorial(20));

		Recursividad r = new Recursividad();

		System.out.println(r.factorial(20));

		System.out.println(sin(5));
	}

	private long factorial(long num) {
		if (num == 1) {
			return 1;
		}

		return num * factorial(num - 1);
	}

}
