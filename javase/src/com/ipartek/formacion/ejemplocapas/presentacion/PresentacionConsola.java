package com.ipartek.formacion.ejemplocapas.presentacion;

import com.ipartek.formacion.biblioteca.Consola;
import com.ipartek.formacion.ejemplocapas.accesodatos.CrudAble;
import com.ipartek.formacion.ejemplocapas.accesodatos.UsuarioDaoArrayList;
import com.ipartek.formacion.ejemplocapas.pojos.Usuario;

public class PresentacionConsola {

	public static void main(String[] args) {
		String opcion;
		
		do {
			// Podemos hacer un método para mostrar el menú
			opcion = Consola.leerLinea("Elige una opción");
			
			switch(opcion) {
			case "0": System.out.println("Salir"); break;
			case "1": alta(); break;
			case "2": modificacion(); break;
			// TODO: otras opciones
			default: System.out.println("No existe esa opción"); 
			}
		}while(!"0".equals(opcion));
		
		
		CrudAble<Usuario> usuarios = new UsuarioDaoArrayList();

		usuarios.insert(pedirUsuario());

		usuarios.insert(new Usuario(3L, "nuevo@nuevez.com", "Pa$$w0rd"));
		usuarios.update(new Usuario(3L, "nuevo@nueve.com", "Pa$$w0rd"));
		usuarios.delete(2L);

		for (Usuario usuario : usuarios.getAll()) {
			System.out.println(usuario);
		}

		System.out.println(usuarios.getById(1L));

		// Usuario usuario = pedirUsuario();

		// System.out.println(usuario);

	}

	private static void modificacion() {
		System.out.println("Modificación");
	}

	private static void alta() {
		System.out.println("Alta");
	}

	private static Usuario pedirUsuario() {
		Usuario usuario = new Usuario();

		usuario.setId(Consola.leerLong("ID"));
		boolean errorEmail;

		do {
			errorEmail = false;
			try {
				usuario.setEmail(Consola.leerLinea("Email"));
			} catch (Exception e) {
				errorEmail = true;
				System.err.println(e.getMessage());
			}
		} while (errorEmail);

		boolean errorPassword;
		
		do {
			errorPassword = false;
			
			try {
				usuario.setPassword(Consola.leerLinea("Contraseña"));
			} catch (Exception e) {
				errorPassword = true;
				System.out.println(e.getMessage());
			}
			
		} while(errorPassword);

		// Usuario usuario = new Usuario(id, email, password);
		return usuario;
	}

}
