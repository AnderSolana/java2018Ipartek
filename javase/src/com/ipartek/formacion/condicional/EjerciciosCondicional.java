package com.ipartek.formacion.condicional;

import java.util.Scanner;

public class EjerciciosCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. Programa Java que lea un número entero por teclado y calcule si es par o
		 * impar. Podemos saber si un número es par si el resto de dividir el número
		 * entre 2 es igual a cero. En caso contrario el número es impar El operador
		 * Java que calcula el resto de la división entre dos números enteros o no es el
		 * operador % El programa que calcula si un número entero es par o impar es el
		 * siguiente:
		 * 
		 * System.out.println("Introduzca un número: "); int numero = sc.nextInt(); if
		 * (numero%2==0) { System.out.println("El número introducido es PAR (" + numero
		 * + ")"); }else { System.out.println("El número introducido es IMPAR (" +
		 * numero + ")"); }
		 */

		/*
		 * 2. Programa que lea un número entero y muestre si el número es múltiplo de
		 * 10. Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo
		 * por 10 es resto de esta división es cero.
		 * System.out.println("Introduce un número: "); int numero = sc.nextInt(); if
		 * (numero%10==0) { System.out.println("El número " + numero +
		 * " ES MÚLTIPLO de 10"); }else { System.out.println("El número " + numero +
		 * " NO ES MÚLTIPLO de 10"); }
		 */

		/*
		 * 3. Programa que lea un carácter por teclado y compruebe si es una letra
		 * mayúscula System.out.println("Introduce un carácter: "); String texto =
		 * sc.nextLine(); String textoMod = texto.toUpperCase(); if (texto.charAt(0) ==
		 * textoMod.charAt(0)) { System.out.println("El carácter " + texto +
		 * " está escrito en MAYÚSCULA"); }else { System.out.println("El carácter " +
		 * texto + " está escrito en MINÚSCULA"); }
		 */

		/*
		 * Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.
		 * System.out.println("Introduce un primer caracter: "); char primero =
		 * sc.nextLine().charAt(0);
		 * 
		 * System.out.println("Introduce un segundo caracter: "); char segundo =
		 * sc.nextLine().charAt(0);
		 * 
		 * if (primero == segundo) { System.out.println("Los carácteres son iguales: " +
		 * primero + " = " + segundo); }else {
		 * System.out.println("Los carácteres son diferentes: " + primero + " != " +
		 * segundo); }
		 */

		/*
		 * Ejercicio 5: Programa java que lea dos caracteres por teclado y compruebe si
		 * los dos son letras minúsculas
		 * System.out.println("Introduce un primer caracter: "); char primero =
		 * sc.nextLine().charAt(0);
		 * 
		 * System.out.println("Introduce un segundo caracter: "); char segundo =
		 * sc.nextLine().charAt(0);
		 * 
		 * if (Character.isLowerCase(primero) && Character.isLowerCase(segundo)) {
		 * System.out.println("Los dos son dos letras minúsculas (" + primero + "," +
		 * segundo + ")"); }else if(Character.isLowerCase(primero)){
		 * System.out.println("Sólo el primer carácter está en minúscula (" + primero +
		 * "," + segundo + ")"); }else if(Character.isLowerCase(segundo)) {
		 * System.out.println("Sólo el segundo carácter está en minúscula (" + primero +
		 * "," + segundo + ")"); }else {
		 * System.out.println("Ninguno de los dos son letras minúsculas (" + primero +
		 * "," + segundo + ")"); }
		 */

		/*
		 * Ejercicio 6: Programa java que lea un carácter por teclado y compruebe si es
		 * un dígito numérico (cifra entre 0 y 9).
		 * System.out.println("Introduce un caracter: "); char car =
		 * sc.nextLine().charAt(0); if (Character.isDigit(car)) {
		 * System.out.println("El caracter " + car + " es un número entre 0-9"); }else {
		 * System.out.println("El caracter " + car + " no es un número"); }
		 */

		/*
		 * Ejercicio 7: Programa que lea dos números por teclado y muestre el resultado
		 * de la división del primer número por el segundo. Se debe comprobar que el
		 * divisor no puede ser cero. System.out.println("Introduce el dividendo");
		 * double dividendo = sc.nextDouble();
		 * System.out.println("Introduce el divisor"); double divisor = sc.nextDouble();
		 * if (divisor != 0) { System.out.println("Resultado: " + dividendo/divisor);
		 * }else { System.out.println("El divisor no puede ser 0"); }
		 */

		/*
		 * Ejercicio 8: Calcular el mayor de tres números enteros en Java. El programa
		 * lee por teclado tres números enteros y calcula y muestra el mayor de los
		 * tres. System.out.println("Introduce el primer número: "); int num1 =
		 * sc.nextInt(); System.out.println("Introduce el segundo número: "); int num2 =
		 * sc.nextInt(); System.out.println("Introduce el tercer número: "); int num3 =
		 * sc.nextInt();
		 * 
		 * if (num1 > num2 && num1 > num3) { System.out.println("El número 1 (" + num1 +
		 * ") es mayor que el resto (" + num2 + "," + num3 + ")"); }else if(num2 > num1
		 * && num2 > num3) { System.out.println("El número 2 (" + num2 +
		 * ") es mayor que el resto (" + num1 + "," + num3 + ")"); }else if(num3 > num1
		 * && num3 > num2) { System.out.println("El número 3 (" + num3 +
		 * ") es mayor que el resto (" + num1 + "," + num2 + ")"); }
		 */

		/*
		 * Ejercicio 9: Programa que lea por teclado tres números enteros H, M, S
		 * correspondientes a hora, minutos y segundos respectivamente, y comprueba si
		 * la hora que indican es una hora válida. Supondremos que se leemos una hora en
		 * modo 24 Horas, es decir, el valor válido para las horas será mayor o igual
		 * que cero y menor que 24. El valor válido para los minutos y segundos estará
		 * comprendido entre 0 y 59 ambos incluidos
		 * 
		 * System.out.println("Introduce la hora: "); int hora = sc.nextInt();
		 * System.out.println("Introduce los minutos: "); int minutos = sc.nextInt();
		 * System.out.println("Introduce los segundos: "); int segundos = sc.nextInt();
		 * 
		 * if (hora >= 0 && hora <= 24) { if (minutos >=0 && minutos <=59) { if
		 * (segundos >=0 && segundos <=59) {
		 * System.out.println("La hora introducida es válida: " + hora + ":" + minutos +
		 * ":" + segundos); }else {
		 * System.out.println("Has introducido mal los segundos"); } }else {
		 * System.out.println("Has introducido mal los minutos"); }
		 * 
		 * }else { System.out.println("Has introducido mal las horas"); }
		 */

		/*
		 * Ejercicio 10: Programa que lea una variable entera mes y compruebe si el
		 * valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero
		 * tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el
		 * valor introducido esté comprendido entre 1 y 12.
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
		 * System.out.println("Es un mes de 30 días."); }else if (mes == 2) {
		 * System.out.println("Es un mes de 28 días."); }else {
		 * System.out.println("Es un mes de 31 días."); }
		 * 
		 * }
		 */

		sc.close();

	}

}
