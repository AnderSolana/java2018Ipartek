package com.ipartek.formacion.poo;

public class Pruebas {

	public static void main(String[] args) {
		// Usuario usuario; // = null;

		// usuario = new Usuario();

		Usuario usuario = new Usuario("andersolana@email.com", "contra");

		/*
		 * usuario.setEmail("andersolana"); usuario.setPassword("contra");
		 */

		System.out.println(Usuario.getContadorDeInstancias());

		System.out.println(new Usuario().getEmail());

		System.out.println(usuario.getEmail());
		System.out.println(usuario.getPassword());
		usuario.cambiarPassword("12345");
		System.out.println(usuario.datosCompletos());
		System.out.println(usuario.datosCompletos("coma"));
		System.out.println(usuario.datosCompletos("corchetes"));

	}

}
