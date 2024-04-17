package Tienda;

public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;

    private Producto producto;

    public Proveedor(int idProveedor, String nombreProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }
    public String getNombreProvedor() {
        return nombreProveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public String mostrarProveedor(){
        return "Proveedor: \n" + "ID Proveedor: " + idProveedor + "\n Nombre Proveedor: " + nombreProveedor;
    }



}
