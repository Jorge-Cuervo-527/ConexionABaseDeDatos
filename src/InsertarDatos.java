import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos {
    public static void insertarProducto(String nombre, double precio) {
        String sql = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setDouble(2, precio);
            stmt.executeUpdate();
            System.out.println("Producto insertado con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertarProducto("Laptop", 1200.50);
    }
}

