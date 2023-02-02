package java2023.model;

import java.util.Date;

public class Usuario extends Persona {

	private String password;
	private String id_usuario;
	private String identificacion;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String id, String nombre, String identificacion, Enum_TipoPersona tipo_persona,
			Date fecha_nacimiento, String id_usuario) {
		super(id,nombre,identificacion,tipo_persona,fecha_nacimiento);
		this.id_usuario = id_usuario;
		this.identificacion = identificacion;
		int x = 2;
		Usuario us1 = new Usuario();
		Usuario us2 = new Usuario();
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String usuario = "ID: " +getId() +" , Nombre: " + getNombre()+" ,Identificacion: " + getIdentificacion()
		+ " UserID: " + this.id_usuario;
		return usuario;
	}

}
