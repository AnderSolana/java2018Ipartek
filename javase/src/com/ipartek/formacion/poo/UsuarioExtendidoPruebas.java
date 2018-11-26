package com.ipartek.formacion.poo;

public class UsuarioExtendidoPruebas {

	public static void main(String[] args) {
		UsuarioExtendido ue = new UsuarioExtendido("Nuevo nuevito");
		
		ue.setEmail("nuevo@nuevez.es");
		ue.setPassword("yepa");
		
		System.out.println(ue.datosCompletos("coma"));
		
		Usuario u = ue;
		
		UsuarioExtendido ue2 = (UsuarioExtendido) u ;
		System.out.println(ue2.getNombre());
		
		Oficina o = new Oficina("Usando Herencia");
		
		o.nuevoUsuario(new Usuario("pepe@snjdsnj", "amksa"));
		o.nuevoUsuario(u);
		
		for(Usuario usuario: o.getUsuarios()) {
			System.out.println(usuario.datosCompletos());
			
			if (usuario instanceof UsuarioExtendido) {
				// System.out.println(((UsuarioExtendido)usuario).getNombre());
				UsuarioExtendido usuarioExtendido = (UsuarioExtendido) usuario; 
				System.out.println(usuarioExtendido.getNombre());
			}
		}
		
		Usuario u1 = new Usuario("aa@", "bb");
		Usuario u2 = new Usuario("aa@", "bb");
		System.out.println(u2.equals(u1));
		System.out.println(u1);

	}

}
