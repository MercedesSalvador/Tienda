package curso.java.tienda.model;

public class Usuario {
	String email;
	String clave;
	String nombre;
	String apellido1;
	String apellido2;
	
	public Usuario() {
		
	}


	
	public Usuario(String clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
	}
	
	public Usuario(String email, String clave, String nombre, String apellido1, String apellido2) {
		super();
		this.email = email;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	
}
