package backend;

import java.util.Date;

public class Recorrido {
	
	Coordenada coordenada;
	Tipoderecorrido id_tipo;
	Dificultad id_dificultad;

	
	private String id_recor;
	private float calorias;
	private float velProm;
	private float altitud;
	private float distancia;
	private String etiqueta; // Aun no estoy segura de que es
	private String comentarios; 
	private Date Tiempotrans;
	
	
	public Recorrido(){
		
	}
	
	public String getId_recor() {
		return id_recor;
	}
	
	public void setId_recor(String id_recor) {
		this.id_recor = id_recor;
	}
	
	public float getCalorias() {
		return calorias;
	}
	
	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}
	
	public float getVelProm() {
		return velProm;
	}
	
	public void setVelProm(float velProm) {
		this.velProm = velProm;
	}
	
	public float getAltitud() {
		return altitud;
	}
	
	public void setAltitud(float altitud) {
		this.altitud = altitud;
	}
	
	public float getDistancia() {
		return distancia;
	}
	
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public Date getTiempotrans() {
		return Tiempotrans;
	}
	
	public void setTiempotrans(Date tiempotrans) {
		Tiempotrans = tiempotrans;
	}
	
	
}
