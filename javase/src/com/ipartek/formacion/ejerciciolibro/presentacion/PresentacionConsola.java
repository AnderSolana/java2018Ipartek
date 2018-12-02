package com.ipartek.formacion.ejerciciolibro.presentacion;

import java.io.Console;
import java.util.Scanner;

import com.ipartek.formacion.biblioteca.Consola;
import com.ipartek.formacion.ejerciciolibro.accesodatos.CrudAble;
import com.ipartek.formacion.ejerciciolibro.accesodatos.LibroDaoHashMap;
import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

public class PresentacionConsola {

	public static void main(String[] args) {
		CrudAble<Libro> libros = new LibroDaoHashMap();
		/*
		Libro l1 = new Libro(3L, "Tercer Libro", "Editorial 3", "1479246800000", 10.99);
		libros.insert(l1);
		l1 = new Libro(3L, "Tercer Libro UPDATE", "Editorial 3", "1479246800000", 10.99);
		libros.update(l1);
		
		for (Libro libro : libros.getAll().values()) {
			System.out.println(libro);
		}

		System.out.println(libros.getById(1L));
		System.out.println(libros.getByIsbn("1110987654321"));*/
		
		String opcion; 
		String menu="Seleccione una opción:\n-------------------------\n"
				+ "1- LISTADO\n2- ALTA\n3- MODIFICACIÓN\n4- BAJA\n"
				+ "5- BÚSQUEDA POR ID\n6- BÚSQUEDA POR ISBN\n0- SALIR";
		
		do {
			opcion = Consola.leerLinea(menu);
			
			switch (opcion) {
			case "1":
				System.err.println("---------------------------");
				System.err.println("---------------------------");
				System.out.println("LISTADO de todos los libros: ");
				for (Libro libro : libros.getAll().values()) {
					System.out.println(libro);
					System.err.println("---------------------------");
					System.err.println("---------------------------");
				}
				break;
			case "2":
						
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "0":
				System.out.println("Saliendo...");
				break;

			default:
				System.err.println("Ha ocurrido un ERROR");
				break;
			}
		}while(!"0".equals(opcion));



	}

}
