package Modle;

public class Curso {
	
	private String nombre;
	private double precio;
	private int duracion;
	
	public Curso(String nombre, double precio, int duracion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


}
