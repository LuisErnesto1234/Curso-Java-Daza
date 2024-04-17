package Tienda;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private Proveedor proveedores;

    private Proveedor idProveedor;

    //Constructor

    public Producto(int idProducto, String nombre, double precio, Proveedor proveedores) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedores = proveedores;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Proveedor getProveedor() {
        return this.proveedores;
    }

    public int getIdProveedor() {
        return this.proveedores.getIdProveedor();
    }

    public String mostrarProducto() {
        return "ID Producto: " + this.idProducto + "\nNombre: " + this.nombre + "\nPrecio: " + this.precio;
    }


}
