package ProyectoVehiculos;

/*Define una clase abstracta Vehiculo que contenga los atributos comunes a
todos los vehículos (marca, modelo, año de fabricación, precio)
y un método abstracto calcularImpuesto() que calcule el impuesto
de circulación del vehículo. Esta clase debe encapsular adecuadamente
sus atributos.*/

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int annioFabricacion;
    private double precio;

    public Vehiculo(String marca, String modelo, int annioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.annioFabricacion = annioFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void calcularImpuesto();

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAño de fabricación: " + annioFabricacion +
                "\nPrecio: " + precio;
    }
}
