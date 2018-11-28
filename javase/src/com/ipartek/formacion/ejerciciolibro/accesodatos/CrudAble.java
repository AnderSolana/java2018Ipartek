package com.ipartek.formacion.ejerciciolibro.accesodatos;

import java.util.HashMap;

public interface CrudAble<Pojo> {
	public HashMap<String, Pojo> getAll();
	public Pojo getById(Long id);
	public Pojo getByIsbn(String isbn);
	public void insert(Pojo pojo);
	public void update(Pojo pojo);
	public void delete(String isbn);
}
