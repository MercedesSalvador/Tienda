package curso.java.tienda.model;

import java.util.ArrayList;
import java.util.Iterator;



public class UsuarioDAO {
	private static ArrayList<Usuario> listaUsuarios= getUsuarios();
	
	public static ArrayList<Usuario> getUsuarios(){
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario ("mer@hola.es", "1234","Mercedes", "Salvador", "Canelas");
		listaUsuarios.add(usuario1);
		Usuario usuario2 = new Usuario ("lau@hola.es", "4567",  "Laura", "Garcia", "Perez");
		listaUsuarios.add(usuario2);
		return listaUsuarios;
	}

	public static boolean comprobarLogin(Usuario usuario) {
		boolean existe = false;	
		
		for(Usuario u: listaUsuarios) {
			String nombre = u.getNombre();
			String clave=u.getClave();
			if(nombre.equals(usuario.getNombre()) && clave.equals(usuario.getClave())) {
				existe=true;
			}
		}
		return existe;
	}
	
	//COMPROBAR SI EXISTE USUARIO - PARA DAR DE ALTA
	public static boolean existeUsuario(Usuario usuario) {
		boolean existe = false;	
		
		for(Usuario u: listaUsuarios) {
			
			String clave=u.getClave();
			String email = u.getEmail();
			
			if(email.equals(usuario.getClave())) {
				existe=true;
			}		
		}
		return existe;
	}
	
	//public addUsuario() {
		/*if(existe == false) {
		listaUsuarios.add(usuario);
	} else {
		System.out.println("El usuario ya existe");
	*/
	

	
	//PARA PROBAR QUE LA LISTA DE USUARIOS TIENE CONTENIDO
	
	public static void main(String[] args) {
		//TODO: para pruebas
		ArrayList<Usuario> lista = getUsuarios();
		//for(int i=0; i< lista.size(); i++)
			for(Usuario usuario: listaUsuarios){
			//Usuario usuario = new Usuario();
			//System.out.println(usuario.toString()); //TODO: toString()
			System.out.println(usuario.getNombre()+usuario.getClave());
		}
		System.out.println("");
		
		String nombre = "Mercedes";
		String clave = "1234";
		String email = "mer@hola.es";
		Usuario u = new Usuario(email,clave);
		existeUsuario(u);
		System.out.println(existeUsuario(u));
		System.out.println(listaUsuarios);
	}
	
	
}
