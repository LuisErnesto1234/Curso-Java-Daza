package org.daza.modelos;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private static int ultimoCodigo;

    public Producto() {
        this.id = ++ultimoCodigo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return id +
                "\t" + nombre +
                "\t" + precio;
    }
}