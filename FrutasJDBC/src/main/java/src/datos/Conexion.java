package src.datos;

import java.sql.*;
public class Conexion {
    //TODO: CONSTANTES DE USO
    // TODO: CONEXIÓN A LA BASE DE DATOS
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/frutas030724";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "mysql";

    //TODO: Metodos para la conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    //TODO: Metodos para cerrar la conexion a la base de datos
    public static void closeConnection(Connection cn) throws SQLException {
        cn.close();
    }

    //TODO: Metodos para cerrar los resultados y los statement
    public static void closeResultSet(ResultSet rs){
        try{
            rs.close();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void closePreparedStatement(PreparedStatement ps){
        try{
            ps.close();
        }catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
