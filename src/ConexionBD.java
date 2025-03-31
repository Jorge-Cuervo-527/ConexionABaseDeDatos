import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/conexion";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Almaximo527";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("\nConexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error en la conexión.");
            e.printStackTrace();
        }
        return conexion;
    }

    public static void main(String[] args) {
        conectar(); // Probar la conexión
    }
}


