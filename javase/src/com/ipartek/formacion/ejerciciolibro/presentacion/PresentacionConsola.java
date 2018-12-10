package com.ipartek.formacion.ejerciciolibro.presentacion;

import com.ipartek.formacion.biblioteca.Consola;
import com.ipartek.formacion.ejerciciolibro.accesodatos.CrudAble;
import com.ipartek.formacion.ejerciciolibro.accesodatos.LibroDaoHashMap;
import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

public class PresentacionConsola {

	public static void main(String[] args) {
		CrudAble<Libro> libros = new LibroDaoHashMap();
		/*
		 * Libro l1 = new Libro(3L, "Tercer Libro", "Editorial 3", "1479246800000",
		 * 10.99); libros.insert(l1); l1 = new Libro(3L, "Tercer Libro UPDATE",
		 * "Editorial 3", "1479246800000", 10.99); libros.update(l1);
		 * 
		 * for (Libro libro : libros.getAll().values()) { System.out.println(libro); }
		 * 
		 * System.out.println(libros.getById(1L));
		 * System.out.println(libros.getByIsbn("1110987654321"));
		 */

		String opcion;
		String menu = "Seleccione una opción:\n-------------------------\n"
				+ "1- LISTADO\n2- ALTA\n3- MODIFICACIÓN\n4- BAJA\n"
				+ "5- BÚSQUEDA POR ID\n6- BÚSQUEDA POR ISBN\n0- SALIR";

		do {
			opcion = Consola.leerLinea(menu);

			switch (opcion) {
			case "1":
				System.out.println("LISTADO de todos los libros: ");
				for (Libro libro : libros.getAll().values()) {
					System.out.println(libro);
				}
				break;
			case "2":
				Libro l1 = Consola.obtenerDatos();
				libros.insert(l1);
				break;
			case "3":
				String modOpcion = Consola.leerLinea("Pulse 1 para buscar por ID y 2 para buscar por ISBN");
				String lmod;
				Libro libroMod = new Libro();
				switch (modOpcion) {
				case "1":

					lmod = "" + Consola.leerLong("Introduzca el ID del libro a modificar");
					libroMod = libros.getById(Long.parseLong(lmod));
					libroMod.setTitulo(Consola.leerLinea("Introduzca el nuevo título"));
					libroMod.setEditorial(Consola.leerLinea("Introduzca la nueva editorial"));
					libroMod.setPrecio(Consola.leerLong("Introduzca el nuevo precio"));
					libros.update(libroMod);

					break;

				case "2":

					lmod = Consola.leerLinea("Introduzca el ISBN del libro a modificar");
					libroMod = libros.getByIsbn(lmod);
					libroMod.setTitulo(Consola.leerLinea("Introduzca el nuevo título"));
					libroMod.setEditorial(Consola.leerLinea("Introduzca la nueva editorial"));
					libroMod.setPrecio(Consola.leerLong("Introduzca el nuevo precio"));
					libros.update(libroMod);

					break;

				default:
					System.err.println("Esa opción no es válida\n");
					break;
				}

				break;
			case "4":
				String delOpcion = Consola.leerLinea("Pulse 1 para buscar por ID y 2 para buscar por ISBN");
				String ldel;
				switch (delOpcion) {
				case "1":

					ldel = Consola.leerLinea("Introduzca el ID del libro a eliminar");

					if (libros.getById(Long.parseLong(ldel)) != null) {
						libros.delete(libros.getById(Long.parseLong(ldel)).getIsbn());
						System.out.println("Se ha eliminado el libro. ");
					} else {
						System.out.println("No se ha eliminado el libro porque no existe. ");
					}

					break;

				case "2":

					ldel = Consola.leerLinea("Introduzca el ISBN del libro a eliminar");

					if (libros.getByIsbn(ldel) != null) {
						libros.delete(ldel);
						System.out.println("Se ha eliminado el libro. ");
					} else {
						System.out.println("No se ha eliminado el libro porque no existe. ");
					}

					break;

				default:
					System.err.println("Esa opción no es válida\n");
					break;
				}

				break;
			case "5":
				Long lid = Consola.leerLong("Introduzca el ID del libro a buscar");
				System.out.println(libros.getById(lid));
				break;
			case "6":
				String bisbn = Consola.leerLinea("Introduzca el ISBN del libro a buscar");
				System.out.println(libros.getByIsbn(bisbn));
				break;
			case "0":
				System.out.println("Saliendo...");
				break;

			default:
				System.err.println("Ha ocurrido un ERROR");
				break;
			}
		} while (!"0".equals(opcion));

	}

}
