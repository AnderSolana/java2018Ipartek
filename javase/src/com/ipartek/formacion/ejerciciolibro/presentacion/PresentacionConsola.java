package com.ipartek.formacion.ejerciciolibro.presentacion;

import com.ipartek.formacion.ejerciciolibro.accesodatos.CrudAble;
import com.ipartek.formacion.ejerciciolibro.accesodatos.LibroDaoHashMap;
import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

public class PresentacionConsola {

	public static void main(String[] args) {
		CrudAble<Libro> libros = new LibroDaoHashMap();
		
		Libro l1 = new Libro(3L, "Tercer Libro", "Editorial 3", "1479246800000", 10.99);
		libros.insert(l1);
		l1 = new Libro(3L, "Tercer Libro UPDATE", "Editorial 3", "1479246800000", 10.99);
		libros.update(l1);
		
		for (Libro libro : libros.getAll().values()) {
			System.out.println(libro);
		}
		

		
		System.out.println(libros.getById(1L));
		System.out.println(libros.getByIsbn("1110987654321"));

	}

}
