package java2023.model;

import java.util.Date;
import java.util.UUID;

public class Persona {

	
	private String id = UUID.randomUUID().toString();
	private String nombre;
	private String identificacion;
	private Enum_TipoPersona tipo_persona;
	private Date fecha_nacimiento;
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String id, String nombre, String identificacion, Enum_TipoPersona tipo_persona,
			Date fecha_nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.tipo_persona = tipo_persona;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion+" super";
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public Enum_TipoPersona getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(Enum_TipoPersona tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String usuario = "PERSONA: ID: " +getId() +" , Nombre: " + getNombre()+" ,Identificacion: " + getIdentificacion();
		return usuario;
	}
	
}
