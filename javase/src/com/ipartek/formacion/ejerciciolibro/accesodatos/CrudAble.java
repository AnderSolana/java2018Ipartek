package com.ipartek.formacion.ejerciciolibro.accesodatos;

import java.util.HashMap;

import com.ipartek.formacion.ejerciciolibro.pojos.Libro;

public interface CrudAble<Pojo> {
	public HashMap<String, Pojo> getAll();
	public Pojo getById(Long id);
	public Pojo getByIsbn(String isbn);
	public Libro insert(Pojo pojo);
	public void update(Pojo pojo);
	public void delete(String isbn);
}
