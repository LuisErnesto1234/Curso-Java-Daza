package src.domain;

import java.util.Date;

public class Fruta {
    private int idFruta;
    private String nombreFruta;
    private String colorFruta;
    private double precioUnitario;
    private int cantidad;
    private double precioTotal;
    private String fechaCreacion;

    public Fruta(int idFruta, String nombreFruta, String colorFruta, double precioUnitario, int cantidad, double precioTotal, String fechaCreacion) {
        this.idFruta = idFruta;
        this.nombreFruta = nombreFruta;
        this.colorFruta = colorFruta;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.fechaCreacion = fechaCreacion;
    }

    public Fruta(String nombreFruta, String colorFruta, double precioUnitario, int cantidad, double precioTotal, String fechaCreacion) {
        this.nombreFruta = nombreFruta;
        this.colorFruta = colorFruta;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.fechaCreacion = fechaCreacion;
    }

    public Fruta(){}

    //TODO: Getters and Setters

    public int getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(int idFruta) {
        this.idFruta = idFruta;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public String getColorFruta() {
        return colorFruta;
    }

    public void setColorFruta(String colorFruta) {
        this.colorFruta = colorFruta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Fruta{" + '\n' +
                "idFruta=" + idFruta + '\n' +
                ", nombreFruta='" + nombreFruta + '\n' +
                ", colorFruta='" + colorFruta + '\n' +
                ", precioUnitario=" + precioUnitario + '\n' +
                ", cantidad=" + cantidad + '\n' +
                ", precioTotal=" + precioTotal + '\n' +
                ", fechaCreacion=" + fechaCreacion + '\n' +
                '}';
    }
}
