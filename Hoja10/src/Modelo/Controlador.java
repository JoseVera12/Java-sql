package Modelo;

import java.util.Scanner;

import BD.pedirDatos;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);

		int eleccion = 0;
		int eleccion2 = 0;
		int eleccion3 = 0;
		String nombre = "";
		String nombre2 = "";
		String nombreModificar = "";
		String respuesta = "";
		String respuesta2 = "";

		System.out.println("OPCIONES");
		System.out.println("1-INSERTAR VIDEOJUEGO");/* Hecho y funciona */
		System.out.println("2-INSERTAE T2 ASOCIANDO T1");
		System.out.println("3-BORRAR T2 y dejar en null en t1t2 EL T2");/* Hecho y funciona */
		System.out.println("4-BORRAR T1 Y EN T1T2 Y EN VEZ DE DEJAR NULL BORRAR LA LINEA COMPLETA");/* Hecho y funciona */
		System.out.println("5-MODIFICAR T1 Y T2");/* Hecho y funciona */
		System.out.println("6-SE PUEDE ASOCIAR UN VIDEOJUEGO A UN NUEVO DESARROLLADOR");
		System.out.println("7-VIDEOJUEGOS CUANTOS DESARROLLADORES TIENE");/* Hecho y funciona */
		System.out.println("8-UN DESARROLLADOR QUE VIDEOJUEGOS TIENE");/* Hecho y funciona */
		System.out.println("9-CUANTAS VIDEOJUEGOS HAY");/* Hecho y funciona */
		System.out.println("10-Videojuego mas usado?");/* Hecho y funciona */
		System.out.println("11-DESARROLLADOR SIN VIDEOJUEGO");/* Hecho y funciona */
		System.out.println("12-MOSTRAR DESARROLLADOR");/* Hecho y funciona */
		System.out.println("13-MOSTRAR VIDEOJUEGO");
		eleccion = lector.nextInt();
		lector.nextLine();

		try {
			switch (eleccion) {
			case 1:

				Videojuego nuevoVideojuego = pedirDatos.videojuegoNuevo();

				try {
					Control.insertarSQL(nuevoVideojuego);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:

				break;
			case 3:

				Control.mostrarVideojuegos();

				System.out.println("Que videojuego deseas eliminar por id");
				eleccion2 = lector.nextInt();
				lector.nextLine();

				Control.BorrarT2(eleccion2);

				break;

			case 4:

				Control.MostrarDesarrollador();

				System.out.println("Que desarrollador deseas eliminar por id");
				eleccion3 = lector.nextInt();
				lector.nextLine();

				Control.BorrarT1(eleccion3);

				break;
			case 5:
				Control.MostrarDesarrollador();
				System.out.println("Que desarrollador quieres elegir");
				nombre = lector.nextLine();

				System.out.println("Cambiar nombre, puesto");
				nombre2 = lector.nextLine();

				System.out.println("Nuevo nombre");
				nombreModificar = lector.nextLine();

				Control.Modificar(nombre, nombre2, nombreModificar);

				break;
			case 6:
				/* !DIFICIL */
				break;
			case 7:

				Control.mostrarVideojuegos();

				System.out.println("Dime la id del videojuego");
				respuesta2 = lector.nextLine();

				Control.VideojuegoDimeDesarrollador(respuesta2);

				break;
			case 8:

				Control.MostrarDesarrollador();

				System.out.println("Dime la id del desarrollador");
				respuesta = lector.nextLine();

				Control.DesarrolladorDimeVideojuego(respuesta);
				break;
			case 9:
				Control.cantidadVideojuego();
				break;
			case 10:
				Control.videojuegoMasUsado();
				break;
			case 11:
				Control.desarrolladorSinVideojuego();
				break;
			case 12:
				Control.MostrarDesarrollador();
				break;
			case 13:
				Control.mostrarVideojuegos();
				break;
			default:
				System.out.println("Error, elige una opción válida por favor");
				break;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
