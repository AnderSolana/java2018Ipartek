package com.ipartek.formacion.generales;

import java.util.Scanner;

public class EjerciciosGenerales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * Programa que lea dos variables 
		 * num�ricas A y B e 
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
		
		/*Programa Java que pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras que tiene.
		Por ejemplo si se introduce el n�mero 54391 el programa mostrar� el mensaje:
		El n�mero tiene 5 cifras
		System.out.println("Introduce un n�mero: ");
		String texto = sc.nextLine();
		System.out.println("Es un n�mero de " + texto.length() + " cifras");
		*/
		
		/*Programa Java que lee una temperatura expresada en grados cent�grados y la convierte a grados kelvin. 
		El proceso de leer grados cent�grados se debe repetir mientras que se responda �S� a la pregunta: Repetir proceso? (S/N)
		Para hacer la conversi�n de grados Cent�grados a grados Kelvin hay que utilizar la f�rmula:
		�K = �C + 273
			System.out.println("Introduce la temperatura en cent�grados");
			Double temperatura = sc.nextDouble();
			sc.nextLine();
			System.out.println("�K = " + (temperatura + 273));
			for(int i = 0; i <= 1000; i++) {
				System.out.println("Repetir proceso? (S/N) ");
				char repetir = sc.nextLine().charAt(0);
				if (String.valueOf(repetir).equals("S")) {
					System.out.println("Introduce la temperatura en cent�grados");
					temperatura = sc.nextDouble();
					sc.nextLine();
					System.out.println("�K = " + (temperatura + 273));
				}else {
					System.out.println("Saliendo...");
					break;
				}
			
			}
		*/
		
		
		
		
		
		
		
		
		sc.close();
	}

}
