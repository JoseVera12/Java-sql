package Modelo;


public class Videojuego {

	private String nombre;
	private int precio;
	private String categoria;
	private String fechaSalida;
	private int numeroVentas;
	

	public Videojuego(String nombre, int precio, String categoria, String fechaSalida, int numeroVentas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.fechaSalida = fechaSalida;
		this.numeroVentas = numeroVentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria
				+ ", fechaSalida=" + fechaSalida + "]";
	}
	
	
	
	
	
	
}
