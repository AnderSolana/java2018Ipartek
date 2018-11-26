package javase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase de ejemplo de inicio de Java
 * 
 * @author Curso
 *
 */

public class HolaMundo {
	/**
	 * Método principal que muestra el texto "Hola Mundo"
	 * 
	 * @param args Argumentos de consola recibidos en un array
	 */
	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		// ctrl - mayus - 7 ó ctrl - mayus

		// TIPOS PRIMITIVOS

		// Enteros TODOS CON SIGNO
		@SuppressWarnings("unused")
		byte b; // 8 bits -128 a 127
		@SuppressWarnings("unused")
		short s; // 16 bits -32768 a 32767
		int i; // 32 bits -2000M a 2000M
		@SuppressWarnings("unused")
		long l; // 64 bits trillones

		i = 5;
		System.out.println("El valor de i es " + i);

		// COMA FLOTANTE SIGNO | EXPONENTE | MANTISA (signo * mantisa * 2 ^ exponente)
		@SuppressWarnings("unused")
		float f; // 32 bits
		double d; // 64 bits

		d = 5.3E7; // 5000E-3 != 5 NUNCA COMPARAR IGUALDAD ENTRE NÚMEROS DE COMA FLOTANTE

		System.out.println(d);

		// BOOLEANO SÓLO PUEDEN VALER true O false
		@SuppressWarnings("unused")
		boolean bool;

		bool = true; // false

		// CHARACTER
		@SuppressWarnings("unused")
		char c;

		c = 'l';

		// FIN DE TIPOS PRIMITIVOS (8)

		// Clases equivalentes a los tipos primitivos
		// Byte, Short, Integer, Long, Float, Double, Boolean, Character

		// OPERADORES
		// Matemáticos + - * / %

		int resto = 5 % 3; // El resto de dividir 5 / 3 es 2

		System.out.println(resto);

		// Comparaciones: ==, !=, <, >, <=, >=

		int x = 5;
		System.out.println(x == 3);

		System.out.println(x);

		// Operadores lógicos: &&, ||, !

		System.out.println(!(1 <= x && x <= 10));

		System.out.println(1 > x || x > 10);

		// Operadores a nivel de bits: &, |, ~, ^
		x = 5 ^ 2; // XOR

		System.out.println(x);

		// Operadores de asignación: =, +=, -=, *=, /= ...

		int y = x = 2;

		y += 5; // y = y + 5

		// Incremento decremento (--, ++)
		y = 1;

		System.out.println(++y); // PREincremento
		System.out.println(y++); // POSTincremento

		// Operador condicional ? :
		int num1 = 5, num2 = 10;
		int max = num1 > num2 ? num1 : num2;

		System.out.println("Maximo: " + max);

		// Sentencias de control

		boolean estaArrancado = false;

		if (estaArrancado) {
			System.out.println("Verdadero");
		} else {
			System.out.println("Falso");
		}

		// if, switch, while, do while, for
		for (int indice = 0; indice <= 10; indice++) {
			System.out.println(indice);
		}

		// break: rompe el bucle, continue: sigue con el
		for (int indice = 0; indice <= 10; indice++) {
			if (indice % 3 == 0) {
				continue; // break;
			}

			System.out.println(indice);
		}

		// Tipos de datos básicos
		String nombre = "Ander Solana";

		System.out.println("Mi nombre es " + nombre);

		if (nombre.equals("Ander")) {
			System.out.println("Está bien");
		} else {
			System.out.println("No está bien");
		}

		System.out.println("                ñasas asasas asfsdf gffsg er g            ".trim());

		// ARRAYS
		String[] arr = new String[2];

		arr[0] = "Texto1";
		arr[1] = "Texto2"; // arr[2] = "Texto3";

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

		for (String texto : arr) { // Obtiene todos los datos del array //Java5
			System.out.println(texto);
		}

		// Leer de teclado
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu email: ");
		String email = sc.nextLine();

		System.out.println(email);

		sc.close();

		// Conversiones
		String sEntero = "5";
		int entero = Integer.parseInt(sEntero);

		String sDoblePrecision = "5.3";
		double doblePrecision = Double.parseDouble(sDoblePrecision);

		long largo = 5L;
		String sLargo = String.valueOf(largo);

		float fVariable = 5.3F;
		String variable = String.valueOf(fVariable);

		entero = (int) fVariable;

		// Funciones matemáticas
		double seno = Math.sin(5.3);
		System.out.println("Seno: " + seno);

		// Vuelta de marcador
		int grande = Integer.MAX_VALUE;
		System.out.println(grande);

		System.out.println(++grande);

		// Colecciones (en el ejemplo ArrayList)
		ArrayList<String> textos = new ArrayList<String>();

		textos.add("UNO");
		textos.add("DOS");
		textos.add("TRES");

		System.out.println(textos.get(0));

		textos.set(2, "MODIFICADO");

		textos.remove(1);

		for (String texto : textos) {
			System.out.println(texto);
		}

	}

}
