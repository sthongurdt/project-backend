package backend;

import java.util.Date;

public class Coordenada {

	private float lat;
	private float longitud;
	private float alt;
	private Date hora_tom;
	private Date fech_tom;
	
	public Coordenada(){
			
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getAlt() {
		return alt;
	}

	public void setAlt(float alt) {
		this.alt = alt;
	}

	public Date getHora_tom() {
		return hora_tom;
	}

	public void setHora_tom(Date hora_tom) {
		this.hora_tom = hora_tom;
	}

	public Date getFech_tom() {
		return fech_tom;
	}

	public void setFech_tom(Date fech_tom) {
		this.fech_tom = fech_tom;
	}
	
	
}
