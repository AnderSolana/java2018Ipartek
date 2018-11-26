package com.ipartek.formacion.secuencial;

import java.util.Scanner;

public class EjerciciosSecuencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1.      Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		/*System.out.println("Introduce un número por pantalla: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce un segundo número por pantalla");
		int num2 = sc.nextInt();
		
		System.out.println("Has introducido los números " + num1 + " y " + num2);*/
		
		//2.      Programa Java que lea un nombre y muestre por pantalla:
		//	“Buenos dias nombre_introducido”
		/*System.out.println("Introduce un nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Buenos dias " + nombre);*/
		
		//3.      Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por
		//pantalla el doble y el triple de ese número.
		/*System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		System.out.println("Doble del número: " + numero * 2);
		System.out.println("Triple del número: " + numero * 3);*/
		
		//Ejercicio 4:
		//Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
		//La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		//F = 32 + ( 9 * C / 5)
		/*System.out.println("Introduce los grados centígrados: ");
		float centigrados = sc.nextFloat();
		System.out.println("Grados Fahrenheit: " + (32 + ((9 * centigrados) / 5)));*/
		
		//Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula
		//y muestra por pantalla la longitud y el área de la circunferencia. 
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		/*System.out.println("Introduce el radio de una circunferencia: ");
		int radio = sc.nextInt();
		System.out.println("Longitud: " + (2 * Math.PI * radio));
		System.out.println("Area: " + (Math.pow((Math.PI * radio ), 2)));*/
		
		//Ejercicio 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		/*System.out.println("Introduzca la velocidad en Km/h: ");
		int velocidad = sc.nextInt();
		System.out.println("La velocidad en m/s es: " + (velocidad/3.6));*/
		
		//Ejercicio 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la 
		//longitud de la hipotenusa según el teorema de Pitágoras.
		/*System.out.println("Introduzca el primer cateto del triángulo: ");
		int cat1 = sc.nextInt();
		System.out.println("Introduzca el segundo cateto del triángulo: ");
		int cat2 = sc.nextInt();
		double hipotenusa = Math.pow(cat1, 2) + Math.pow(cat2, 2);
		hipotenusa = Math.sqrt(hipotenusa);
		System.out.println("La longitud de la hipotenusa es " + hipotenusa);*/
		
		/*Ejercicio 8: Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera y 
		 nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
		 La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		System.out.println("v = " + (4/3) * Math.PI * Math.pow(numero, 3));
		*/
		
		/*Ejercicio 9: Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula:  
		Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
		donde p =  (a+b+c)/2
		Para calcular la raíz cuadrada se utiliza el método Math.sqrt() 
		System.out.println("Introduce el primer lado: ");
		int ladoA = sc.nextInt();
		System.out.println("Introduce el segundo lado: ");
		int ladoB = sc.nextInt();
		System.out.println("Introduce el tercer lado: ");
		int ladoC = sc.nextInt();
		int p = (ladoA + ladoB + ladoC)/2;
		System.out.println(Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));
		*/
		
		/*Ejercicio 10: Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
		System.out.println("Introduce un número de 3 cifras: ");
		int numero = sc.nextInt();
		String numeroSt = String.valueOf(numero);
		System.out.println("Cifra 1: " + numeroSt.charAt(0));
		System.out.println("Cifra 2: " + numeroSt.charAt(1));
		System.out.println("Cifra 3: " + numeroSt.charAt(2));
		*/
		
		/*Ejercicio 11:
		Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
		Por ejemplo para un número N = 12345   La salida debe ser:
		1
		12
		123
		1234
		12345
		System.out.println("Introduce un número de 5 cifras: ");
		int numero = sc.nextInt();
		String texto = "";
		String numeroSt = String.valueOf(numero);
		for(int i = 0; i < numeroSt.length(); i++) {
			texto = texto + String.valueOf(numeroSt.charAt(i));
			System.out.println(texto);
		}
		*/
		
		/*Ejercicio 12:
		Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
		Por ejemplo para un número N = 12345    La salida debe ser:
		
		5
		45
		345
		2345
		12345
		System.out.println("Introduce un número de 5 cifras: ");
		int numero = sc.nextInt();
		String texto = "";
		String numeroSt = String.valueOf(numero);
		for(int i = 4; i >= 0; i--) {
			texto = String.valueOf(numeroSt.charAt(i)) + texto;
			System.out.println(texto);
		}
		*/
		
		/*Ejercicio 13:
			Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
			El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
			Por ejemplo:
			Si la fecha de nacimiento es 12/07/1980 
			Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
			Número de la suerte: 28
		System.out.println("Introduce tu fecha de nacimiento: ");
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el año: ");
		int anio = sc.nextInt();
		int suma = dia + mes + anio;
		String numeroS = String.valueOf(suma);
		int suerte = 0;
		for(int i = 0; i < numeroS.length(); i++) {
			suerte = suerte + Integer.parseInt(String.valueOf(numeroS.charAt(i)));
			if (i == numeroS.length() - 1) {
				System.out.print(String.valueOf(numeroS.charAt(i) + " = " + suerte));
			}else {
				System.out.print(String.valueOf(numeroS.charAt(i)) + " + ");
			}
			
		}
		*/
		
		
		
		
		
		sc.close();

	}

}
