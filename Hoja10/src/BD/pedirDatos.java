package BD;

import java.time.LocalDate;
import java.util.Scanner;

import Modelo.Videojuego;

public class pedirDatos {

	public static Videojuego videojuegoNuevo() {

		String nombre;
		int precio;
		String categoria;
		String fechaSalida;
		int numeroVentas;

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce un nombre");
		nombre = lector.nextLine();

		System.out.print("Introduce el precio");
		precio = lector.nextInt();
		lector.nextLine();

		System.out.println("Introduce la categoria");
		categoria = lector.nextLine();

		System.out.println("Introduce una fecha");
		fechaSalida = lector.nextLine();

		System.out.print("Introduce el numero de ventas");
		numeroVentas = lector.nextInt();
		lector.nextLine();

		return new Videojuego(nombre, precio, categoria, fechaSalida, numeroVentas);

	}

}
