package com.ipartek.formacion.ejerciciolibro.accesodatos;

import java.util.HashMap;
import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

public class LibroDaoHashMap implements CrudAble<Libro> {

	private HashMap<String, Libro> libros = new HashMap<>();
	Libro l1 = new Libro(1L, "Primer Libro", "Editorial 1", "1234567891011", 15.5);
	Libro l2 = new Libro(2L, "Segundo Libro", "Editorial 2", "1110987654321", 22);
	
	public LibroDaoHashMap() {
		libros.put(l1.getIsbn(), l1);
		libros.put(l2.getIsbn(), l2);
	}
	
	@Override
	public HashMap<String, Libro> getAll() {
		return libros;
	}

	@Override
	public Libro getById(Long id) {
		for (HashMap.Entry<String, Libro> entry : libros.entrySet()) {
		    if (entry.getValue().getId() == id) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public Libro getByIsbn(String isbn) {
		return libros.get(isbn);
	}

	@Override
	public Libro insert(Libro libro) {
		libros.put(libro.getIsbn(), libro);
		return libro;
	}

	@Override
	public void update(Libro libro) {
		libros.put(libro.getIsbn(), libro);
		
	}

	@Override
	public void delete(String isbn) {
		libros.remove(isbn);
		
	}

}
