package Modelo;

public class Desarrollador {

	private String nombre;
	private String puesto;
	
	public Desarrollador(String nombre, String puesto) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Desarrollador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	
	
	
	
}
