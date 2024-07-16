package model;

public class Ciudad {

	private String nombre;
	private double temperatura;
	private int poblacion;

	public Ciudad(String nombre, double temperatura, int poblacion) {
		super();
		this.nombre = nombre;
		this.temperatura = temperatura;
		this.poblacion = poblacion;
	}
	
	public Ciudad() {};
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
}
