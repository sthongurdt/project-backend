package backend;

import java.sql.Date;

public class Usuario {

	private String Nombre;
	private String Apellido;
	private String id_user;
	private Date FechaNacimiento;
	
	public Usuario(){
		
	}
	
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public String getApellido(){
		return this.Apellido;
	}
	
	public String getIdUsuario(){
		return this.id_user;
	}
	
	public Date getFechaNacimiento(){
		return this.FechaNacimiento;
	}
	
	public String setNombre(/*parametro*/){
		
		return this.Nombre/*=parametro*/;
	}
	
	public String setApellido(/*parametro*/){
		return this.Apellido/*=parametro*/;
	}
	
	
}
