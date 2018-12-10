package com.ipartek.formacion.biblioteca;

import java.util.Scanner;

import com.ipartek.formacion.ejerciciolibro.accesodatos.CrudAble;
import com.ipartek.formacion.ejerciciolibro.accesodatos.LibroDaoHashMap;
import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

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
	
	public static Libro obtenerDatos() {
		CrudAble<Libro> libros = new LibroDaoHashMap();
		
		
		Long id = Consola.leerLong("Introduce el ID");	
		
		do {
			
			System.err.println("Ese ID ya existe");
			id = Consola.leerLong("Introduce el ID");
			
		}while (libros.getById(id) != null);
		
		String titulo = Consola.leerLinea("Introduce el título");
		
		String editorial = Consola.leerLinea("Introduce la editorial");
		
		String isbn = Consola.leerLinea("Introduce el isbn");
		
		do {
			
			System.err.println("Ese ISBN ya existe");
			isbn = Consola.leerLinea("Introduce el ISBN");
			
		}while (libros.getByIsbn(isbn) != null);
		
		long precio = Consola.leerLong("Introduce el precio") ;
		
		Libro l1 = new Libro(id, titulo, editorial, isbn, precio);
		
		return l1; 
	}
}
