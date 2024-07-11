package src.datos;

import src.domain.Fruta;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrutaDAO {

    static Scanner sc = new Scanner(System.in);

    //TODO: SENTENCIAS SQL A EJECUTAR
    private static final String SQL_SELECT = "SELECT id_fruta, nombref, colorf, precio_unitario, cantidad, precio_total, fecha FROM tb_fruta";

    private static final String SQL_INSERT = "INSERT INTO tb_fruta (nombref, colorf, precio_unitario, cantidad, precio_total, fecha) VALUES (?,?,?,?,?,?)";

    private static final String SQL_DELETE = "DELETE FROM tb_fruta WHERE id_fruta = ?";

    public static final String SQL_UPDATE = "UPDATE tb_fruta SET nombref = ?, colorf = ?, precio_unitario = ?, cantidad = ?, precio_total = ? WHERE id_fruta = ?";

    //TODO: Metodo seleccionar
    public List<Fruta> seleccionar() throws SQLException {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Fruta> listaFrutas = new ArrayList<>();

        try{
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()){
                int idFruta = rs.getInt("id_fruta");
                String nombreFruta = rs.getString("nombref");
                String colorFruta = rs.getString("colorf");
                double precioUnitario = rs.getDouble("precio_unitario");
                int cantidad = rs.getInt("cantidad");
                double precioTotal = rs.getDouble("precio_total");
                String fechaCreacion = rs.getString("fecha");

                Fruta fruta = new Fruta(idFruta, nombreFruta, colorFruta, precioUnitario, cantidad, precioTotal, fechaCreacion);
                listaFrutas.add(fruta);
            }


        }catch (SQLException e){
            e.printStackTrace(System.out);
        }finally {
            assert cn != null;
            Conexion.closeConnection(cn);
            assert rs != null;
            Conexion.closeResultSet(rs);
            Conexion.closePreparedStatement(ps);
        }

        return listaFrutas;
    }

    public void insertar(Fruta fruta) throws SQLException {
        Connection cn = null;
        PreparedStatement ps = null;
        int lineasAfectadas = 0;

        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL_INSERT);

            ps.setString(1, fruta.getNombreFruta());
            ps.setString(2, fruta.getColorFruta());
            ps.setDouble(3, fruta.getPrecioUnitario());
            ps.setInt(4, fruta.getCantidad());
            ps.setDouble(5, fruta.getPrecioTotal());
            ps.setString(6, fruta.getFechaCreacion());
            lineasAfectadas = ps.executeUpdate();
            System.out.println("Se insertaron " + lineasAfectadas + " filas.");
        }catch (SQLException e){
            e.printStackTrace(System.out);
        }finally {
            assert cn != null;
            Conexion.closeConnection(cn);
            assert ps != null;
            Conexion.closePreparedStatement(ps);
        }
    }

    public void eliminar(int id) throws SQLException {
        Connection cn = null;
        PreparedStatement ps = null;
        int lineasAfectadas = 0;
        boolean found = false;

        for (Fruta f : seleccionar()){
            if (f.getIdFruta() == id){
                found = true;
                try{
                    cn = Conexion.getConnection();
                    ps = cn.prepareStatement(SQL_DELETE);
                    System.out.println("Se encontro lo siguiente con el ID brindado: ");
                    System.out.println(f);
                    System.out.println("¿Seguro que desea eliminar este registro? ");
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")){
                        ps.setInt(1, id);
                        lineasAfectadas = ps.executeUpdate();
                        System.out.println("Se elimino con exito el registro!!🔥🐓");
                        System.out.println("Registros afectados: " + lineasAfectadas);
                    }else {
                        System.out.println("Eliminación cancelada.");
                        return;
                    }

                }catch (SQLException es){
                    es.printStackTrace(System.out);
                }finally {
                    assert cn != null;
                    Conexion.closeConnection(cn);
                    assert ps != null;
                    Conexion.closePreparedStatement(ps);
                }
            }
        }
        if (!found){
            System.out.println("No se encontro ningun registro con el ID: " + id);
        }

    }

    public void actualizar(int id) throws SQLException {
        Connection cn = null;
        PreparedStatement ps = null;
        boolean found = false;

        for (Fruta f : seleccionar()){
            if (f.getIdFruta() == id){
                found = true;
                try {
                    cn = Conexion.getConnection();
                    ps = cn.prepareStatement(SQL_UPDATE);
                    System.out.println("Ingrese el nuevo nombre de la fruta: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el nuevo color de la fruta: ");
                    String color = sc.nextLine();
                    System.out.println("Ingrese el nuevo precio unitario de la fruta: ");
                    double precioUnitario = sc.nextDouble();
                    System.out.println("Ingrese la nueva cantidad de la fruta: ");
                    int cantidad = sc.nextInt();
                    double precio = precioUnitario * cantidad;

                    ps.setString(1, nombre);
                    ps.setString(2, color);
                    ps.setDouble(3, precioUnitario);
                    ps.setInt(4, cantidad);
                    ps.setDouble(5, precio);
                    ps.setInt(6, id);
                    ps.executeUpdate();
                    System.out.println("Se a modificado con exito el registro existente");
                }catch (SQLException e){
                    e.printStackTrace(System.out);
                }finally {
                    assert cn != null;
                    Conexion.closeConnection(cn);
                    assert ps != null;
                    Conexion.closePreparedStatement(ps);
                }
            }
        }

        if (!found){
            System.out.println("No se encontro ningun registro con el ID: " + id);
        }
    }

}
