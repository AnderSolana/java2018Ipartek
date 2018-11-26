package com.ipartek.formacion.generales;

import java.util.Scanner;

public class EjerciciosGenerales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * Programa que lea dos variables 
		 * numéricas A y B e 
		 * intercambie sus contenidos. 
		 
		
		int num1 = 5; 
		int num2 = 2; 
		int aux = 0;
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		aux = num1;
		num1=num2;
		num2=aux;
		aux=0;
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		*/
		
		/* 
		 * Programa que intercambie dos variables sin auxiliar
		 
		int num1 = 5; 
		int num2 = 2; 
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		num1=num1 + num2;
		num2=num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		*/
		
		/*Programa Java que pide un número entero por teclado y calcula y muestra el número de cifras que tiene.
		Por ejemplo si se introduce el número 54391 el programa mostrará el mensaje:
		El número tiene 5 cifras
		System.out.println("Introduce un número: ");
		String texto = sc.nextLine();
		System.out.println("Es un número de " + texto.length() + " cifras");
		*/
		
		/*Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin. 
		El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
		Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
		ºK = ºC + 273
			System.out.println("Introduce la temperatura en centígrados");
			Double temperatura = sc.nextDouble();
			sc.nextLine();
			System.out.println("ºK = " + (temperatura + 273));
			for(int i = 0; i <= 1000; i++) {
				System.out.println("Repetir proceso? (S/N) ");
				char repetir = sc.nextLine().charAt(0);
				if (String.valueOf(repetir).equals("S")) {
					System.out.println("Introduce la temperatura en centígrados");
					temperatura = sc.nextDouble();
					sc.nextLine();
					System.out.println("ºK = " + (temperatura + 273));
				}else {
					System.out.println("Saliendo...");
					break;
				}
			
			}
		*/
		
		
		
		
		
		
		
		
		sc.close();
	}

}
