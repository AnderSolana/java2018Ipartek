package com.ipartek.formacion.condicional;

import java.util.Scanner;

public class EjerciciosCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. Programa Java que lea un n�mero entero por teclado y calcule si es par o
		 * impar. Podemos saber si un n�mero es par si el resto de dividir el n�mero
		 * entre 2 es igual a cero. En caso contrario el n�mero es impar El operador
		 * Java que calcula el resto de la divisi�n entre dos n�meros enteros o no es el
		 * operador % El programa que calcula si un n�mero entero es par o impar es el
		 * siguiente:
		 * 
		 * System.out.println("Introduzca un n�mero: "); int numero = sc.nextInt(); if
		 * (numero%2==0) { System.out.println("El n�mero introducido es PAR (" + numero
		 * + ")"); }else { System.out.println("El n�mero introducido es IMPAR (" +
		 * numero + ")"); }
		 */

		/*
		 * 2. Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de
		 * 10. Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo
		 * por 10 es resto de esta divisi�n es cero.
		 * System.out.println("Introduce un n�mero: "); int numero = sc.nextInt(); if
		 * (numero%10==0) { System.out.println("El n�mero " + numero +
		 * " ES M�LTIPLO de 10"); }else { System.out.println("El n�mero " + numero +
		 * " NO ES M�LTIPLO de 10"); }
		 */

		/*
		 * 3. Programa que lea un car�cter por teclado y compruebe si es una letra
		 * may�scula System.out.println("Introduce un car�cter: "); String texto =
		 * sc.nextLine(); String textoMod = texto.toUpperCase(); if (texto.charAt(0) ==
		 * textoMod.charAt(0)) { System.out.println("El car�cter " + texto +
		 * " est� escrito en MAY�SCULA"); }else { System.out.println("El car�cter " +
		 * texto + " est� escrito en MIN�SCULA"); }
		 */

		/*
		 * Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.
		 * System.out.println("Introduce un primer caracter: "); char primero =
		 * sc.nextLine().charAt(0);
		 * 
		 * System.out.println("Introduce un segundo caracter: "); char segundo =
		 * sc.nextLine().charAt(0);
		 * 
		 * if (primero == segundo) { System.out.println("Los car�cteres son iguales: " +
		 * primero + " = " + segundo); }else {
		 * System.out.println("Los car�cteres son diferentes: " + primero + " != " +
		 * segundo); }
		 */

		/*
		 * Ejercicio 5: Programa java que lea dos caracteres por teclado y compruebe si
		 * los dos son letras min�sculas
		 * System.out.println("Introduce un primer caracter: "); char primero =
		 * sc.nextLine().charAt(0);
		 * 
		 * System.out.println("Introduce un segundo caracter: "); char segundo =
		 * sc.nextLine().charAt(0);
		 * 
		 * if (Character.isLowerCase(primero) && Character.isLowerCase(segundo)) {
		 * System.out.println("Los dos son dos letras min�sculas (" + primero + "," +
		 * segundo + ")"); }else if(Character.isLowerCase(primero)){
		 * System.out.println("S�lo el primer car�cter est� en min�scula (" + primero +
		 * "," + segundo + ")"); }else if(Character.isLowerCase(segundo)) {
		 * System.out.println("S�lo el segundo car�cter est� en min�scula (" + primero +
		 * "," + segundo + ")"); }else {
		 * System.out.println("Ninguno de los dos son letras min�sculas (" + primero +
		 * "," + segundo + ")"); }
		 */

		/*
		 * Ejercicio 6: Programa java que lea un car�cter por teclado y compruebe si es
		 * un d�gito num�rico (cifra entre 0 y 9).
		 * System.out.println("Introduce un caracter: "); char car =
		 * sc.nextLine().charAt(0); if (Character.isDigit(car)) {
		 * System.out.println("El caracter " + car + " es un n�mero entre 0-9"); }else {
		 * System.out.println("El caracter " + car + " no es un n�mero"); }
		 */

		/*
		 * Ejercicio 7: Programa que lea dos n�meros por teclado y muestre el resultado
		 * de la divisi�n del primer n�mero por el segundo. Se debe comprobar que el
		 * divisor no puede ser cero. System.out.println("Introduce el dividendo");
		 * double dividendo = sc.nextDouble();
		 * System.out.println("Introduce el divisor"); double divisor = sc.nextDouble();
		 * if (divisor != 0) { System.out.println("Resultado: " + dividendo/divisor);
		 * }else { System.out.println("El divisor no puede ser 0"); }
		 */

		/*
		 * Ejercicio 8: Calcular el mayor de tres n�meros enteros en Java. El programa
		 * lee por teclado tres n�meros enteros y calcula y muestra el mayor de los
		 * tres. System.out.println("Introduce el primer n�mero: "); int num1 =
		 * sc.nextInt(); System.out.println("Introduce el segundo n�mero: "); int num2 =
		 * sc.nextInt(); System.out.println("Introduce el tercer n�mero: "); int num3 =
		 * sc.nextInt();
		 * 
		 * if (num1 > num2 && num1 > num3) { System.out.println("El n�mero 1 (" + num1 +
		 * ") es mayor que el resto (" + num2 + "," + num3 + ")"); }else if(num2 > num1
		 * && num2 > num3) { System.out.println("El n�mero 2 (" + num2 +
		 * ") es mayor que el resto (" + num1 + "," + num3 + ")"); }else if(num3 > num1
		 * && num3 > num2) { System.out.println("El n�mero 3 (" + num3 +
		 * ") es mayor que el resto (" + num1 + "," + num2 + ")"); }
		 */

		/*
		 * Ejercicio 9: Programa que lea por teclado tres n�meros enteros H, M, S
		 * correspondientes a hora, minutos y segundos respectivamente, y comprueba si
		 * la hora que indican es una hora v�lida. Supondremos que se leemos una hora en
		 * modo 24 Horas, es decir, el valor v�lido para las horas ser� mayor o igual
		 * que cero y menor que 24. El valor v�lido para los minutos y segundos estar�
		 * comprendido entre 0 y 59 ambos incluidos
		 * 
		 * System.out.println("Introduce la hora: "); int hora = sc.nextInt();
		 * System.out.println("Introduce los minutos: "); int minutos = sc.nextInt();
		 * System.out.println("Introduce los segundos: "); int segundos = sc.nextInt();
		 * 
		 * if (hora >= 0 && hora <= 24) { if (minutos >=0 && minutos <=59) { if
		 * (segundos >=0 && segundos <=59) {
		 * System.out.println("La hora introducida es v�lida: " + hora + ":" + minutos +
		 * ":" + segundos); }else {
		 * System.out.println("Has introducido mal los segundos"); } }else {
		 * System.out.println("Has introducido mal los minutos"); }
		 * 
		 * }else { System.out.println("Has introducido mal las horas"); }
		 */

		/*
		 * Ejercicio 10: Programa que lea una variable entera mes y compruebe si el
		 * valor corresponde a un mes de 30 d�as, de 31 o de 28. Supondremos que febrero
		 * tiene 28 d�as. Se mostrar� adem�s el nombre del mes. Se debe comprobar que el
		 * valor introducido est� comprendido entre 1 y 12.
		 * System.out.println("Introduce el mes: "); int mes = sc.nextInt(); if (mes >=1
		 * && mes <= 12) {
		 * 
		 * switch (mes) { case 1: System.out.println("Enero"); break; case 2:
		 * System.out.println("Febrero"); break; case 3: System.out.println("Marzo");
		 * break; case 4: System.out.println("Abril"); break; case 5:
		 * System.out.println("Mayo"); break; case 6: System.out.println("Junio");
		 * break; case 7: System.out.println("Julio"); break; case 8:
		 * System.out.println("Agosto"); break; case 9:
		 * System.out.println("Septiembre"); break; case 10:
		 * System.out.println("Octubre"); break; case 11:
		 * System.out.println("Noviembre"); break; case 12:
		 * System.out.println("Diciembre"); break;
		 * 
		 * default: System.out.println("Mensaje por defecto"); }
		 * 
		 * if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		 * System.out.println("Es un mes de 30 d�as."); }else if (mes == 2) {
		 * System.out.println("Es un mes de 28 d�as."); }else {
		 * System.out.println("Es un mes de 31 d�as."); }
		 * 
		 * }
		 */

		sc.close();

	}

}
