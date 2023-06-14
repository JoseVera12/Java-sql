package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Control {

	public static void MostrarDesarrollador() {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT * FROM `desarrollador`;";
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("id: " + rs.getInt("id") + " nombre: " + rs.getString("nombre") + " puesto: "
						+ rs.getString("puesto"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void mostrarVideojuegos() {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT * FROM `videojuego`;";
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("id: " + rs.getInt("id") + " nombre: " + rs.getString("nombre") + " precio: "
						+ rs.getInt("precio") + " categoria: " + rs.getString("categoría") + " fechaSalida: "
						+ rs.getString("fechaSalida") + " numeroVentas: " + rs.getInt("numeroVentas"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void insertarSQL(Videojuego videojuegoInsertado) throws ClassNotFoundException {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		int propietario = 1;
		String sql = "";
		String nombrePropietario = "María";

		int nPropietario = 1;
		String calle = "Calle del pozo";
		int m2 = 60;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos
																										// //
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)

			sql = "INSERT INTO Videojuego (id, nombre, precio, categoría, fechaSalida, numeroVentas) VALUES (NULL, '"
					+ videojuegoInsertado.getNombre() + "', '" + videojuegoInsertado.getPrecio() + "', '"
					+ videojuegoInsertado.getCategoria() + "', '" + videojuegoInsertado.getFechaSalida() + "'" + ","
					+ videojuegoInsertado.getNumeroVentas() + ")";

			System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void cantidadVideojuego() {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos
																					// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT Count(nombre)as 'total' FROM `videojuego`;";
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("total: " + rs.getInt("total"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void desarrolladorSinVideojuego() {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresahoja10", "root", "");// proporcionamos

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "select desarrollador.nombre as 'nombre' from desarrollador inner join desarrollador_has_videojuego on desarrollador_has_videojuego.desarrollador_id = desarrollador.id where videojuego_id is null";
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("nombre: " + rs.getString("nombre"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void Modificar(String nombre, String nombre2, String nombreModificar) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		int resultado = 0;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresahoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "update desarrollador set " + nombre2 + "= " + " ' " + nombreModificar + " ' " + "where nombre = "
					+ "'" + nombre + "'";
			System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			if (resultado >= 1) {
				System.out.println("Se ha actualizado bien");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void videojuegoMasUsado() {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "Select numeroVentas, nombre from videojuego order by numeroVentas desc limit 1 ";
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("Juego mas comprado: " + rs.getString("nombre") + " , " + rs.getInt("numeroVentas"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void DesarrolladorDimeVideojuego(String respuesta) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT videojuego.nombre from videojuego inner join desarrollador_has_videojuego on videojuego.id = desarrollador_has_videojuego.Videojuego_id INNER JOIN desarrollador ON desarrollador.id = desarrollador_has_videojuego.Desarrollador_id WHERE desarrollador.id = "
					+ respuesta;
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("Nombre: " + rs.getString("nombre"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void VideojuegoDimeDesarrollador(String respuesta2) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int propietario = 1;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/EmpresaHoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT desarrollador.nombre from desarrollador inner join desarrollador_has_videojuego on desarrollador.id = desarrollador_has_videojuego.Desarrollador_id INNER JOIN videojuego ON videojuego.id = desarrollador_has_videojuego.Videojuego_id WHERE videojuego.id = "
					+ respuesta2;
			System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("Nombre: " + rs.getString("nombre"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void BorrarT2(int eleccion2) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		int resultado = 0;
		int resultado2 = 0;
		int propietario = 1;
		String sql = "";
		String sql2 = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresahoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "update desarrollador_has_videojuego set Videojuego_id=null where Videojuego_id = " + eleccion2;
			System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			sql2 = "delete from videojuego where id = " + eleccion2;

			resultado2 = sentenciaSQL.executeUpdate(sql2);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			if (resultado >= 1 && resultado2 >= 1) {
				System.out.println("Se ha actualizado bien");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

	public static void BorrarT1(int eleccion3) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		int resultado = 0;
		int resultado2 = 0;
		int propietario = 1;
		String sql = "";
		String sql2 = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/empresahoja10", "root", "");// proporcionamos
			// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "delete from Desarrollador where id = " + eleccion3;
			System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			sql2 = "delete from desarrollador_has_videojuego where Desarrollador_id = " + eleccion3;

			resultado2 = sentenciaSQL.executeUpdate(sql2);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			if (resultado >= 1 && resultado2 >= 1) {
				System.out.println("Se ha actualizado bien");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

}
