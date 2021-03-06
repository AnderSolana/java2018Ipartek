package com.ipartek.formacion.biblioteca;

import java.util.Scanner;

public class Consola {
	private static final String FORMATO = "[%s]:";
	private static Scanner sc = new Scanner(System.in);
	
	public static String leerLinea(String mensaje) {
		mostrarMensaje(mensaje);
		
		return sc.nextLine();
	}

	private static void mostrarMensaje(String mensaje) {
		if (mensaje != null) {
			System.out.print(String.format(FORMATO, mensaje));
		}
	}
	
	public static String leerLinea() {
		return leerLinea(null);
	}
	
	public static Long leerLong(String mensaje) {
		boolean hayErrores;
		Long l = null;
		
		do {
		hayErrores = false;
		
		mostrarMensaje(mensaje);
		try {
			//l = sc.nextLong();
			l = Long.parseLong(sc.nextLine());
		} catch (Exception e) {
			//System.out.println(e);
			System.err.println("El dato no es un número");
			hayErrores = true;
		}finally {
			//sc.nextLine();
		}
		
		}while(hayErrores);
		return l;
	}
	
	public static Long leerLong() {
		return leerLong(null);
	}
	
	public static Double leerDouble(String mensaje) {
		boolean hayErrores;
		Double l = null;
		
		do {
		hayErrores = false;
		
		mostrarMensaje(mensaje);
		try {
			
			l = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {

			System.err.println("El dato no es un número");
			hayErrores = true;
		}finally {

		}
		
		}while(hayErrores);
		return l;
	}
	
	public static Double leerDouble() {
		return leerDouble(null);
	}
	
}
